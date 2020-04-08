package com.kebo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-08 19:53
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class DeptDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptDashboard_9001.class,args);
    }
}

