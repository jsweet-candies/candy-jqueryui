package def.jqueryui.jqueryui;
@jsweet.lang.Interface
@jsweet.lang.Extends({AutocompleteOptions.class})
public abstract class Autocomplete extends Widget {
    public java.util.function.Function<String,String> escapeRegex;
    public java.util.function.BiFunction<Object,String,Object> filter;
    @jsweet.lang.Optional
    public Object appendTo;
    @jsweet.lang.Optional
    public Boolean autoFocus;
    @jsweet.lang.Optional
    public double delay;
    @jsweet.lang.Optional
    public Boolean disabled;
    @jsweet.lang.Optional
    public double minLength;
    @jsweet.lang.Optional
    public Object position;
    @jsweet.lang.Optional
    public Object source;
}

