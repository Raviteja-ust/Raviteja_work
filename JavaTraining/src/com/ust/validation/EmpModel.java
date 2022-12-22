package com.ust.validation;

public class EmpModel {
	private String name;
	private String panNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public EmpModel(String name, String panNumber) {
		super();
		this.name = name;
		this.panNumber = panNumber;
	}
	public EmpModel() {
		super();
	}
	@Override
	public String toString() {
		return "model [name=" + name + ", panNumber=" + panNumber + "]";
	}
	
	

}
