package def.jqueryui.jqueryui;
import def.dom.Event;
@jsweet.lang.Interface
@jsweet.lang.Extends({ButtonOptions.class})
public abstract class Button extends Widget {
    @jsweet.lang.Optional
    public Boolean disabled;
    @jsweet.lang.Optional
    public Object icons;
    @jsweet.lang.Optional
    public String label;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Boolean> text;
    @jsweet.lang.Optional
    public java.util.function.Consumer<Event> click;
}

