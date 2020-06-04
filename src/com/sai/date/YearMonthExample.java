package com.sai.date;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearMonthExample {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        String s = yearMonth.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println(s);
    }
}
