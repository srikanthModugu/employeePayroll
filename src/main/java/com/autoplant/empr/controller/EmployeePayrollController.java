package com.autoplant.empr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.autoplant.empr.model.EmplyoeeReqDO;
import com.autoplant.empr.model.ResponseDo;
import com.autoplant.empr.service.IEmployeePayrollService;

@RestController
public class EmployeePayrollController {

	@Autowired
    private IEmployeePayrollService employeePayrollService;
    
    @PostMapping(value = "/add")
    public ResponseEntity<ResponseDo> addEmployee(@RequestBody EmplyoeeReqDO empReqDo){
        return new ResponseEntity<ResponseDo>(employeePayrollService.addEmployee(empReqDo), HttpStatus.OK);
    }
}
