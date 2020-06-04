package com.sai.date;

import java.time.OffsetDateTime;

public class OffsetDateTimeExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime =  OffsetDateTime.now();
        System.out.println(offsetDateTime.getDayOfMonth());
        System.out.println(offsetDateTime.getDayOfYear());
        System.out.println(offsetDateTime.getDayOfWeek());
        OffsetDateTime value =  offsetDateTime.minusDays(240);
        System.out.println(value);
        OffsetDateTime value1 =  value.plusDays(240);
        System.out.println(value1);
    }
}
