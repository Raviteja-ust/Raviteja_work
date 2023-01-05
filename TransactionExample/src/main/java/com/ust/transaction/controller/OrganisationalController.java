package com.ust.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.transaction.entity.EmployeeAndHelthInsurence;
import com.ust.transaction.service.OrganisationService;

@Controller
public class OrganisationalController {
	
	
	@Autowired
	OrganisationService organisationService;
	
	@PostMapping("/save")
	public String joinOrganisation(@RequestBody EmployeeAndHelthInsurence employeeAndHelthInsurence)
	{
	     organisationService.joinOrganiastion(employeeAndHelthInsurence.getEmployee(), employeeAndHelthInsurence.getEmployeeHelthInsurence());
		return "EMployee Joined Organisation";
	}
	
	@DeleteMapping("/delete")
	public String leaveOrganisaction(@RequestBody EmployeeAndHelthInsurence employeeAndHelthInsurence)
	{
		organisationService.leaveOrganisation(employeeAndHelthInsurence.getEmployee(), employeeAndHelthInsurence.getEmployeeHelthInsurence());
		return "EMployee Leaved  Organisation";
	}
	
	

}
