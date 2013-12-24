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
        $.each(htwg.spray.classDefinition, function(i, item) {
            if ( item.name == selectedConnection && item.hasOwnProperty("connection") ){
                connection.setUserData({"name":item.name});
                var connectionShape = item.connection;
                $.each(htwg.spray.shapeDefinition, function(i, shape) {
                    if ( shape.name == connectionShape ){
                        if ( shape.hasOwnProperty("connectionType") && shape.connectionType == "manhatten" ){
                            connection.setRouter(new spray2d.layout.connection.ManhattanConnectionRouter());
                        }

                        if ( shape.hasOwnProperty("placings") ){
                            $.each(shape.placings, function(i,placing){
                                htwg.spray.connectionFactory.drawChild(placing, connection);
                            });
                        }
                    }
                });
            }
        });
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