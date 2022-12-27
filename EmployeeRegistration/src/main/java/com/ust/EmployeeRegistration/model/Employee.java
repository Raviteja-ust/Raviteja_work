package com.ust.EmployeeRegistration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USTEmployee")
public class Employee {
	
	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private String location;
	private String domine;
	private String emailId;
	private int experience;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomine() {
		return domine;
	}
	public void setDomine(String domine) {
		this.domine = domine;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Employee(int empId, String empName, String location, String domine, String emailId, int experience) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.domine = domine;
		this.emailId = emailId;
		this.experience = experience;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", location=" + location + ", domine=" + domine
				+ ", emailId=" + emailId + ", experience=" + experience + "]";
	}
	
	

}
