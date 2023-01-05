package com.ust.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ust.transaction.entity.Employee;
import com.ust.transaction.entity.EmployeeHelthInsurence;
import com.ust.transaction.service.OrganisationService;

@SpringBootApplication
public class TransactionExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TransactionExampleApplication.class, args);
		
		  OrganisationService bean = context.getBean(OrganisationService.class);
		  
		  Employee e=new Employee(); e.setEmpId(101); e.setEmpName("Ravi");
		  
		  EmployeeHelthInsurence ehs=new EmployeeHelthInsurence(); ehs.setEmpId(101);
		  ehs.setHelthIndsurence("TATA AIA"); ehs.setCoverage("300000");
		  
		  bean.joinOrganiastion(e, ehs); bean.leaveOrganisation(e, ehs);
		 
		
		
		
		
	}

}
