package com.ust.ConstructureInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "employee2")
public class Employee {

	private Address address;

	private int empId;

	private String empName;

	private double salary;

	

	@Autowired
	public Employee(@Value("184174") int empId, @Value("Raviteja") String empName, @Value("10000") double salary,
			Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	public void display() {
		System.out.println("Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address="
				+ address + "]");
	}

}
