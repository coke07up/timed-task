package com.cokes.timed.configurator;

import com.cokes.timed.client.RobotTipClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Configurable
public class FeignClientConfig {

    @Value("${robot.tip.url}")
    private String robotTipUrl;

    @Bean
    public RobotTipClient runTipClient(){
        return Feign.builder()
                .decoder(new GsonDecoder())
                .encoder(new GsonEncoder())
                .target(RobotTipClient.class,robotTipUrl);
    }
}
