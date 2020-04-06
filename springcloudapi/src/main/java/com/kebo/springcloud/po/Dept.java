package com.kebo.springcloud.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description:
 * @author: kb
 * @create: 2020-04-06 10:08
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;
    private String dename;
    private String db_source;

    public Dept(String dename) {
        this.dename = dename;
    }
}

