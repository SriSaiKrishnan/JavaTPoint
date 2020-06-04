package com.sai.date;

import java.time.LocalTime;

public class LocalTimee {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime time2 = localTime.minusHours(2);
        LocalTime time3 = time2.minusMinutes(23);
        System.out.println(time3);

        LocalTime time4 = time3.plusHours(2);
        LocalTime time5 = time4.plusMinutes(23);
        System.out.println(time5);

    }
}
