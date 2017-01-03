package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class DroppableEvents extends def.js.Object {
    @jsweet.lang.Optional
    public DroppableEvent create;
    @jsweet.lang.Optional
    public DroppableEvent activate;
    @jsweet.lang.Optional
    public DroppableEvent deactivate;
    @jsweet.lang.Optional
    public DroppableEvent over;
    @jsweet.lang.Optional
    public DroppableEvent out;
    @jsweet.lang.Optional
    public DroppableEvent drop;
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.DroppableEventUIParam ui);
    native public void activate(def.dom.Event event, def.jqueryui.jqueryui.DroppableEventUIParam ui);
    native public void deactivate(def.dom.Event event, def.jqueryui.jqueryui.DroppableEventUIParam ui);
    native public void over(def.dom.Event event, def.jqueryui.jqueryui.DroppableEventUIParam ui);
    native public void out(def.dom.Event event, def.jqueryui.jqueryui.DroppableEventUIParam ui);
    native public void drop(def.dom.Event event, def.jqueryui.jqueryui.DroppableEventUIParam ui);
}

