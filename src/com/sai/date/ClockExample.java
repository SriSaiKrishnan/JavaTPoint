package com.sai.date;

import java.time.Clock;

public class ClockExample {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.instant());
    }
}
