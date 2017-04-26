package def.jqueryui;
import def.js.Array;
import def.dom.MouseEvent;
import def.js.RegExp;
import def.js.Date;
import def.dom.Element;
import def.jquery.JQueryEventObject;
import def.js.Function;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.jquery.JQuery.class)
public abstract class JQuery extends def.jquery.JQuery {
    native public JQuery accordion();
    native public void accordion(def.jqueryui.StringTypes.destroy methodName);
    native public void accordion(def.jqueryui.StringTypes.disable methodName);
    native public void accordion(def.jqueryui.StringTypes.enable methodName);
    native public void accordion(def.jqueryui.StringTypes.refresh methodName);
    native public JQuery accordion(def.jqueryui.StringTypes.widget methodName);
    native public JQuery accordion(String methodName);
    native public JQuery accordion(def.jqueryui.jqueryui.AccordionOptions options);
    native public Object accordion(String optionLiteral, String optionName);
    native public Object accordion(String optionLiteral, def.jqueryui.jqueryui.AccordionOptions options);
    native public JQuery accordion(String optionLiteral, String optionName, Object optionValue);
    native public JQuery autocomplete();
    native public void autocomplete(def.jqueryui.StringTypes.close methodName);
    native public void autocomplete(def.jqueryui.StringTypes.destroy methodName);
    native public void autocomplete(def.jqueryui.StringTypes.disable methodName);
    native public void autocomplete(def.jqueryui.StringTypes.enable methodName);
    native public void autocomplete(def.jqueryui.StringTypes.search methodName, String value);
    native public JQuery autocomplete(def.jqueryui.StringTypes.widget methodName);
    native public JQuery autocomplete(String methodName);
    native public JQuery autocomplete(def.jqueryui.jqueryui.AutocompleteOptions options);
    native public Object autocomplete(String optionLiteral, String optionName);
    native public Object autocomplete(String optionLiteral, def.jqueryui.jqueryui.AutocompleteOptions options);
    native public JQuery autocomplete(String optionLiteral, String optionName, Object optionValue);
    native public JQuery button();
    native public void button(def.jqueryui.StringTypes.destroy methodName);
    native public void button(def.jqueryui.StringTypes.disable methodName);
    native public void button(def.jqueryui.StringTypes.enable methodName);
    native public void button(def.jqueryui.StringTypes.refresh methodName);
    native public JQuery button(def.jqueryui.StringTypes.widget methodName);
    native public JQuery button(String methodName);
    native public JQuery button(def.jqueryui.jqueryui.ButtonOptions options);
    native public Object button(String optionLiteral, String optionName);
    native public Object button(String optionLiteral, def.jqueryui.jqueryui.ButtonOptions options);
    native public JQuery button(String optionLiteral, String optionName, Object optionValue);
    native public JQuery buttonset();
    native public void buttonset(def.jqueryui.StringTypes.destroy methodName);
    native public void buttonset(def.jqueryui.StringTypes.disable methodName);
    native public void buttonset(def.jqueryui.StringTypes.enable methodName);
    native public void buttonset(def.jqueryui.StringTypes.refresh methodName);
    native public JQuery buttonset(def.jqueryui.StringTypes.widget methodName);
    native public JQuery buttonset(String methodName);
    native public JQuery buttonset(def.jqueryui.jqueryui.ButtonOptions options);
    native public Object buttonset(String optionLiteral, String optionName);
    native public Object buttonset(String optionLiteral, def.jqueryui.jqueryui.ButtonOptions options);
    native public JQuery buttonset(String optionLiteral, String optionName, Object optionValue);
    /**
     * Initialize a datepicker
     */
    native public JQuery datepicker();
    /**
     * Removes the datepicker functionality completely. This will return the element back to its pre-init state.
     *
     * @param methodName 'destroy'
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.destroy methodName);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, Date date, java.lang.Runnable onSelect, def.jqueryui.jqueryui.DatepickerOptions settings, double[] pos);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, Date date, java.lang.Runnable onSelect, def.jqueryui.jqueryui.DatepickerOptions settings, MouseEvent pos);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, String date, java.lang.Runnable onSelect, def.jqueryui.jqueryui.DatepickerOptions settings, double[] pos);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, String date, java.lang.Runnable onSelect, def.jqueryui.jqueryui.DatepickerOptions settings, MouseEvent pos);
    /**
     * Returns the current date for the datepicker or null if no date has been selected.
     *
     * @param methodName 'getDate'
     */
    native public Date datepicker(def.jqueryui.StringTypes.getDate methodName);
    /**
     * Close a previously opened date picker.
     *
     * @param methodName 'hide'
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.hide methodName);
    /**
     * Determine whether a date picker has been disabled.
     *
     * @param methodName 'isDisabled'
     */
    native public Boolean datepicker(def.jqueryui.StringTypes.isDisabled methodName);
    /**
     * Redraw the date picker, after having made some external modifications.
     *
     * @param methodName 'refresh'
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.refresh methodName);
    /**
     * Sets the date for the datepicker. The new date may be a Date object or a string in the current date format (e.g., "01/26/2009"), a number of days from today (e.g., +7) or a string of values and periods ("y" for years, "m" for months, "w" for weeks, "d" for days, e.g., "+1m +7d"), or null to clear the selected date.
     *
     * @param methodName 'setDate'
     * @param date The new date.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.setDate methodName, Date date);
    /**
     * Sets the date for the datepicker. The new date may be a Date object or a string in the current date format (e.g., "01/26/2009"), a number of days from today (e.g., +7) or a string of values and periods ("y" for years, "m" for months, "w" for weeks, "d" for days, e.g., "+1m +7d"), or null to clear the selected date.
     *
     * @param methodName 'setDate'
     * @param date The new date.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.setDate methodName, String date);
    /**
     * Open the date picker. If the datepicker is attached to an input, the input must be visible for the datepicker to be shown.
     *
     * @param methodName 'show'
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.show methodName);
    /**
     * Returns a jQuery object containing the datepicker.
     *
     * @param methodName 'widget'
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.widget methodName);
    /**
     * Get the altField option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'altField'
     */
    native public Object datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.altField optionName);
    /**
     * Set the altField option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'altField'
     * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.altField optionName, String altFieldValue);
    /**
     * Set the altField option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'altField'
     * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.altField optionName, JQuery altFieldValue);
    /**
     * Set the altField option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'altField'
     * @param altFieldValue An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.altField optionName, Element altFieldValue);
    /**
     * Get the altFormat option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'altFormat'
     */
    native public String datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.altFormat optionName);
    /**
     * Set the altFormat option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'altFormat'
     * @param altFormatValue The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes, while a different format is actually sent behind the scenes. For a full list of the possible formats see the formatDate function
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.altFormat optionName, String altFormatValue);
    /**
     * Get the appendText option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'appendText'
     */
    native public String datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.appendText optionName);
    /**
     * Set the appendText option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'appendText'
     * @param appendTextValue The text to display after each date field, e.g., to show the required format.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.appendText optionName, String appendTextValue);
    /**
     * Get the autoSize option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'autoSize'
     */
    native public Boolean datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.autoSize optionName);
    /**
     * Set the autoSize option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'autoSize'
     * @param autoSizeValue Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.autoSize optionName, Boolean autoSizeValue);
    /**
     * Get the beforeShow option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'beforeShow'
     */
    native public java.util.function.BiFunction<Element,Object,def.jqueryui.jqueryui.DatepickerOptions> datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.beforeShow optionName);
    /**
     * Set the beforeShow option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'beforeShow'
     * @param beforeShowValue A function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.beforeShow optionName, java.util.function.BiFunction<Element,Object,def.jqueryui.jqueryui.DatepickerOptions> beforeShowValue);
    /**
     * Get the beforeShow option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'beforeShowDay'
     */
    native public java.util.function.Function<Date,Object[]> datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.beforeShowDay optionName);
    /**
     * Set the beforeShow option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'beforeShowDay'
     * @param beforeShowDayValue A function that takes a date as a parameter and must return an array with:
     * [0]: true/false indicating whether or not this date is selectable
     * [1]: a CSS class name to add to the date's cell or "" for the default presentation
     * [2]: an optional popup tooltip for this date
     * The function is called for each day in the datepicker before it is displayed.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.beforeShowDay optionName, java.util.function.Function<Date,Object[]> beforeShowDayValue);
    /**
     * Get the buttonImage option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'buttonImage'
     */
    native public String datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.buttonImage optionName);
    /**
     * Set the buttonImage option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'buttonImage'
     * @param buttonImageValue A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText option becomes the alt value and is not directly displayed.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.buttonImage optionName, String buttonImageValue);
    /**
     * Get the buttonImageOnly option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'buttonImageOnly'
     */
    native public Boolean datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.buttonImageOnly optionName);
    /**
     * Set the buttonImageOnly option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'buttonImageOnly'
     * @param buttonImageOnlyValue Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the buttonImage option has also been set.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.buttonImageOnly optionName, Boolean buttonImageOnlyValue);
    /**
     * Get the buttonText option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'buttonText'
     */
    native public String datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.buttonText optionName);
    /**
      * Get the autohide option, after initialization
      *
      * @param methodName 'option'
      * @param optionName 'autohide'
      */
    native public Boolean datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.autohide optionName);
    /**
      * Get the endDate after initialization
      *
      * @param methodName 'option'
      * @param optionName 'endDate'
      */
    native public Date datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.endDate optionName);
    /**
     * Set the buttonText option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'buttonText'
     * @param buttonTextValue The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.buttonText optionName, String buttonTextValue);
    /**
     * Get the calculateWeek option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'calculateWeek'
     */
    native public java.util.function.Function<Date,String> datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.calculateWeek optionName);
    /**
     * Set the calculateWeek option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'calculateWeek'
     * @param calculateWeekValue A function to calculate the week of the year for a given date. The default implementation uses the ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday of the year.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.calculateWeek optionName, java.util.function.Function<Date,String> calculateWeekValue);
    /**
     * Get the changeMonth option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'changeMonth'
     */
    native public Boolean datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.changeMonth optionName);
    /**
     * Set the changeMonth option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'changeMonth'
     * @param changeMonthValue Whether the month should be rendered as a dropdown instead of text.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.changeMonth optionName, Boolean changeMonthValue);
    /**
     * Get the changeYear option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'changeYear'
     */
    native public Boolean datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.changeYear optionName);
    /**
     * Set the changeYear option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'changeYear'
     * @param changeYearValue Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made available for selection.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.changeYear optionName, Boolean changeYearValue);
    /**
     * Get the closeText option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'closeText'
     */
    native public String datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.closeText optionName);
    /**
     * Set the closeText option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'closeText'
     * @param closeTextValue The text to display for the close link. Use the showButtonPanel option to display this button.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.closeText optionName, String closeTextValue);
    /**
     * Get the constrainInput option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'constrainInput'
     */
    native public Boolean datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.constrainInput optionName);
    /**
     * Set the constrainInput option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'constrainInput'
     * @param constrainInputValue When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.constrainInput optionName, Boolean constrainInputValue);
    /**
     * Get the currentText option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'currentText'
     */
    native public String datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.currentText optionName);
    /**
     * Set the currentText option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'currentText'
     * @param currentTextValue The text to display for the current day link. Use the showButtonPanel option to display this button.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.currentText optionName, String currentTextValue);
    /**
     * Get the dateFormat option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'dateFormat'
     */
    native public String datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.dateFormat optionName);
    /**
     * Set the dateFormat option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'dateFormat'
     * @param dateFormatValue The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.dateFormat optionName, String dateFormatValue);
    /**
     * Get the dayNames option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'dayNames'
     */
    native public String[] datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.dayNames optionName);
    /**
     * Set the dayNames option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'dayNames'
     * @param dayNamesValue The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.dayNames optionName, String[] dayNamesValue);
    /**
     * Get the dayNamesMin option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'dayNamesMin'
     */
    native public String[] datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.dayNamesMin optionName);
    /**
     * Set the dayNamesMin option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'dayNamesMin'
     * @param dayNamesMinValue The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.dayNamesMin optionName, String[] dayNamesMinValue);
    /**
     * Get the dayNamesShort option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'dayNamesShort'
     */
    native public String[] datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.dayNamesShort optionName);
    /**
     * Set the dayNamesShort option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'dayNamesShort'
     * @param dayNamesShortValue The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.dayNamesShort optionName, String[] dayNamesShortValue);
    /**
     * Get the defaultDate option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'defaultDate'
     */
    native public Object datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.defaultDate optionName);
    /**
     * Set the defaultDate option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'defaultDate'
     * @param defaultDateValue A date object containing the default date.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.defaultDate optionName, Date defaultDateValue);
    /**
     * Set the defaultDate option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'defaultDate'
     * @param defaultDateValue A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.defaultDate optionName, double defaultDateValue);
    /**
     * Set the defaultDate option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'defaultDate'
     * @param defaultDateValue A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.defaultDate optionName, String defaultDateValue);
    /**
     * Get the duration option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'duration'
     */
    native public String datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.duration optionName);
    /**
     * Set the duration option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'duration'
     * @param durationValue Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three predefined speeds ("slow", "normal", "fast").
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.duration optionName, String durationValue);
    /**
     * Get the firstDay option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'firstDay'
     */
    native public double datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.firstDay optionName);
    /**
     * Set the firstDay option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'firstDay'
     * @param firstDayValue Set the first day of the week: Sunday is 0, Monday is 1, etc.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.firstDay optionName, double firstDayValue);
    /**
     * Get the gotoCurrent option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'gotoCurrent'
     */
    native public Boolean datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.gotoCurrent optionName);
    /**
     * Set the gotoCurrent option, after initialization
     *
     * @param methodName 'option'
     * @param optionName 'gotoCurrent'
     * @param gotoCurrentValue When true, the current day link moves to the currently selected date instead of today.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.option methodName, def.jqueryui.StringTypes.gotoCurrent optionName, Boolean gotoCurrentValue);
    /**
     * Gets the value currently associated with the specified optionName.
     *
     * @param methodName 'option'
     * @param optionName The name of the option to get.
     */
    native public Object datepicker(def.jqueryui.StringTypes.option methodName, String optionName);
    native public Object datepicker(def.jqueryui.StringTypes.option methodName, String optionName, Object... otherParams);
    native public Object datepicker(String methodName, Object... otherParams);
    /**
     * Initialize a datepicker with the given options
     */
    native public JQuery datepicker(def.jqueryui.jqueryui.DatepickerOptions options);
    native public JQuery dialog();
    native public JQuery dialog(def.jqueryui.StringTypes.close methodName);
    native public JQuery dialog(def.jqueryui.StringTypes.destroy methodName);
    native public Boolean dialog(def.jqueryui.StringTypes.isOpen methodName);
    native public JQuery dialog(def.jqueryui.StringTypes.moveToTop methodName);
    native public JQuery dialog(def.jqueryui.StringTypes.open methodName);
    native public JQuery dialog(def.jqueryui.StringTypes.widget methodName);
    native public JQuery dialog(String methodName);
    native public JQuery dialog(def.jqueryui.jqueryui.DialogOptions options);
    native public Object dialog(String optionLiteral, String optionName);
    native public Object dialog(String optionLiteral, def.jqueryui.jqueryui.DialogOptions options);
    native public JQuery dialog(String optionLiteral, String optionName, Object optionValue);
    native public JQuery draggable();
    native public void draggable(def.jqueryui.StringTypes.destroy methodName);
    native public void draggable(def.jqueryui.StringTypes.disable methodName);
    native public void draggable(def.jqueryui.StringTypes.enable methodName);
    native public JQuery draggable(def.jqueryui.StringTypes.widget methodName);
    native public JQuery draggable(String methodName);
    native public JQuery draggable(def.jqueryui.jqueryui.DraggableOptions options);
    native public Object draggable(String optionLiteral, String optionName);
    native public Object draggable(String optionLiteral, def.jqueryui.jqueryui.DraggableOptions options);
    native public JQuery draggable(String optionLiteral, String optionName, Object optionValue);
    native public JQuery droppable();
    native public void droppable(def.jqueryui.StringTypes.destroy methodName);
    native public void droppable(def.jqueryui.StringTypes.disable methodName);
    native public void droppable(def.jqueryui.StringTypes.enable methodName);
    native public JQuery droppable(def.jqueryui.StringTypes.widget methodName);
    native public JQuery droppable(String methodName);
    native public JQuery droppable(def.jqueryui.jqueryui.DroppableOptions options);
    native public Object droppable(String optionLiteral, String optionName);
    native public Object droppable(String optionLiteral, def.jqueryui.jqueryui.DraggableOptions options);
    native public JQuery droppable(String optionLiteral, String optionName, Object optionValue);
    public Menu menu;
    native public JQuery progressbar();
    native public void progressbar(def.jqueryui.StringTypes.destroy methodName);
    native public void progressbar(def.jqueryui.StringTypes.disable methodName);
    native public void progressbar(def.jqueryui.StringTypes.enable methodName);
    native public void progressbar(def.jqueryui.StringTypes.refresh methodName);
    native public Object progressbar(def.jqueryui.StringTypes.value methodName);
    native public void progressbar(def.jqueryui.StringTypes.value methodName, double value);
    native public void progressbar(def.jqueryui.StringTypes.value methodName, Boolean value);
    native public JQuery progressbar(def.jqueryui.StringTypes.widget methodName);
    native public JQuery progressbar(String methodName);
    native public JQuery progressbar(def.jqueryui.jqueryui.ProgressbarOptions options);
    native public Object progressbar(String optionLiteral, String optionName);
    native public Object progressbar(String optionLiteral, def.jqueryui.jqueryui.ProgressbarOptions options);
    native public JQuery progressbar(String optionLiteral, String optionName, Object optionValue);
    native public JQuery resizable();
    native public void resizable(def.jqueryui.StringTypes.destroy methodName);
    native public void resizable(def.jqueryui.StringTypes.disable methodName);
    native public void resizable(def.jqueryui.StringTypes.enable methodName);
    native public JQuery resizable(def.jqueryui.StringTypes.widget methodName);
    native public JQuery resizable(String methodName);
    native public JQuery resizable(def.jqueryui.jqueryui.ResizableOptions options);
    native public Object resizable(String optionLiteral, String optionName);
    native public Object resizable(String optionLiteral, def.jqueryui.jqueryui.ResizableOptions options);
    native public JQuery resizable(String optionLiteral, String optionName, Object optionValue);
    native public JQuery selectable();
    native public void selectable(def.jqueryui.StringTypes.destroy methodName);
    native public void selectable(def.jqueryui.StringTypes.disable methodName);
    native public void selectable(def.jqueryui.StringTypes.enable methodName);
    native public JQuery selectable(def.jqueryui.StringTypes.widget methodName);
    native public JQuery selectable(String methodName);
    native public JQuery selectable(def.jqueryui.jqueryui.SelectableOptions options);
    native public Object selectable(String optionLiteral, String optionName);
    native public Object selectable(String optionLiteral, def.jqueryui.jqueryui.SelectableOptions options);
    native public JQuery selectable(String optionLiteral, String optionName, Object optionValue);
    native public JQuery selectmenu();
    native public JQuery selectmenu(def.jqueryui.StringTypes.close methodName);
    native public JQuery selectmenu(def.jqueryui.StringTypes.destroy methodName);
    native public JQuery selectmenu(def.jqueryui.StringTypes.disable methodName);
    native public JQuery selectmenu(def.jqueryui.StringTypes.enable methodName);
    native public Object selectmenu(def.jqueryui.StringTypes.instance methodName);
    native public JQuery selectmenu(def.jqueryui.StringTypes.menuWidget methodName);
    native public JQuery selectmenu(def.jqueryui.StringTypes.open methodName);
    native public JQuery selectmenu(def.jqueryui.StringTypes.refresh methodName);
    native public JQuery selectmenu(def.jqueryui.StringTypes.widget methodName);
    native public JQuery selectmenu(String methodName);
    native public JQuery selectmenu(def.jqueryui.jqueryui.SelectMenuOptions options);
    native public Object selectmenu(String optionLiteral, String optionName);
    native public Object selectmenu(String optionLiteral, def.jqueryui.jqueryui.SelectMenuOptions options);
    native public JQuery selectmenu(String optionLiteral, String optionName, Object optionValue);
    native public JQuery slider();
    native public void slider(def.jqueryui.StringTypes.destroy methodName);
    native public void slider(def.jqueryui.StringTypes.disable methodName);
    native public void slider(def.jqueryui.StringTypes.enable methodName);
    native public void slider(def.jqueryui.StringTypes.refresh methodName);
    native public double slider(def.jqueryui.StringTypes.value methodName);
    native public void slider(def.jqueryui.StringTypes.value methodName, double value);
    native public Array<Double> slider(def.jqueryui.StringTypes.values methodName);
    native public double slider(def.jqueryui.StringTypes.values methodName, double index);
    native public void slider(String methodName, double index, double value);
    native public void slider(def.jqueryui.StringTypes.values methodName, double index, double value);
    native public void slider(String methodName, Array<Double> values);
    native public void slider(def.jqueryui.StringTypes.values methodName, Array<Double> values);
    native public JQuery slider(def.jqueryui.StringTypes.widget methodName);
    native public JQuery slider(String methodName);
    native public JQuery slider(def.jqueryui.jqueryui.SliderOptions options);
    native public Object slider(String optionLiteral, String optionName);
    native public Object slider(String optionLiteral, def.jqueryui.jqueryui.SliderOptions options);
    native public JQuery slider(String optionLiteral, String optionName, Object optionValue);
    native public JQuery sortable();
    native public void sortable(def.jqueryui.StringTypes.destroy methodName);
    native public void sortable(def.jqueryui.StringTypes.disable methodName);
    native public void sortable(def.jqueryui.StringTypes.enable methodName);
    native public JQuery sortable(def.jqueryui.StringTypes.widget methodName);
    native public String[] sortable(def.jqueryui.StringTypes.toArray methodName);
    native public JQuery sortable(String methodName);
    native public JQuery sortable(def.jqueryui.jqueryui.SortableOptions options);
    native public Object sortable(String optionLiteral, String optionName);
    native public String sortable(def.jqueryui.StringTypes.serialize methodName, Options options);
    native public Object sortable(String optionLiteral, def.jqueryui.jqueryui.SortableOptions options);
    native public JQuery sortable(String optionLiteral, String optionName, Object optionValue);
    native public JQuery spinner();
    native public void spinner(def.jqueryui.StringTypes.destroy methodName);
    native public void spinner(def.jqueryui.StringTypes.disable methodName);
    native public void spinner(def.jqueryui.StringTypes.enable methodName);
    native public void spinner(def.jqueryui.StringTypes.pageDown methodName, double pages);
    native public void spinner(def.jqueryui.StringTypes.pageUp methodName, double pages);
    native public void spinner(def.jqueryui.StringTypes.stepDown methodName, double steps);
    native public void spinner(def.jqueryui.StringTypes.stepUp methodName, double steps);
    native public double spinner(def.jqueryui.StringTypes.value methodName);
    native public void spinner(def.jqueryui.StringTypes.value methodName, double value);
    native public JQuery spinner(def.jqueryui.StringTypes.widget methodName);
    native public JQuery spinner(String methodName);
    native public JQuery spinner(def.jqueryui.jqueryui.SpinnerOptions options);
    native public Object spinner(String optionLiteral, String optionName);
    native public Object spinner(String optionLiteral, def.jqueryui.jqueryui.SpinnerOptions options);
    native public JQuery spinner(String optionLiteral, String optionName, Object optionValue);
    native public JQuery tabs();
    native public void tabs(def.jqueryui.StringTypes.destroy methodName);
    native public void tabs(def.jqueryui.StringTypes.disable methodName);
    native public void tabs(def.jqueryui.StringTypes.enable methodName);
    native public void tabs(def.jqueryui.StringTypes.load methodName, double index);
    native public void tabs(def.jqueryui.StringTypes.refresh methodName);
    native public JQuery tabs(def.jqueryui.StringTypes.widget methodName);
    native public JQuery tabs(String methodName);
    native public JQuery tabs(def.jqueryui.jqueryui.TabsOptions options);
    native public Object tabs(String optionLiteral, String optionName);
    native public Object tabs(String optionLiteral, def.jqueryui.jqueryui.TabsOptions options);
    native public JQuery tabs(String optionLiteral, String optionName, Object optionValue);
    native public JQuery tooltip();
    native public void tooltip(def.jqueryui.StringTypes.destroy methodName);
    native public void tooltip(def.jqueryui.StringTypes.disable methodName);
    native public void tooltip(def.jqueryui.StringTypes.enable methodName);
    native public void tooltip(def.jqueryui.StringTypes.open methodName);
    native public void tooltip(def.jqueryui.StringTypes.close methodName);
    native public JQuery tooltip(def.jqueryui.StringTypes.widget methodName);
    native public JQuery tooltip(String methodName);
    native public JQuery tooltip(def.jqueryui.jqueryui.TooltipOptions options);
    native public Object tooltip(String optionLiteral, String optionName);
    native public Object tooltip(String optionLiteral, def.jqueryui.jqueryui.TooltipOptions options);
    native public JQuery tooltip(String optionLiteral, String optionName, Object optionValue);
    native public JQuery addClass(String classNames, double speed, Function callback);
    native public JQuery addClass(String classNames, String speed, Function callback);
    native public JQuery addClass(String classNames, double speed, String easing, Function callback);
    native public JQuery addClass(String classNames, String speed, String easing, Function callback);
    native public JQuery removeClass(String classNames, double speed, Function callback);
    native public JQuery removeClass(String classNames, String speed, Function callback);
    native public JQuery removeClass(String classNames, double speed, String easing, Function callback);
    native public JQuery removeClass(String classNames, String speed, String easing, Function callback);
    native public JQuery switchClass(String removeClassName, String addClassName, double duration, String easing, Function complete);
    native public JQuery switchClass(String removeClassName, String addClassName, String duration, String easing, Function complete);
    native public JQuery toggleClass(String className, double duration, String easing, Function complete);
    native public JQuery toggleClass(String className, String duration, String easing, Function complete);
    native public JQuery toggleClass(String className, Boolean aswitch, double duration, String easing, Function complete);
    native public JQuery toggleClass(String className, Boolean aswitch, String duration, String easing, Function complete);
    native public JQuery effect(Object options);
    native public JQuery effect(String effect, Object options, double duration, Function complete);
    native public JQuery effect(String effect, Object options, String duration, Function complete);
    native public JQuery hide(Object options);
    native public JQuery hide(String effect, Object options, double duration, Function complete);
    native public JQuery hide(String effect, Object options, String duration, Function complete);
    native public JQuery show(Object options);
    native public JQuery show(String effect, Object options, double duration, Function complete);
    native public JQuery show(String effect, Object options, String duration, Function complete);
    native public JQuery toggle(Object options);
    native public JQuery toggle(String effect, Object options, double duration, Function complete);
    native public JQuery toggle(String effect, Object options, String duration, Function complete);
    native public JQuery position(def.jqueryui.jqueryui.JQueryPositionOptions options);
    native public JQuery enableSelection();
    native public JQuery disableSelection();
    native public JQuery focus(double delay, Function callback);
    native public JQuery uniqueId();
    native public JQuery removeUniqueId();
    native public JQuery scrollParent();
    native public double zIndex();
    native public JQuery zIndex(double zIndex);
    public def.jqueryui.jqueryui.Widget widget;
    public JQueryStatic jQuery;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Menu extends def.js.Object {
        native public JQuery $apply();
        native public void $apply(def.jqueryui.StringTypes.blur methodName);
        native public void $apply(def.jqueryui.StringTypes.collapse methodName, JQueryEventObject event);
        native public void $apply(def.jqueryui.StringTypes.collapseAll methodName, JQueryEventObject event, Boolean all);
        native public void $apply(def.jqueryui.StringTypes.destroy methodName);
        native public void $apply(def.jqueryui.StringTypes.disable methodName);
        native public void $apply(def.jqueryui.StringTypes.enable methodName);
        native public void $apply(String methodName, JQueryEventObject event, JQuery item);
        native public void $apply(def.jqueryui.StringTypes.focus methodName, JQueryEventObject event, JQuery item);
        native public Boolean $apply(def.jqueryui.StringTypes.isFirstItem methodName);
        native public Boolean $apply(def.jqueryui.StringTypes.isLastItem methodName);
        native public void $apply(def.jqueryui.StringTypes.next methodName, JQueryEventObject event);
        native public void $apply(def.jqueryui.StringTypes.nextPage methodName, JQueryEventObject event);
        native public void $apply(def.jqueryui.StringTypes.previous methodName, JQueryEventObject event);
        native public void $apply(def.jqueryui.StringTypes.previousPage methodName, JQueryEventObject event);
        native public void $apply(def.jqueryui.StringTypes.refresh methodName);
        native public void $apply(def.jqueryui.StringTypes.select methodName, JQueryEventObject event);
        native public JQuery $apply(def.jqueryui.StringTypes.widget methodName);
        native public JQuery $apply(String methodName);
        native public JQuery $apply(def.jqueryui.jqueryui.MenuOptions options);
        native public Object $apply(String optionLiteral, String optionName);
        native public Object $apply(String optionLiteral, def.jqueryui.jqueryui.MenuOptions options);
        native public JQuery $apply(String optionLiteral, String optionName, Object optionValue);
        public Boolean active;
        native public void $apply(def.jqueryui.StringTypes.collapse methodName);
        native public void $apply(def.jqueryui.StringTypes.collapseAll methodName, JQueryEventObject event);
        native public void $apply(def.jqueryui.StringTypes.collapseAll methodName);
        native public void $apply(def.jqueryui.StringTypes.next methodName);
        native public void $apply(def.jqueryui.StringTypes.nextPage methodName);
        native public void $apply(def.jqueryui.StringTypes.previous methodName);
        native public void $apply(def.jqueryui.StringTypes.previousPage methodName);
        native public void $apply(def.jqueryui.StringTypes.select methodName);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public String key;
        @jsweet.lang.Optional
        public String attribute;
        @jsweet.lang.Optional
        public RegExp expression;
    }
    native public void autocomplete(def.jqueryui.StringTypes.search methodName);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, Date date, java.lang.Runnable onSelect, def.jqueryui.jqueryui.DatepickerOptions settings);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, Date date, java.lang.Runnable onSelect);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, Date date);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, String date, java.lang.Runnable onSelect, def.jqueryui.jqueryui.DatepickerOptions settings);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, String date, java.lang.Runnable onSelect);
    /**
     * Opens the datepicker in a dialog box.
     *
     * @param methodName 'dialog'
     * @param date The initial date.
     * @param onSelect A callback function when a date is selected. The function receives the date text and date picker instance as parameters.
     * @param settings The new settings for the date picker.
     * @param pos The position of the top/left of the dialog as [x, y] or a MouseEvent that contains the coordinates. If not specified the dialog is centered on the screen.
     */
    native public JQuery datepicker(def.jqueryui.StringTypes.dialog methodName, String date);
    native public String sortable(def.jqueryui.StringTypes.serialize methodName);
    native public void spinner(def.jqueryui.StringTypes.pageDown methodName);
    native public void spinner(def.jqueryui.StringTypes.pageUp methodName);
    native public void spinner(def.jqueryui.StringTypes.stepDown methodName);
    native public void spinner(def.jqueryui.StringTypes.stepUp methodName);
    native public JQuery addClass(String classNames, double speed);
    native public JQuery addClass(String classNames);
    native public JQuery addClass(String classNames, String speed);
    native public JQuery addClass(String classNames, double speed, String easing);
    native public JQuery addClass(String classNames, String speed, String easing);
    native public JQuery removeClass(String classNames, double speed);
    native public JQuery removeClass(String classNames);
    native public JQuery removeClass(String classNames, String speed);
    native public JQuery removeClass(String classNames, double speed, String easing);
    native public JQuery removeClass(String classNames, String speed, String easing);
    native public JQuery switchClass(String removeClassName, String addClassName, double duration, String easing);
    native public JQuery switchClass(String removeClassName, String addClassName, double duration);
    native public JQuery switchClass(String removeClassName, String addClassName);
    native public JQuery switchClass(String removeClassName, String addClassName, String duration, String easing);
    native public JQuery switchClass(String removeClassName, String addClassName, String duration);
    native public JQuery toggleClass(String className, double duration, String easing);
    native public JQuery toggleClass(String className, double duration);
    native public JQuery toggleClass(String className);
    native public JQuery toggleClass(String className, String duration, String easing);
    native public JQuery toggleClass(String className, String duration);
    native public JQuery toggleClass(String className, Boolean aswitch, double duration, String easing);
    native public JQuery toggleClass(String className, Boolean aswitch, double duration);
    native public JQuery toggleClass(String className, Boolean aswitch);
    native public JQuery toggleClass(String className, Boolean aswitch, String duration, String easing);
    native public JQuery toggleClass(String className, Boolean aswitch, String duration);
    native public JQuery effect(String effect, Object options, double duration);
    native public JQuery effect(String effect, Object options);
    native public JQuery effect(String effect);
    native public JQuery effect(String effect, Object options, String duration);
    native public JQuery hide(String effect, Object options, double duration);
    native public JQuery hide(String effect, Object options);
    native public JQuery hide(String effect);
    native public JQuery hide(String effect, Object options, String duration);
    native public JQuery show(String effect, Object options, double duration);
    native public JQuery show(String effect, Object options);
    native public JQuery show(String effect);
    native public JQuery show(String effect, Object options, String duration);
    native public JQuery toggle(String effect, Object options, double duration);
    native public JQuery toggle(String effect, Object options);
    native public JQuery toggle(String effect);
    native public JQuery toggle(String effect, Object options, String duration);
    native public JQuery focus(double delay);
    native public void slider(String methodName, Double[] values);
    native public void slider(def.jqueryui.StringTypes.values methodName, Double[] values);
    native public def.jqueryui.JQuery menu();
    native public void menu(def.jqueryui.StringTypes.blur methodName);
    native public void menu(def.jqueryui.StringTypes.collapse methodName, def.jquery.JQueryEventObject event);
    native public void menu(def.jqueryui.StringTypes.collapseAll methodName, def.jquery.JQueryEventObject event, java.lang.Boolean all);
    native public void menu(def.jqueryui.StringTypes.destroy methodName);
    native public void menu(def.jqueryui.StringTypes.disable methodName);
    native public void menu(def.jqueryui.StringTypes.enable methodName);
    native public void menu(java.lang.String methodName, def.jquery.JQueryEventObject event, def.jqueryui.JQuery item);
    native public void menu(def.jqueryui.StringTypes.focus methodName, def.jquery.JQueryEventObject event, def.jqueryui.JQuery item);
    native public java.lang.Boolean menu(def.jqueryui.StringTypes.isFirstItem methodName);
    native public java.lang.Boolean menu(def.jqueryui.StringTypes.isLastItem methodName);
    native public void menu(def.jqueryui.StringTypes.next methodName, def.jquery.JQueryEventObject event);
    native public void menu(def.jqueryui.StringTypes.nextPage methodName, def.jquery.JQueryEventObject event);
    native public void menu(def.jqueryui.StringTypes.previous methodName, def.jquery.JQueryEventObject event);
    native public void menu(def.jqueryui.StringTypes.previousPage methodName, def.jquery.JQueryEventObject event);
    native public void menu(def.jqueryui.StringTypes.refresh methodName);
    native public void menu(def.jqueryui.StringTypes.select methodName, def.jquery.JQueryEventObject event);
    native public def.jqueryui.JQuery menu(def.jqueryui.StringTypes.widget methodName);
    native public def.jqueryui.JQuery menu(java.lang.String methodName);
    native public def.jqueryui.JQuery menu(def.jqueryui.jqueryui.MenuOptions options);
    native public Object menu(java.lang.String optionLiteral, java.lang.String optionName);
    native public Object menu(java.lang.String optionLiteral, def.jqueryui.jqueryui.MenuOptions options);
    native public def.jqueryui.JQuery menu(java.lang.String optionLiteral, java.lang.String optionName, Object optionValue);
    native public void menu(def.jqueryui.StringTypes.collapse methodName);
    native public void menu(def.jqueryui.StringTypes.collapseAll methodName, def.jquery.JQueryEventObject event);
    native public void menu(def.jqueryui.StringTypes.collapseAll methodName);
    native public void menu(def.jqueryui.StringTypes.next methodName);
    native public void menu(def.jqueryui.StringTypes.nextPage methodName);
    native public void menu(def.jqueryui.StringTypes.previous methodName);
    native public void menu(def.jqueryui.StringTypes.previousPage methodName);
    native public void menu(def.jqueryui.StringTypes.select methodName);
    native public def.jqueryui.JQuery widget(java.lang.String methodName);
    native public def.jqueryui.JQuery widget(def.jqueryui.jqueryui.WidgetOptions options);
    native public def.jqueryui.JQuery widget(def.jqueryui.jqueryui.AccordionOptions options);
    native public Object widget(java.lang.String optionLiteral, java.lang.String optionName);
    native public Object widget(java.lang.String optionLiteral, def.jqueryui.jqueryui.WidgetOptions options);
    native public def.jqueryui.JQuery widget(java.lang.String optionLiteral, java.lang.String optionName, Object optionValue);
    native public def.jqueryui.JQuery widget(java.lang.String name, Object prototype);
    native public def.jqueryui.JQuery widget(java.lang.String name, def.js.Function base, Object prototype);
}

