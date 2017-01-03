package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class DraggableEvents extends def.js.Object {
    @jsweet.lang.Optional
    public DraggableEvent create;
    @jsweet.lang.Optional
    public DraggableEvent start;
    @jsweet.lang.Optional
    public DraggableEvent drag;
    @jsweet.lang.Optional
    public DraggableEvent stop;
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.DraggableEventUIParams ui);
    native public void start(def.dom.Event event, def.jqueryui.jqueryui.DraggableEventUIParams ui);
    native public void drag(def.dom.Event event, def.jqueryui.jqueryui.DraggableEventUIParams ui);
    native public void stop(def.dom.Event event, def.jqueryui.jqueryui.DraggableEventUIParams ui);
}

