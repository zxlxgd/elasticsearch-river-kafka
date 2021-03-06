package org.elasticsearch.river.kafka;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by luanmingming on 2018/1/11.
 */
public class TimeInterval {

    // 10min per time
    public static String minuteInterval() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        String time = dateFormat.format(now);
        return time.substring(0, time.length() - 1) + "0";
    }

    // 1hour per time
    public static String hourInterval() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHH");
        return dateFormat.format(now);
    }

    // 1day per time
    public static String dayInterval() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        return dateFormat.format(now);
    }

    // 1month per time
    public static String monthInterval() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        return dateFormat.format(now);
    }

    // 1year per time
    public static String yearInterval() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        return dateFormat.format(now);
    }

}
