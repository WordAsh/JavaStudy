package com.hit.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BaseAPIDemo {
    public static void main(String[] args) {
        System.out.println(Math.random());
        Random random = new Random();
        System.out.println(random.nextInt());

        double result = ThreadLocalRandom.current().nextDouble(1.1,1.2);
        System.out.println("result = " + result);

        System.out.println(new Date());
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(new Date()));

        Calendar calendar = Calendar.getInstance();
        int year =calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("dayOfYear = " + dayOfYear);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("dayOfWeek = " + dayOfWeek);

        System.out.println(System.currentTimeMillis());
    }
}
