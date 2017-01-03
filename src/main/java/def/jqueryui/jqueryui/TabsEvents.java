package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class TabsEvents extends def.js.Object {
    @jsweet.lang.Optional
    public TabsEvent<TabsActivationUIParams> activate;
    @jsweet.lang.Optional
    public TabsEvent<TabsActivationUIParams> beforeActivate;
    @jsweet.lang.Optional
    public TabsEvent<TabsBeforeLoadUIParams> beforeLoad;
    @jsweet.lang.Optional
    public TabsEvent<TabsCreateOrLoadUIParams> load;
    @jsweet.lang.Optional
    public TabsEvent<TabsCreateOrLoadUIParams> create;
    native public void activate(def.dom.Event event, def.jqueryui.jqueryui.UI ui);
    native public void beforeActivate(def.dom.Event event, def.jqueryui.jqueryui.UI ui);
    native public void beforeLoad(def.dom.Event event, def.jqueryui.jqueryui.UI ui);
    native public void load(def.dom.Event event, def.jqueryui.jqueryui.UI ui);
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.UI ui);
}

