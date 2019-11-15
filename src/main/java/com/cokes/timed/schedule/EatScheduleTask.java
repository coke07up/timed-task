package com.cokes.timed.schedule;

import com.cokes.timed.service.EatTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EatScheduleTask {
    @Autowired
    private EatTipService eatTipService;
    @Scheduled(cron = "0 40 11 ? * 1,2,3,4,5")
    private void eatTip(){
        eatTipService.eatTip();
    }
}
