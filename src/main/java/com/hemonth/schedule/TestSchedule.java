package com.hemonth.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestSchedule {

    Logger logger = LoggerFactory.getLogger(TestSchedule.class);
//    @Scheduled(cron = "0,2 * * * * *")
    @Scheduled(fixedDelay = 20000)
    public void sayHello(){
        logger.info("Hello Hemonth! ::::::::::::::::::::::::::::::::");
        System.out.println("Hello Hemonth!!");
    }
}
