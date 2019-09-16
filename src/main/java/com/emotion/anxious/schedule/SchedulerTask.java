package com.emotion.anxious.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
    private int count = 0;

    @Scheduled(cron = "*/1 * * * * ?")
    private void process() {
        System.out.println(count++);
    }
}
