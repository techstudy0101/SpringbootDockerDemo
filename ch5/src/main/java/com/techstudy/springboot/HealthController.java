package com.techstudy.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthController {

    @Value("${spring.application.name}")
    String name;

    Logger logger = LoggerFactory.getLogger(HealthController.class.getName());
    @GetMapping("/ping")
    public String ping(){
        logger.info("ping call " + name);
        return "pong " + name;
    }

}
