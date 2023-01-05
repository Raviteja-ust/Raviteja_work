package com.ust.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.transaction.entity.Employee;
import com.ust.transaction.repositary.EmployeeRepositary;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepositary employeeRepositary;

	public Employee saveEmpRecord(Employee employee) {
		
		
		return employeeRepositary.save(employee);

	}

	public String deleteEmpRecord(int id) {
		 employeeRepositary.deleteById(id);
		return "Record Deleted SuccessFully";
	}

}
