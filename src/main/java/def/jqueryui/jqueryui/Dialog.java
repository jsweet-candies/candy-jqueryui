package def.jqueryui.jqueryui;
import def.dom.Event;
@jsweet.lang.Interface
@jsweet.lang.Extends({DialogOptions.class})
public abstract class Dialog extends Widget {
    @jsweet.lang.Optional
    public Boolean autoOpen;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Buttons,DialogButtonOptions[]> buttons;
    @jsweet.lang.Optional
    public Boolean closeOnEscape;
    @jsweet.lang.Optional
    public String closeText;
    @jsweet.lang.Optional
    public String appendTo;
    @jsweet.lang.Optional
    public String dialogClass;
    @jsweet.lang.Optional
    public Boolean disabled;
    @jsweet.lang.Optional
    public Boolean draggable;
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Double,String> height;
    @jsweet.lang.Optional
    public Object hide;
    @jsweet.lang.Optional
    public double maxHeight;
    @jsweet.lang.Optional
    public double maxWidth;
    @jsweet.lang.Optional
    public double minHeight;
    @jsweet.lang.Optional
    public double minWidth;
    @jsweet.lang.Optional
    public Boolean modal;
    @jsweet.lang.Optional
    public Object position;
    @jsweet.lang.Optional
    public Boolean resizable;
    @jsweet.lang.Optional
    public Object show;
    @jsweet.lang.Optional
    public Boolean stack;
    @jsweet.lang.Optional
    public String title;
    @jsweet.lang.Optional
    public Object width;
    @jsweet.lang.Optional
    public double zIndex;
    @jsweet.lang.Optional
    public DialogEvent open;
    @jsweet.lang.Optional
    public DialogEvent close;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Buttons extends def.js.Object {
        native public java.util.function.Consumer<Event> $get(String buttonText);
    }
    native public void open(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
    native public void close(def.dom.Event event, def.jqueryui.jqueryui.DialogUIParams ui);
}

