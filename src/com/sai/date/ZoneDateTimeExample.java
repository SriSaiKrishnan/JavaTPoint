package com.sai.date;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2010, Month.MARCH,  19,   15,   26);
        ZoneId india = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);
        System.out.println("In India Central Time Zone: " + zone1);
        ZoneId  tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);
        System.out.println("In Tokyo Central Time Zone:"  + zone2);
    }
}
