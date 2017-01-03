package def.jqueryui.jqueryui;
import def.jquery.JQueryEventObject;
@jsweet.lang.Interface
public abstract class DialogButtonOptions extends def.js.Object {
    @jsweet.lang.Optional
    public Object icons;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Boolean> showText;
    @jsweet.lang.Optional
    public String text;
    @jsweet.lang.Optional
    public java.util.function.Function<JQueryEventObject,Object> click;
    native public java.lang.Object $get(String attr);
}

