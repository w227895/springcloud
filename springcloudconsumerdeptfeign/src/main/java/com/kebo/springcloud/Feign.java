package com.kebo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-06 12:14
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kebo.springcloud"})
@ComponentScan("com.kebo.springcloud")
public class Feign {
    public static void main(String[] args) {
        SpringApplication.run(Feign.class,args);
    }
}

