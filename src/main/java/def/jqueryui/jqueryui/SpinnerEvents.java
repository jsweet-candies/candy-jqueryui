package def.jqueryui.jqueryui;
@jsweet.lang.Interface
public abstract class SpinnerEvents extends def.js.Object {
    @jsweet.lang.Optional
    public SpinnerEvent<java.lang.Object> change;
    @jsweet.lang.Optional
    public SpinnerEvent<java.lang.Object> create;
    @jsweet.lang.Optional
    public SpinnerEvent<SpinnerUIParam> spin;
    @jsweet.lang.Optional
    public SpinnerEvent<java.lang.Object> start;
    @jsweet.lang.Optional
    public SpinnerEvent<java.lang.Object> stop;
    native public void change(def.dom.Event event, java.lang.Object ui);
    native public void create(def.dom.Event event, java.lang.Object ui);
    native public void spin(def.dom.Event event, SpinnerUIParam ui);
    native public void start(def.dom.Event event, java.lang.Object ui);
    native public void stop(def.dom.Event event, java.lang.Object ui);
}

