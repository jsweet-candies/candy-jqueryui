package def.jqueryui.jqueryui;
import def.jqueryui.JQuery;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Widget extends def.js.Object {
    native public JQuery $apply(String methodName);
    native public JQuery $apply(WidgetOptions options);
    native public JQuery $apply(AccordionOptions options);
    native public Object $apply(String optionLiteral, String optionName);
    native public Object $apply(String optionLiteral, WidgetOptions options);
    native public JQuery $apply(String optionLiteral, String optionName, Object optionValue);
    native public JQuery $apply(String name, Object prototype);
    native public JQuery $apply(String name, Function base, Object prototype);
}

