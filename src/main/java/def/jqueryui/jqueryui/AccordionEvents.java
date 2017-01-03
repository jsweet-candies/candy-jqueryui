package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class AccordionEvents extends def.js.Object {
    @jsweet.lang.Optional
    public AccordionEvent activate;
    @jsweet.lang.Optional
    public AccordionEvent beforeActivate;
    @jsweet.lang.Optional
    public AccordionEvent create;
    native public void activate(def.dom.Event event, def.jqueryui.jqueryui.AccordionUIParams ui);
    native public void beforeActivate(def.dom.Event event, def.jqueryui.jqueryui.AccordionUIParams ui);
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.AccordionUIParams ui);
}

