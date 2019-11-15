package com.cokes.timed.schedule;

import com.cokes.timed.service.RunTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RunScheduleTask {
    @Autowired
    private RunTipService runTipService;

    @Scheduled(cron = "0 0 9 ? * 1,3,4")
    private void runMorningTip(){
        runTipService.runMorningTip();
    }
    @Scheduled(cron = "0 50 17 ? * 1,3,4")
    private void runAfternoonTip(){
        runTipService.runAfternoonTip();
    }
}
