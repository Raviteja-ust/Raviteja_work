package com.ust.EmployeeTax;

public class EmployeeeModel {
	private int employeeId;
	private String employeeName;
	private String location;
	private double salary;
	private Double pfDeduct;
	
	public Double getPfDeduct() {
		return pfDeduct;
	}
	public void setPfDeduct(Double pfDeduct) {
		this.pfDeduct = pfDeduct;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmployeeeModel(int employeeId, String employeeName, String location, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.location = location;
		this.salary = salary;
	}
	public EmployeeeModel() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeeModel [employeeId=" + employeeId + ", employeeName=" + employeeName + ", location=" + location
				+ ", salary=" + salary + "]";
	}
	
	
	

}
