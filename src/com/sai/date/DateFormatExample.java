package com.sai.date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date " + date );

        String dateToStr = DateFormat.getInstance().format(date);
        System.out.println("Date Format using getInstance(): "+dateToStr);

        dateToStr = DateFormat.getDateInstance().format(date);
        System.out.println("Date Format using getDateInstance(): "+dateToStr);

        dateToStr = DateFormat.getTimeInstance().format(date);
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);

        dateToStr = DateFormat.getDateTimeInstance().format(date);
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(date);
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date);
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(date);
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(date);
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);
    }
}
