package def.jqueryui.jqueryui;
import def.dom.Event;
import def.dom.Element;
@jsweet.lang.Interface
public abstract class SortableOptions extends SortableEvents {
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
}

