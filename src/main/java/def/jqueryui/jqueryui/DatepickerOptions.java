package def.jqueryui.jqueryui;
import def.dom.Element;
import def.js.Date;
@jsweet.lang.Interface
public abstract class DatepickerOptions extends def.js.Object {
    /**
         * An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of the date within this field. Leave as blank for no alternate field.
         */
    @jsweet.lang.Optional
    public Object altField;
    /**
         * The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes, while a different format is actually sent behind the scenes. For a full list of the possible formats see the formatDate function
         */
    @jsweet.lang.Optional
    public String altFormat;
    /**
         * The text to display after each date field, e.g., to show the required format.
         */
    @jsweet.lang.Optional
    public String appendText;
    /**
         * Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
         */
    @jsweet.lang.Optional
    public Boolean autoSize;
    /**
         * A function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
         */
    @jsweet.lang.Optional
    public java.util.function.BiFunction<Element,Object,def.jqueryui.jqueryui.DatepickerOptions> beforeShow;
    /**
         * A function that takes a date as a parameter and must return an array with:
         * [0]: true/false indicating whether or not this date is selectable
         * [1]: a CSS class name to add to the date's cell or "" for the default presentation
         * [2]: an optional popup tooltip for this date
         * The function is called for each day in the datepicker before it is displayed.
         */
    @jsweet.lang.Optional
    public java.util.function.Function<Date,Object[]> beforeShowDay;
    /**
         * A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText option becomes the alt value and is not directly displayed.
         */
    @jsweet.lang.Optional
    public String buttonImage;
    /**
         * Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the buttonImage option has also been set.
         */
    @jsweet.lang.Optional
    public Boolean buttonImageOnly;
    /**
         * The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
         */
    @jsweet.lang.Optional
    public String buttonText;
    /**
         * A function to calculate the week of the year for a given date. The default implementation uses the ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday of the year.
         */
    @jsweet.lang.Optional
    public java.util.function.Function<Date,String> calculateWeek;
    /**
         * Whether the month should be rendered as a dropdown instead of text.
         */
    @jsweet.lang.Optional
    public Boolean changeMonth;
    /**
         * Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made available for selection.
         */
    @jsweet.lang.Optional
    public Boolean changeYear;
    /**
         * The text to display for the close link. Use the showButtonPanel option to display this button.
         */
    @jsweet.lang.Optional
    public String closeText;
    /**
         * When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
         */
    @jsweet.lang.Optional
    public Boolean constrainInput;
    /**
         * The text to display for the current day link. Use the showButtonPanel option to display this button.
         */
    @jsweet.lang.Optional
    public String currentText;
    /**
         * The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
         */
    @jsweet.lang.Optional
    public String dateFormat;
    /**
         * The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
         */
    @jsweet.lang.Optional
    public String[] dayNames;
    /**
         * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.
         */
    @jsweet.lang.Optional
    public String[] dayNamesMin;
    /**
         * The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.
         */
    @jsweet.lang.Optional
    public String[] dayNamesShort;
    /**
         * Set the date to highlight on first opening if the field is blank. Specify either an actual date via a Date object or as a string in the current dateFormat, or a number of days from today (e.g. +7) or a string of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null for today.
         * Multiple types supported:
         * Date: A date object containing the default date.
         * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
         * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
         */
    @jsweet.lang.Optional
    public Object defaultDate;
    /**
         * Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three predefined speeds ("slow", "normal", "fast").
         */
    @jsweet.lang.Optional
    public String duration;
    /**
         * Set the first day of the week: Sunday is 0, Monday is 1, etc.
         */
    @jsweet.lang.Optional
    public double firstDay;
    /**
         * When true, the current day link moves to the currently selected date instead of today.
         */
    @jsweet.lang.Optional
    public Boolean gotoCurrent;
    /**
         * Normally the previous and next links are disabled when not applicable (see the minDate and maxDate options). You can hide them altogether by setting this attribute to true.
         */
    @jsweet.lang.Optional
    public Boolean hideIfNoPrevNext;
    /**
         * Whether the current language is drawn from right to left.
         */
    @jsweet.lang.Optional
    public Boolean isRTL;
    /**
         * The maximum selectable date. When set to null, there is no maximum.
         * Multiple types supported:
         * Date: A date object containing the maximum date.
         * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
         * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
         */
    @jsweet.lang.Optional
    public Object maxDate;
    /**
         * The minimum selectable date. When set to null, there is no minimum.
         * Multiple types supported:
         * Date: A date object containing the minimum date.
         * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
         * String: A string in the format defined by the dateFormat option, or a relative date. Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for days. For example, "+1m +7d" represents one month and seven days from today.
         */
    @jsweet.lang.Optional
    public Object minDate;
    /**
         * The list of full month names, for use as requested via the dateFormat option.
         */
    @jsweet.lang.Optional
    public String[] monthNames;
    /**
         * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.
         */
    @jsweet.lang.Optional
    public String[] monthNamesShort;
    /**
         * Whether the prevText and nextText options should be parsed as dates by the formatDate function, allowing them to display the target month names for example.
         */
    @jsweet.lang.Optional
    public Boolean navigationAsDateFormat;
    /**
         * The text to display for the next month link. With the standard ThemeRoller styling, this value is replaced by an icon.
         */
    @jsweet.lang.Optional
    public String nextText;
    /**
         * The number of months to show at once.
         * Multiple types supported:
         * Number: The number of months to display in a single row.
         * Array: An array defining the number of rows and columns to display.
         */
    @jsweet.lang.Optional
    public Object numberOfMonths;
    /**
         * Called when the datepicker moves to a new month and/or year. The function receives the selected year, month (1-12), and the datepicker instance as parameters. this refers to the associated input field.
         */
    @jsweet.lang.Optional
    public jsweet.util.function.TriConsumer<Double,Double,Object> onChangeMonthYear;
    /**
         * Called when the datepicker is closed, whether or not a date is selected. The function receives the selected date as text ("" if none) and the datepicker instance as parameters. this refers to the associated input field.
         */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<String,Object> onClose;
    /**
         * Called when the datepicker is selected. The function receives the selected date as text and the datepicker instance as parameters. this refers to the associated input field.
         */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<String,Object> onSelect;
    /**
         * The text to display for the previous month link. With the standard ThemeRoller styling, this value is replaced by an icon.
         */
    @jsweet.lang.Optional
    public String prevText;
    /**
         * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths option is set to true.
         */
    @jsweet.lang.Optional
    public Boolean selectOtherMonths;
    /**
         * The cutoff year for determining the century for a date (used in conjunction with dateFormat 'y'). Any dates entered with a year value less than or equal to the cutoff year are considered to be in the current century, while those greater than it are deemed to be in the previous century.
         * Multiple types supported:
         * Number: A value between 0 and 99 indicating the cutoff year.
         * String: A relative number of years from the current year, e.g., "+3" or "-5".
         */
    @jsweet.lang.Optional
    public Object shortYearCutoff;
    /**
         * The name of the animation used to show and hide the datepicker. Use "show" (the default), "slideDown", "fadeIn", any of the jQuery UI effects. Set to an empty string to disable animation.
         */
    @jsweet.lang.Optional
    public String showAnim;
    /**
         * Whether to display a button pane underneath the calendar. The button pane contains two buttons, a Today button that links to the current day, and a Done button that closes the datepicker. The buttons' text can be customized using the currentText and closeText options respectively.
         */
    @jsweet.lang.Optional
    public Boolean showButtonPanel;
    /**
         * When displaying multiple months via the numberOfMonths option, the showCurrentAtPos option defines which position to display the current month in.
         */
    @jsweet.lang.Optional
    public double showCurrentAtPos;
    /**
         * Whether to show the month after the year in the header.
         */
    @jsweet.lang.Optional
    public Boolean showMonthAfterYear;
    /**
         * When the datepicker should appear. The datepicker can appear when the field receives focus ("focus"), when a button is clicked ("button"), or when either event occurs ("both").
         */
    @jsweet.lang.Optional
    public String showOn;
    /**
         * If using one of the jQuery UI effects for the showAnim option, you can provide additional settings for that animation via this option.
         */
    @jsweet.lang.Optional
    public Object showOptions;
    /**
         * Whether to display dates in other months (non-selectable) at the start or end of the current month. To make these days selectable use the selectOtherMonths option.
         */
    @jsweet.lang.Optional
    public Boolean showOtherMonths;
    /**
         * When true, a column is added to show the week of the year. The calculateWeek option determines how the week of the year is calculated. You may also want to change the firstDay option.
         */
    @jsweet.lang.Optional
    public Boolean showWeek;
    /**
         * Set how many months to move when clicking the previous/next links.
         */
    @jsweet.lang.Optional
    public double stepMonths;
    /**
         * The text to display for the week of the year column heading. Use the showWeek option to display this column.
         */
    @jsweet.lang.Optional
    public String weekHeader;
    /**
         * The range of years displayed in the year drop-down: either relative to today's year ("-nn:+nn"), relative to the currently selected year ("c-nn:c+nn"), absolute ("nnnn:nnnn"), or combinations of these formats ("nnnn:-nn"). Note that this option only affects what appears in the drop-down, to restrict which dates may be selected use the minDate and/or maxDate options.
         */
    @jsweet.lang.Optional
    public String yearRange;
    /**
         * Additional text to display after the year in the month headers.
         */
    @jsweet.lang.Optional
    public String yearSuffix;
    /**
         * Set to true to automatically hide the datepicker.
         */
    @jsweet.lang.Optional
    public Boolean autohide;
    /**
  	    * Set to date to automatically enddate the datepicker.
  	    */
    @jsweet.lang.Optional
    public Date endDate;
}

