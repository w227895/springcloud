package com.kebo.springcloud.service;

import com.kebo.springcloud.po.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-06 10:53
 **/
@Service
@FeignClient(value = "SPRINGCLOUDPROVIDERDEPT",fallbackFactory = DeptServiceFallBack.class)
public interface DeptService {

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") long id);

    @GetMapping("/dept/list")
    public List<Dept> queryAll();
}

