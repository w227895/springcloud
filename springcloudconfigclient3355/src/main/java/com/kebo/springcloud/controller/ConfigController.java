package com.kebo.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-12 14:30
 **/
@RestController
public class ConfigController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig(){
        return applicationName+"==="+eurekaServer+"====="+port;
    }

}

