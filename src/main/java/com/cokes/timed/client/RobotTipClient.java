package com.cokes.timed.client;


import com.cokes.timed.dto.RobotTipReq;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
@Headers("Content-Type:application/json")
public interface RobotTipClient {

    @RequestLine("POST /cgi-bin/webhook/send?key={key}")
    void sendTip(@Param(value = "key") String key, RobotTipReq robotTipReq);
}
