package com.kebo.springcloud.controller;

import com.kebo.springcloud.po.Dept;
import com.kebo.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: kb
 * @create: 2020-04-06 11:52
 **/
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/comsumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptService.queryById(id);
    }
}

