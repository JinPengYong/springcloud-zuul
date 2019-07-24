package com.cheer.emp.web.controller;

import com.cheer.emp.model.Emp;
import com.cheer.emp.web.feignclient.EmpFeignClient;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpFeignClient empFeignClient;

    @GetMapping("getEmp/{empNo}")
    public Emp getEmp(@PathVariable Integer empNo) {
        log.traceEntry();

        return empFeignClient.getEmp(empNo);
    }
}
