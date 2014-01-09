/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class spray2d.layout.connection.DirectConnectionRouter
 *
 * @author Simon Schneeberger
 * @extend draw2d.layout.connections.DirectConnectionRouter
 */

var spray2d = spray2d || {};
spray2d.layout = spray2d.layout || {};
spray2d.layout.connection = spray2d.layout.connection || {};

spray2d.layout.connection.DirectRouter = draw2d.layout.connection.DirectRouter.extend({

    NAME : "spray2d.layout.connection.DirectRouter",

    /**
     * @constructor
     * Creates a new Router object
     */
    init: function(){
        this._super();
    },


    /**
     * @method
     * Routes the Connection.
     *
     * @param {draw2d.Connection} connection The Connection to route
     * @param {draw2d.util.ArrayList} oldJunctionPoints old/existing junction points of the Connection
     * @template
     */
    route:function( connection, oldJunctionPoints)
    {
        this._super(connection, oldJunctionPoints);
    },

    /**
     * @method
     * Callback method if the router has been assigned to a connection.
     *
     * @param {draw2d.Connection} connection The assigned connection
     * @template
     * @since 2.7.2
     */
    onInstall: function(connection)
    {
        var selectedConnection = $("#selectedConnection").val();
        var item = htwg.spray.classDefinitionByName[selectedConnection];
        if ( item.hasOwnProperty("connection") ){
        	connection.setUserData({"name":item.name});
            var shape = htwg.spray.shapeDefinitionByName[item.connection];
            if ( shape.hasOwnProperty("connectionType") && shape.connectionType == "manhatten" ){
                connection.setRouter(new spray2d.layout.connection.ManhattanConnectionRouter());
            }
            if ( shape.hasOwnProperty("placings") ){
                $.each(shape.placings, function(i,placing){
                    htwg.spray.connectionFactory.drawChild(placing, connection);
                });
            }

            if ( htwg.spray.utils.notifyEcore ){
                var source = connection.getSource().getParent();
                var target = connection.getTarget().getParent();
                var fromID = htwg.spray.utils.getIndexFromID(source.getId());
                var toID = htwg.spray.utils.getIndexFromID(target.getId());

                if ( fromID >= 0 && toID >= 0 ){
                    htwg.spray.websocketEcore.send({"type":"ecore",
                        "command":"createConnection",
                        "domainObj":item.name,
                        "fromObj":item.from,
                        "toObj":item.to,
                        "fromID":fromID.toString(),
                        "toID":toID.toString()});
                }
            }
        }
    },

    /**
     * @method
     * Callback method if the router has been removed from the connection.
     *
     * @param {draw2d.Connection} connection The related connection
     * @template
     * @since 2.7.2
     */
    onUninstall: function(connection)
    {
        if ( htwg.spray.utils.notifyEcore ){
            var userData = connection.getUserData();
            if ( userData.hasOwnProperty("name") ){
                var item = htwg.spray.classDefinitionByName[userData.name];
                var source = connection.getSource().getParent();
                var target = connection.getTarget().getParent();
                var fromID = htwg.spray.utils.getIndexFromID(source.getId());
                var toID = htwg.spray.utils.getIndexFromID(target.getId());

                if ( fromID >= 0 && toID >= 0 ){
                    htwg.spray.websocketEcore.send({"type":"ecore",
                                                    "command":"removeConnection",
                                                    "domainObj":item.name,
                                                    "fromObj":item.from,
                                                    "toObj":item.to,
                                                    "fromID":fromID.toString(),
                                                    "toID":toID.toString()});
                }
            }
        }
    },


    /**
     * @method
     * Tweak or enrich the polyline persistence data with routing information
     *
     * @since 2.10.0
     * @param {draw2d.shape.basic.PolyLine} line
     * @param {Object} memento The memento data of the polyline
     * @returns {Object}
     */
    getPersistentAttributes : function(line, memento)
    {
        return memento;
    },

    /**
     * @method
     * set the attributes for the polyline with routing information
     *
     * @since 2.10.0
     * @param {Object} memento the JSON data to read
     */
    setPersistentAttributes : function(line, memento)
    {
    }

});