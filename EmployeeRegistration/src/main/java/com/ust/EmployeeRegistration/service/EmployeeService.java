package com.ust.EmployeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.EmployeeRegistration.model.Employee;
import com.ust.EmployeeRegistration.repositary.EmployeeRepositary;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepositary employeeRepositary;
	
	
	public Employee employeeById(int id) {
		
		return employeeRepositary.findById(id).orElse(null);
		
	}

	public List<Employee> allEmployees() {
		
		return employeeRepositary.findAll();
	}

	public Employee updateEmplyee( Employee emp) {
		Employee employee = new Employee();
		
		Optional<Employee> findById = employeeRepositary.findById(emp.getEmpId());
		
		if(findById.isPresent())
		{
			employee.setEmpId(findById.get().getEmpId());
			employee.setEmpName(emp.getEmpName());
			employee.setEmailId(emp.getEmailId());
			employee.setDomine(emp.getDomine());
			employee.setExperience(emp.getExperience());
			employee.setLocation(emp.getLocation());
		}
		else
		{
			return new Employee();
		}
		
		
		
		return employee;
	}

	public String deleteEmplyeeById(int id) {
		
		employeeRepositary.deleteById(id);
		return "Employee Deleted Successfully";
		
	}

	
	public Employee saveEmplyee( Employee emp) {
		
		return employeeRepositary.save(emp);
	}
	
	

}
