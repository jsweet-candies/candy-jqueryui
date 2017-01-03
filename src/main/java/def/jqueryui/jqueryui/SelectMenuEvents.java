package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class SelectMenuEvents extends def.js.Object {
    @jsweet.lang.Optional
    public SelectMenuEvent change;
    @jsweet.lang.Optional
    public SelectMenuEvent close;
    @jsweet.lang.Optional
    public SelectMenuEvent create;
    @jsweet.lang.Optional
    public SelectMenuEvent focus;
    @jsweet.lang.Optional
    public SelectMenuEvent open;
    @jsweet.lang.Optional
    public SelectMenuEvent select;
    native public void change(def.dom.Event event, def.jqueryui.jqueryui.SelectMenuUIParams ui);
    native public void close(def.dom.Event event, def.jqueryui.jqueryui.SelectMenuUIParams ui);
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.SelectMenuUIParams ui);
    native public void focus(def.dom.Event event, def.jqueryui.jqueryui.SelectMenuUIParams ui);
    native public void open(def.dom.Event event, def.jqueryui.jqueryui.SelectMenuUIParams ui);
    native public void select(def.dom.Event event, def.jqueryui.jqueryui.SelectMenuUIParams ui);
}

