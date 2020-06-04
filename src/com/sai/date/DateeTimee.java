package com.sai.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateeTimee {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2017, 1, 14, 10, 34);
        LocalDateTime localDateTime1 = localDateTime.plusDays(120);
        System.out.println("Before Formatting: " + localDateTime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatDateTime = localDateTime1.format(format);
        System.out.println("After Formatting: " + formatDateTime );
    }
}
