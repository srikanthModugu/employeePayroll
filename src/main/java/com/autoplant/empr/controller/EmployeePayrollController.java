package com.autoplant.empr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.autoplant.empr.model.EmplyoeeDO;
import com.autoplant.empr.model.ResponseDo;
import com.autoplant.empr.service.IEmployeePayrollService;

@RestController
public class EmployeePayrollController {

	@Autowired
    private IEmployeePayrollService employeePayrollService;
    
    @PostMapping(value = "/add")
    public ResponseEntity<ResponseDo> addEmployee(@RequestBody EmplyoeeDO empReqDo){
        return new ResponseEntity<ResponseDo>(employeePayrollService.addEmployee(empReqDo), HttpStatus.OK);
    }
    
    @GetMapping(value = "/list")
    public ResponseEntity<List<EmplyoeeDO>> getEmployeeList() {
        return new ResponseEntity<List<EmplyoeeDO>>(employeePayrollService.getEmployeeList(), HttpStatus.OK);
    }
}
