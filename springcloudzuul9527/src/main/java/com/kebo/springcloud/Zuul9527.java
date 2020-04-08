package com.kebo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-08 20:19
 **/
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527 {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527.class,args);

    }
}

