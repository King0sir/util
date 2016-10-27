package org.kin.live.date;

import java.util.Date;

/**
 * Created by kingsir on 16-10-27.
 */
public class DateUtilTest {
    public static void main(String[] args) {

        print(DateUtils.getDate());

        print(DateUtils.getDateString());

        print(DateUtils.getDateString(DateUtils.DATE_FORMAT_TIME));

        print(DateUtils.getDateString(new Date(),DateUtils.DATE_FORMAT_COMPACTSHORT));
    }

    private static void print(Object object){
        System.out.println(object);
    }
}
