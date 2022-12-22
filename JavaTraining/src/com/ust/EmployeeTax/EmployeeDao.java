package com.ust.EmployeeTax;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public List<EmployeeeModel> getEmployeeDetails()
	{
		
		List<EmployeeeModel> list=new ArrayList<>();
		list.add(new EmployeeeModel(101, "Ravi", "Hyd", 10000));
		list.add(new EmployeeeModel(101, "Teja", "Hyd", 30000));
		list.add(new EmployeeeModel(101, "Sripathi", "Hyd", 50000));
		list.add(new EmployeeeModel(101, "Rams", "Hyd", 80000));
		
		return list;
		
	}

}
