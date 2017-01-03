package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class MenuEvents extends def.js.Object {
    @jsweet.lang.Optional
    public MenuEvent blur;
    @jsweet.lang.Optional
    public MenuEvent create;
    @jsweet.lang.Optional
    public MenuEvent focus;
    @jsweet.lang.Optional
    public MenuEvent select;
    native public void blur(def.dom.Event event, def.jqueryui.jqueryui.MenuUIParams ui);
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.MenuUIParams ui);
    native public void focus(def.dom.Event event, def.jqueryui.jqueryui.MenuUIParams ui);
    native public void select(def.dom.Event event, def.jqueryui.jqueryui.MenuUIParams ui);
}

