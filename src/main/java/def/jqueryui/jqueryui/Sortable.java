package def.jqueryui.jqueryui;
import def.dom.Event;
import def.dom.Element;
@jsweet.lang.Interface
@jsweet.lang.Extends({SortableOptions.class,SortableEvents.class})
public abstract class Sortable extends Widget {
    @jsweet.lang.Optional
    public Object appendTo;
    @jsweet.lang.Optional
    public String axis;
    @jsweet.lang.Optional
    public Object cancel;
    @jsweet.lang.Optional
    public Object connectWith;
    @jsweet.lang.Optional
    public Object containment;
    @jsweet.lang.Optional
    public String cursor;
    @jsweet.lang.Optional
    public Object cursorAt;
    @jsweet.lang.Optional
    public double delay;
    @jsweet.lang.Optional
    public Boolean disabled;
    @jsweet.lang.Optional
    public double distance;
    @jsweet.lang.Optional
    public Boolean dropOnEmpty;
    @jsweet.lang.Optional
    public Boolean forceHelperSize;
    @jsweet.lang.Optional
    public Boolean forcePlaceholderSize;
    @jsweet.lang.Optional
    public double[] grid;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,java.util.function.BiFunction<Event,Sortable,Element>> helper;
    @jsweet.lang.Optional
    public Object handle;
    @jsweet.lang.Optional
    public Object items;
    @jsweet.lang.Optional
    public double opacity;
    @jsweet.lang.Optional
    public String placeholder;
    @jsweet.lang.Optional
    public Object revert;
    @jsweet.lang.Optional
    public Boolean scroll;
    @jsweet.lang.Optional
    public double scrollSensitivity;
    @jsweet.lang.Optional
    public double scrollSpeed;
    @jsweet.lang.Optional
    public String tolerance;
    @jsweet.lang.Optional
    public double zIndex;
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

