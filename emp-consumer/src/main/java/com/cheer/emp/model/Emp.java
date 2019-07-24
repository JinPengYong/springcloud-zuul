package com.cheer.emp.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Emp implements Serializable {
    private Integer empNo;
    private String empName;
    private String job;
    private Integer mgr;
    private String hireDate;
    private Double sal;
    private Double com;
    private Integer deptNo;
}