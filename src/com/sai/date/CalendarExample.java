package com.sai.date;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("The Current Date is " + calendar.getTime());
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 Day ago " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 Months Later" + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 Years later " + calendar.getTime());
        int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in week: " + maximum);
        maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in year: " + maximum);
    }
}
