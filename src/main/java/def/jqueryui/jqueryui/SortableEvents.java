package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class SortableEvents extends def.js.Object {
    @jsweet.lang.Optional
    public SortableEvent activate;
    @jsweet.lang.Optional
    public SortableEvent beforeStop;
    @jsweet.lang.Optional
    public SortableEvent change;
    @jsweet.lang.Optional
    public SortableEvent deactivate;
    @jsweet.lang.Optional
    public SortableEvent out;
    @jsweet.lang.Optional
    public SortableEvent over;
    @jsweet.lang.Optional
    public SortableEvent receive;
    @jsweet.lang.Optional
    public SortableEvent remove;
    @jsweet.lang.Optional
    public SortableEvent sort;
    @jsweet.lang.Optional
    public SortableEvent start;
    @jsweet.lang.Optional
    public SortableEvent stop;
    @jsweet.lang.Optional
    public SortableEvent update;
    native public void activate(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void beforeStop(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void change(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void deactivate(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void out(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void over(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void receive(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void remove(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void sort(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void start(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void stop(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
    native public void update(def.jquery.JQueryEventObject event, def.jqueryui.jqueryui.SortableUIParams ui);
}

