package com.autoplant.empr.service;

import java.util.List;

import com.autoplant.empr.model.EmplyoeeDO;
import com.autoplant.empr.model.ResponseDo;

public interface IEmployeePayrollService {

	public ResponseDo addEmployee(EmplyoeeDO empReqDo);
	public List<EmplyoeeDO> getEmployeeList();
	public ResponseDo deleteEmployee(int id);
	
}
