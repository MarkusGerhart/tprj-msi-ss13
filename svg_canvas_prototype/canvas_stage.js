/**
 * This script contains the presentation.
 *
 * @author sischnee <sischnee@gmail.com>
 * @since 2012/21/11
 */
var WBOARD = WBOARD || {};
WBOARD.htwg = WBOARD.htwg || {};

WBOARD.htwg.Stage = function(selector) {

    if ( $("#prototype").length == 0 ){
        return false;
    }

    this.stage = null;
    this.stageLayer = null;

    /**
     * Scope duplicator / parent this.
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    /**
     * Init method, loads a new stage with the canvas element in the website.
     *
     * @access public
     * @return void
     */
    this.init = function(){
        this.stage = new Kinetic.Stage({
            container: 'board',
            width: 700,
            height: 435,
            listening: true
        });

        this.stageLayer = new Kinetic.Layer();
        /*var rect = new Kinetic.Rect({
            x: 0,
            y: 0,
            width: this.stage.getWidth(),
            height: this.stage.getHeight()
        });

        this.stageLayer.add(rect);*/
        this.stage.add(this.stageLayer);
    };


    this.init();
}