package com.ust.EmployeeTax;

import java.util.Comparator;

public class EmployeeSortById implements Comparator<EmployeeeModel>{

	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	


	@Override
	public int compare(EmployeeeModel o1, EmployeeeModel o2) {
		// TODO Auto-generated method stub
		//return o1.getEmployeeId().compareTo(o2.getEmployeeId());
		Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
		System.out.println(Integer.compare(o1.getEmployeeId(), o2.getEmployeeId()));
		return 0;
	}

}
