package com.ust.validation;

import java.util.ArrayList;
import java.util.List;



public class EmployeeDao {
	
	public List<EmpModel> getModel()
	{
		List<EmpModel> emp=new ArrayList<>();
		emp.add(new EmpModel("RAVI","GSRPS0203L"));
		emp.add(new EmpModel("TEJA","ABCD123409"));
		emp.add(new EmpModel("sri","ABCDE9876J"));
		return emp;
	}

}
