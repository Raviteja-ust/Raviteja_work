package com.ust.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public List<Model> getModel()
	{
		List<Model> emp=new ArrayList<>();
		emp.add(new Model(1001,"RAVI","HYD",10000.00,"ravi@gmail.com",""));
		emp.add(new Model(1002,"TEJA","HYD",20000.00,"Teja@gamil.com",""));
		emp.add(new Model(1003,"SRI","KOC",30000.00,"sri@gmail.com",""));
		emp.add(new Model(1003,"SRIK","KOC",10000.00,"sri@gmail.com",""));
		
		return emp;
	}

}