package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class ResizableEvents extends def.js.Object {
    @jsweet.lang.Optional
    public ResizableEvent resize;
    @jsweet.lang.Optional
    public ResizableEvent start;
    @jsweet.lang.Optional
    public ResizableEvent stop;
    @jsweet.lang.Optional
    public ResizableEvents create;
    native public void resize(def.dom.Event event, def.jqueryui.jqueryui.ResizableUIParams ui);
    native public void start(def.dom.Event event, def.jqueryui.jqueryui.ResizableUIParams ui);
    native public void stop(def.dom.Event event, def.jqueryui.jqueryui.ResizableUIParams ui);
}

