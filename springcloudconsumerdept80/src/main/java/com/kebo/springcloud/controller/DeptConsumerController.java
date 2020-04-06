package com.kebo.springcloud.controller;

import com.kebo.springcloud.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-06 11:52
 **/
@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    //private final static String REST_URL_PREFIX = "http://localhost:8001";
    private final static String REST_URL_PREFIX = "http://SPRINGCLOUDPROVIDERDEPT";

    @RequestMapping("/comsumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
}

