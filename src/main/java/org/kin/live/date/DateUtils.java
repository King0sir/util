package org.kin.live.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by kingsir on 16-10-27.
 */
public class DateUtils {

    public static final String DATE_FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_FORMAT_SHORT = "yyyy-MM-dd";

    public static final String DATE_FORMAT_COMPACTSHORT = "yyyyMMdd";

    public static final String DATE_FORMAT_COMPACTFULL = "yyyyMMddHHmmss";

    public static final String DATE_FORMAT_TIME = "HH:mm:ss";

    /**
     * 获取当前的时间
     * @return
     */
    public static Date getDate(){
        Calendar now = Calendar.getInstance();
        return now.getTime();
    }

    public static Date getDate(String time ,String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(time);
    }

    public static String getDateString(){
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_FULL);
        return dateFormat.format(getDate());
    }

    public static String getDateString(String format){
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(getDate());
    }

    public static String getDateString(Date time,String format){
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(time);
    }
}
