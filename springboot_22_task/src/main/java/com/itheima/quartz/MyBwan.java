package com.itheima.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyBwan {

    @Scheduled(cron = "0/1 * * * * ?")
    public void pring(){
        System.out.println("spring task run...");
    }
}
