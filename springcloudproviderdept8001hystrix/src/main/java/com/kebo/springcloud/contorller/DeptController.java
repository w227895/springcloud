package com.kebo.springcloud.contorller;

import com.kebo.springcloud.po.Dept;
import com.kebo.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-06 10:55
 **/
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    /*@Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }*/
    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable long id){

        Dept dept= deptService.queryById(id);
        if(dept==null){
            throw new RuntimeException("不存在该用户");
        }
        return dept;
    }

    /*@GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    @GetMapping("/list")
    public Object discovery(){
        List<String> services=discoveryClient.getServices();
        System.out.println(services);
        return services;
    }*/
    public Dept hystrixGet(@PathVariable long id){
        return new Dept().setDeptno(id).setDename("不存在用户");
    }
}

