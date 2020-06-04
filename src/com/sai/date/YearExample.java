package com.sai.date;

import java.time.LocalDate;
import java.time.Year;

public class YearExample {
    public static void main(String[] args) {
        Year year = Year.now();
        System.out.println(year);
        Year year1 = Year.of(2020);
        LocalDate localDate = year1.atDay(120);
        System.out.println(localDate);
        System.out.println(year1.length());
        System.out.println(year1.isLeap());
    }
}
