package io.github.sweehaw.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sweehaw
 */
public class DateUtils {

    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String format(Date d) {
        return format(DATETIME_FORMAT, d);
    }

    public static String format(String format, Date d) {
        return new SimpleDateFormat(format).format(d);
    }
}
