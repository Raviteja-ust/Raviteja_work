package com.ust.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ust.transaction.entity.Employee;
import com.ust.transaction.entity.EmployeeHelthInsurence;

import jakarta.transaction.Transactional;

@Component
public class OrganisationService {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	EmployeeHelthInsurenceService employeeHelthInsurenceService;

	@Transactional
	public void joinOrganiastion(Employee employee, EmployeeHelthInsurence employeeHelthInsurence) {

		employeeService.saveEmpRecord(employee);
		if (employee.getEmpId() == 101) {
			throw new RuntimeException("thowing exception to test transaction rollback");
		}
		employeeHelthInsurenceService.saveEmpHelthInsurenceRecord(employeeHelthInsurence);

	}

	@Transactional
	public void leaveOrganisation(Employee employee, EmployeeHelthInsurence employeeHelthInsurence) {

		employeeService.deleteEmpRecord(employee.getEmpId());
		employeeHelthInsurenceService.deleteEmpHelthInsurenceRecord(employeeHelthInsurence.getEmpId());

	}

}
