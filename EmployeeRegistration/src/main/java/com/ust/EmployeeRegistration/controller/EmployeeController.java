package com.ust.EmployeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.EmployeeRegistration.model.Employee;
import com.ust.EmployeeRegistration.service.EmployeeService;

@RestController
@RequestMapping("/api/employee/")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.employeeById(id);

	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.allEmployees();
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmplyee(emp);

	}

	
	
	/*@RequestMapping(
			  path = "/save", 
			  method = RequestMethod.POST,
			  consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE,MediaType.APPLICATION_JSON_VALUE}, 
			  produces = {
			    MediaType.APPLICATION_ATOM_XML_VALUE, 
			    MediaType.APPLICATION_JSON_VALUE
			  }) */
	@PostMapping("/save")
	public  Employee saveEmployee(@RequestBody Employee emp) {
		return employeeService.saveEmplyee(emp);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmplyeeById(id);
	}

}
