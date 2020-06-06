package com.sai.conversion;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimestamp {
    public static void main(String[] args) {
        Date date = new Date();
        Timestamp timestamp =  new  Timestamp(date.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(timestamp));
    }
}
