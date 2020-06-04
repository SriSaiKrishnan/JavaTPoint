package com.sai.date;

import java.time.LocalDate;

public class LocalDatee {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate yesterday = localDate.minusDays(1);
        LocalDate tommorrow = yesterday.plusDays(2);
        System.out.println("Today date " + localDate);
        System.out.println("Yesterday date " + yesterday);
        System.out.println("Tomorrow date " + tommorrow );
    }
}
