package com.sai.date;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MothDayy {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.now();
        LocalDate date = monthDay.atYear(1994);
        System.out.println(date);
        boolean b = monthDay.isValidYear(2012);
        System.out.println(b);
        long n = monthDay.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(n);
        ValueRange r1 = monthDay.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(r1);
        ValueRange r2 = monthDay.range(ChronoField.DAY_OF_MONTH);
        System.out.println(r2);
    }
}
