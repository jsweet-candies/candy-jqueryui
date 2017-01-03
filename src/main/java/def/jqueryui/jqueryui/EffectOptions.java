package def.jqueryui.jqueryui;
import def.js.Function;
@jsweet.lang.Interface
public abstract class EffectOptions extends def.js.Object {
    public String effect;
    @jsweet.lang.Optional
    public String easing;
    @jsweet.lang.Optional
    public double duration;
    public Function complete;
    native public java.lang.Object complete(java.lang.Object... args);
}

