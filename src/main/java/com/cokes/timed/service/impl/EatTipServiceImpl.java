package com.cokes.timed.service.impl;

import com.cokes.timed.client.RobotTipClient;
import com.cokes.timed.constant.TipContentEnum;
import com.cokes.timed.dto.RobotTipReq;
import com.cokes.timed.service.EatTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EatTipServiceImpl implements EatTipService{

    @Value("${robot.eat.key}")
    private String eatTipKey;

    @Autowired
    private RobotTipClient robotTipClient;
    /**
     * 定时任务提醒吃饭
     */
    @Override
    public void eatTip() {
        robotTipClient.sendTip(eatTipKey,
                RobotTipReq.getInstance(TipContentEnum.EAT_TIP_CONTENT));
    }
}
