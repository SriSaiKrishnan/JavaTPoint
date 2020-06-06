package com.sai.conversion;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDate {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Date date = timestamp;
        System.out.println(date);
    }
}
