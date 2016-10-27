package org.kin.live.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by kingsir on 16-10-27.
 */
public class DateUtils {

    public static final String DATE_FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前的时间
     * @return
     */
    public static Date getDate(){
        Calendar now = Calendar.getInstance();
        return now.getTime();
    }

    public static String getDateString(){
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_FULL);
        return dateFormat.format(getDate());
    }
}
