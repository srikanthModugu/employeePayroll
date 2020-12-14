package com.autoplant.empr.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autoplant.empr.model.EmployeeEntity;
import com.autoplant.empr.model.EmplyoeeReqDO;
import com.autoplant.empr.model.ResponseDo;
import com.autoplant.empr.repository.EmployeeRepository;
import com.autoplant.empr.service.IEmployeePayrollService;

@Service
public class EmployeePayrollServiceImpl implements IEmployeePayrollService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public ResponseDo addEmployee(EmplyoeeReqDO empReqDo) {
		EmployeeEntity empEntity = new EmployeeEntity();
		empEntity.setName(empReqDo.getName());
		empEntity.setDepartment(empReqDo.getDepartment());
		empEntity.setSalary(empReqDo.getSalary());
		empEntity.setGender(empReqDo.getGender());
		empEntity.setImagePath(empReqDo.getImagePath());
		empEntity.setStartDate(new Date());
		empEntity.setNotes(empReqDo.getNotes());
		empEntity = employeeRepository.save(empEntity);
		if(empEntity!= null) {
			return new ResponseDo("Successfully data inserted");
		}else {
			return new ResponseDo("Failed to insert the Data");
		}
		
	}

}
