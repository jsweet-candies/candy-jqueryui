package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class SliderEvents extends def.js.Object {
    @jsweet.lang.Optional
    public SliderEvent change;
    @jsweet.lang.Optional
    public SliderEvent create;
    @jsweet.lang.Optional
    public SliderEvent slide;
    @jsweet.lang.Optional
    public SliderEvent start;
    @jsweet.lang.Optional
    public SliderEvent stop;
    native public void change(def.dom.Event event, def.jqueryui.jqueryui.SliderUIParams ui);
    native public void create(def.dom.Event event, def.jqueryui.jqueryui.SliderUIParams ui);
    native public void slide(def.dom.Event event, def.jqueryui.jqueryui.SliderUIParams ui);
    native public void start(def.dom.Event event, def.jqueryui.jqueryui.SliderUIParams ui);
    native public void stop(def.dom.Event event, def.jqueryui.jqueryui.SliderUIParams ui);
}

