package com.sai.date;

import java.time.ZoneOffset;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.ofHoursMinutes(5,30);
        System.out.println(zone);
    }
}
