package def.jqueryui.jqueryui;
import def.dom.Event;
import def.dom.Element;
@jsweet.lang.Interface
public abstract class SelectableEvents extends def.js.Object {
    native public void selected(Event event, Ui ui);
    native public void selecting(Event event, UiData ui);
    native public void start(Event event, Object ui);
    native public void stop(Event event, Object ui);
    native public void unselected(Event event, UiDto ui);
    native public void unselecting(Event event, UiStructure ui);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Ui extends def.js.Object {
        @jsweet.lang.Optional
        public Element selected;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class UiData extends def.js.Object {
        @jsweet.lang.Optional
        public Element selecting;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class UiDto extends def.js.Object {
        public Element unselected;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class UiStructure extends def.js.Object {
        public Element unselecting;
    }
}

