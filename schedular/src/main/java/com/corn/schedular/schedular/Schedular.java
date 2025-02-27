package com.corn.schedular.schedular;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableScheduling
public class Schedular {

    private static final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "1 0/2 16-17 * * *")
    public void cornJob(){
        System.out.println("Current Time  is " + dateFormat.format(new Date()));
    }
}
