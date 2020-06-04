package com.sai.date;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffsetTimeExample {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        int h = offsetTime.get(ChronoField.HOUR_OF_DAY);
        System.out.println(h);
        int m = offsetTime.get(ChronoField.MINUTE_OF_DAY);
        System.out.println(m);
        int s = offsetTime.get(ChronoField.SECOND_OF_DAY);
        System.out.println(s);
    }
}
