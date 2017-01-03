package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class TooltipEvents extends def.js.Object {
    @jsweet.lang.Optional
    public TooltipEvent close;
    @jsweet.lang.Optional
    public TooltipEvent open;
    native public void close(def.dom.Event event, def.jqueryui.jqueryui.TooltipUIParams ui);
    native public void open(def.dom.Event event, def.jqueryui.jqueryui.TooltipUIParams ui);
}

