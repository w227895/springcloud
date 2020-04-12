package com.kebo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * @description:
 * @author: kb
 * @create: 2020-04-12 13:37
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigServer3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344.class,args);
    }
}

