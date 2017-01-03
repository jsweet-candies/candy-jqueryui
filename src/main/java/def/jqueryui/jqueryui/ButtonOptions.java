package def.jqueryui.jqueryui;
import def.dom.Event;
@jsweet.lang.Interface
public abstract class ButtonOptions extends def.js.Object {
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

