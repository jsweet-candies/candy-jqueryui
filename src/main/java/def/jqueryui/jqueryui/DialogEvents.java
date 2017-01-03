package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class DialogEvents extends def.js.Object {
    @jsweet.lang.Optional
    public DialogEvent beforeClose;
    @jsweet.lang.Optional
    public DialogEvent close;
    @jsweet.lang.Optional
    public DialogEvent create;
    @jsweet.lang.Optional
    public DialogEvent drag;
    @jsweet.lang.Optional
    public DialogEvent dragStart;
    @jsweet.lang.Optional
    public DialogEvent dragStop;
    @jsweet.lang.Optional
    public DialogEvent focus;
    @jsweet.lang.Optional
    public DialogEvent open;
    @jsweet.lang.Optional
    public DialogEvent resize;
    @jsweet.lang.Optional
    public DialogEvent resizeStart;
    @jsweet.lang.Optional
    public DialogEvent resizeStop;
    native public void beforeClose(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void close(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void drag(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void dragStart(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void dragStop(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void focus(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void open(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void resize(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void resizeStart(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void resizeStop(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
}

