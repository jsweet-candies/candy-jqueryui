package def.jqueryui.jqueryui;
import def.jqueryui.JQuery;
@jsweet.lang.Interface
public abstract class UI extends def.js.Object {
    native public JQuery mouse(String method);
    native public JQuery mouse(MouseOptions options);
    native public JQuery mouse(String optionLiteral, String optionName, Object optionValue);
    native public Object mouse(String optionLiteral, Object optionValue);
    public Accordion accordion;
    public Autocomplete autocomplete;
    public Button button;
    public Button buttonset;
    public Datepicker datepicker;
    public Dialog dialog;
    public KeyCode keyCode;
    public Menu menu;
    public Progressbar progressbar;
    public Slider slider;
    public Spinner spinner;
    public Tabs tabs;
    public Tooltip tooltip;
    public String version;
}

