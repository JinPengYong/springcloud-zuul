package com.cheer.emp.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Emp implements Serializable {
    // 指定表的主键
    @TableId
    private Integer empNo;
    private String empName;
    private String job;
    private Integer mgr;
    private String hireDate;
    private Double sal;
    private Double com;
    private Integer deptNo;
}