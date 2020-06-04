package com.sai.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodExample {
    public static void main(String[] args) {
        Period period = Period.ofDays(34);
        Temporal temporal = period.addTo(LocalDate.now());
        System.out.println(temporal);
    }
}
