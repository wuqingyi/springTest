package com.wqy.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTaskService {

    @Scheduled(fixedRate = 1000)
    public void task1(){
        System.out.println("task1");
    }

    @Scheduled(cron="*/5 * * * * ?")
    public void task2(){
        System.out.println("task2");
    }
}
