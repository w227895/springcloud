package springcloud.service;

import com.kebo.springcloud.po.Dept;

import java.util.List;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-06 10:53
 **/
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(long id);

    public List<Dept> queryAll();
}

