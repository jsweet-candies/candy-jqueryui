package def.jqueryui.jqueryui;
import def.jqueryui.JQuery;
@jsweet.lang.Interface
public abstract class DroppableEventUIParam extends def.js.Object {
    public JQuery draggable;
    public JQuery helper;
    public Position position;
    public Offset offset;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Position extends def.js.Object {
        public double top;
        public double left;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Offset extends def.js.Object {
        public double top;
        public double left;
    }
}

