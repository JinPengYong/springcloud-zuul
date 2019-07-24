package com.cheer.emp.web.controller;

import com.cheer.emp.model.Emp;
import com.cheer.emp.service.EmpService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController // 可以省略@ResponseBody @RequestBody
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("getEmp/{empNo}")
    public Emp getEmp(@PathVariable Integer empNo) {
        log.traceEntry();
        return this.empService.getEmp(empNo);
    }
}
