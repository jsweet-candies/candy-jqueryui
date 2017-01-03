package def.jqueryui.jqueryui;
@jsweet.lang.Interface
@jsweet.lang.Extends({ProgressbarOptions.class})
public abstract class Progressbar extends Widget {
    @jsweet.lang.Optional
    public Boolean disabled;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,Boolean> value;
    @jsweet.lang.Optional
    public double max;
}

