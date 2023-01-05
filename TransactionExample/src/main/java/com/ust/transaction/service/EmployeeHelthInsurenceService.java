package com.ust.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.transaction.entity.Employee;
import com.ust.transaction.entity.EmployeeHelthInsurence;
import com.ust.transaction.repositary.EmployeeHelthInsurenceReposiatry;
import com.ust.transaction.repositary.EmployeeRepositary;

@Service
public class EmployeeHelthInsurenceService {

	@Autowired
	EmployeeHelthInsurenceReposiatry employeeHelthInsurenceReposiatry;

	public EmployeeHelthInsurence saveEmpHelthInsurenceRecord(EmployeeHelthInsurence employeeHelthInsurence) {
		return employeeHelthInsurenceReposiatry.save(employeeHelthInsurence);

	}

	public String deleteEmpHelthInsurenceRecord(int id) {
		employeeHelthInsurenceReposiatry.deleteById(id);
		return "Record Deleted SuccessFully";
	}

}
