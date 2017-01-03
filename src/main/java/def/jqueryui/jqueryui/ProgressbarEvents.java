package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class ProgressbarEvents extends def.js.Object {
    @jsweet.lang.Optional
    public ProgressbarEvent change;
    @jsweet.lang.Optional
    public ProgressbarEvent complete;
    @jsweet.lang.Optional
    public ProgressbarEvent create;
    native public void change(def.dom.Event event, def.jqueryui.jqueryui.ProgressbarUIParams ui);
    native public void complete(def.dom.Event event, def.jqueryui.jqueryui.ProgressbarUIParams ui);
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.ProgressbarUIParams ui);
}

