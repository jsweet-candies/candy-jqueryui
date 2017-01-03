package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class AutocompleteEvents extends def.js.Object {
    @jsweet.lang.Optional
    public AutocompleteEvent change;
    @jsweet.lang.Optional
    public AutocompleteEvent close;
    @jsweet.lang.Optional
    public AutocompleteEvent create;
    @jsweet.lang.Optional
    public AutocompleteEvent focus;
    @jsweet.lang.Optional
    public AutocompleteEvent open;
    @jsweet.lang.Optional
    public AutocompleteEvent response;
    @jsweet.lang.Optional
    public AutocompleteEvent search;
    @jsweet.lang.Optional
    public AutocompleteEvent select;
    native public void change(def.dom.Event event, def.jqueryui.jqueryui.AutocompleteUIParams ui);
    native public void close(def.dom.Event event, def.jqueryui.jqueryui.AutocompleteUIParams ui);
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.AutocompleteUIParams ui);
    native public void focus(def.dom.Event event, def.jqueryui.jqueryui.AutocompleteUIParams ui);
    native public void open(def.dom.Event event, def.jqueryui.jqueryui.AutocompleteUIParams ui);
    native public void response(def.dom.Event event, def.jqueryui.jqueryui.AutocompleteUIParams ui);
    native public void search(def.dom.Event event, def.jqueryui.jqueryui.AutocompleteUIParams ui);
    native public void select(def.dom.Event event, def.jqueryui.jqueryui.AutocompleteUIParams ui);
}

