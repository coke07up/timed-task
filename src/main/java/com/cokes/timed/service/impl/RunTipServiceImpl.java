package com.cokes.timed.service.impl;

import com.cokes.timed.client.RobotTipClient;
import com.cokes.timed.constant.TipContentEnum;
import com.cokes.timed.dto.RobotTipReq;
import com.cokes.timed.service.RunTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RunTipServiceImpl implements RunTipService {
    @Value("${robot.run.key}")
    private String runTipKey;

    @Autowired
    private RobotTipClient robotTipClient;

    @Override
    public void runMorningTip() {
         robotTipClient.sendTip(runTipKey,
                RobotTipReq.getInstance(TipContentEnum.MORNING_TIP_CONTENT));
    }

    @Override
    public void runAfternoonTip() {
        robotTipClient.sendTip(runTipKey,
                RobotTipReq.getInstance(TipContentEnum.AFTERNOON_TIP_CONTENT));
    }

}
