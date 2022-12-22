package com.ust.employee;

public class Model {
	private int id;
	private String name;
	private String location;
	private double salary;
	private String email;
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Model(int id, String name, String location, double salary,String email,String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.email = email;
		this.mobile = mobile;
	}
	public Model() {
		super();
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + ", email="
				+ email + ", mobile=" + mobile + "]";
	}
	
	
	

}
