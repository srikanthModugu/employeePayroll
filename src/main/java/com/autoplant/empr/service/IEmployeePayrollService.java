package com.autoplant.empr.service;

import com.autoplant.empr.model.EmplyoeeReqDO;
import com.autoplant.empr.model.ResponseDo;

public interface IEmployeePayrollService {

	public ResponseDo addEmployee(EmplyoeeReqDO empReqDo);
}
