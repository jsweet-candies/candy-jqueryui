package def.jqueryui;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.jquery.JQueryStatic.class)
public abstract class JQueryStatic extends def.jquery.JQueryStatic {
    public def.jqueryui.jqueryui.UI ui;
    public def.jqueryui.jqueryui.Datepicker datepicker;
    public def.jqueryui.jqueryui.Widget widget;
    public def.jqueryui.jqueryui.Widget Widget;
    native public def.jqueryui.JQuery widget(java.lang.String methodName);
    native public def.jqueryui.JQuery widget(def.jqueryui.jqueryui.WidgetOptions options);
    native public def.jqueryui.JQuery widget(def.jqueryui.jqueryui.AccordionOptions options);
    native public Object widget(java.lang.String optionLiteral, java.lang.String optionName);
    native public Object widget(java.lang.String optionLiteral, def.jqueryui.jqueryui.WidgetOptions options);
    native public def.jqueryui.JQuery widget(java.lang.String optionLiteral, java.lang.String optionName, Object optionValue);
    native public def.jqueryui.JQuery widget(java.lang.String name, Object prototype);
    native public def.jqueryui.JQuery widget(java.lang.String name, def.js.Function base, Object prototype);
    native public def.jqueryui.JQuery Widget(java.lang.String methodName);
    native public def.jqueryui.JQuery Widget(def.jqueryui.jqueryui.WidgetOptions options);
    native public def.jqueryui.JQuery Widget(def.jqueryui.jqueryui.AccordionOptions options);
    native public Object Widget(java.lang.String optionLiteral, java.lang.String optionName);
    native public Object Widget(java.lang.String optionLiteral, def.jqueryui.jqueryui.WidgetOptions options);
    native public def.jqueryui.JQuery Widget(java.lang.String optionLiteral, java.lang.String optionName, Object optionValue);
    native public def.jqueryui.JQuery Widget(java.lang.String name, Object prototype);
    native public def.jqueryui.JQuery Widget(java.lang.String name, def.js.Function base, Object prototype);
}

