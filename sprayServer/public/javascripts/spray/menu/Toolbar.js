var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.Toolbar = function($){

    if ( jQuery('#toolbar').length === 0 ) {
        //no need to initialize
        return false;
    };

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    this.menu = jQuery("#toolbar");

    this.view = htwg.spray.view;

    this.initialize = function(){

        // register this class as event listener for the canvas
        // CommandStack. This is required to update the state of
        // the Undo/Redo Buttons.
        //
        //htwg.spray.view.getCommandStack().addEventListener(this);

        // Register a Selection listener for the state handling
        // of the Delete Button
        //
        //htwg.spray.view.addSelectionListener(this);

        // Inject the UNDO Button and the callbacks
        //
        this.undoButton  = $("#undo");
        this.undoButton.click($.proxy(function(){
            that.view.getCommandStack().undo();
        },this));

        // Inject the REDO Button and the callback
        //
        this.redoButton  = $("#redo");
        this.redoButton.click($.proxy(function(){
            that.view.getCommandStack().redo();
        },this));

        // Inject the SAVE Button and the callback
        //
        this.saveButton  = $("#save");
        this.saveButton.click($.proxy(function(){
            that.view.getModel();
        },this));

        // Inject the SAVE Button and the callback
        //
        this.loadButton  = $("#load");
        this.loadButton.click($.proxy(function(){
            that.view.setModel();
        },this));

    };

    this.initialize();
};