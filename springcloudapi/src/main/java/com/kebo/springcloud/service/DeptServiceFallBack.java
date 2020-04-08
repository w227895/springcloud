package com.kebo.springcloud.service;

import com.kebo.springcloud.po.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-08 19:33
 **/
@Component
public class DeptServiceFallBack implements FallbackFactory{
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            public boolean addDept(Dept dept) {
                return false;
            }

            public Dept queryById(long id) {
                return new Dept().setDeptno(id).setDename("找不到对应的信息");
            }

            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}

