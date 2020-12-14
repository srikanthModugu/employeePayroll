package com.autoplant.empr.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autoplant.empr.exception.BadRequestException;
import com.autoplant.empr.exception.NotFoundException;
import com.autoplant.empr.model.EmployeeEntity;
import com.autoplant.empr.model.EmplyoeeDO;
import com.autoplant.empr.model.ResponseDo;
import com.autoplant.empr.repository.EmployeeRepository;
import com.autoplant.empr.service.IEmployeePayrollService;

@Service
public class EmployeePayrollServiceImpl implements IEmployeePayrollService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public ResponseDo addEmployee(EmplyoeeDO empReqDo) {

		if (empReqDo == null) {
			throw new BadRequestException("Name is not Proper");
		}
		EmployeeEntity empEntity = new EmployeeEntity();
		empEntity.setName(empReqDo.getName());
		empEntity.setDepartment(empReqDo.getDepartment());
		empEntity.setSalary(empReqDo.getSalary());
		empEntity.setGender(empReqDo.getGender());
		empEntity.setImagePath(empReqDo.getImagePath());
		empEntity.setStartDate(new Date());
		empEntity.setNotes(empReqDo.getNotes());
		empEntity = employeeRepository.save(empEntity);
		if (empEntity != null) {
			return new ResponseDo("Successfully data inserted");
		} else {
			return new ResponseDo("Failed to insert the Data");
		}

	}

	@Override
	public List<EmplyoeeDO> getEmployeeList() {
		List<EmployeeEntity> emplList = employeeRepository.findAll();
		if (emplList == null || emplList.isEmpty()) {
			throw new NotFoundException("No Data Found of any employee");
		}
		return emplList.stream().map(employee -> {
			EmplyoeeDO emp = new EmplyoeeDO();
			emp.setName(employee.getName());
			emp.setDepartment(employee.getDepartment());
			emp.setSalary(employee.getSalary());
			emp.setGender(employee.getGender());
			emp.setImagePath(employee.getImagePath());
			emp.setStartDate("");
			emp.setNotes(employee.getNotes());
			return emp;
		}).collect(Collectors.toList());
	}

	@Override
	public ResponseDo deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return new ResponseDo("Employee Deleteed Successfully..!!");
	}

}
