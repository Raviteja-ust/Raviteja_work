package com.ust.EmployeeTax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	
	public void getEmployeeTaxDetails() {
		
		List<EmployeeeModel> employeeDetails = new EmployeeDao().getEmployeeDetails();
		
		Map<EmployeeeModel, Double> map=new HashMap<>();
		
		for(EmployeeeModel empModel:employeeDetails) {
			
			if(empModel.getSalary()>0 && empModel.getSalary()<25000)
			{
				empModel.setPfDeduct(empModel.getSalary()*0.05);
				empModel.setSalary(empModel.getSalary()-empModel.getPfDeduct());
				
			}
			if(empModel.getSalary()>25000 && empModel.getSalary()<50000)
			{
				empModel.setPfDeduct(empModel.getSalary()*0.07);
				empModel.setSalary(empModel.getSalary()-empModel.getPfDeduct());
				
			}
			if(empModel.getSalary()>50000 && empModel.getSalary()<80000)
			{
				empModel.setPfDeduct(empModel.getSalary()*0.12);
				empModel.setSalary(empModel.getSalary()-empModel.getPfDeduct());
				
			}
			else
			{
				empModel.setPfDeduct(empModel.getSalary()*0.18);
				empModel.setSalary(empModel.getSalary()-empModel.getPfDeduct());
				
			}
			map.put(empModel, empModel.getPfDeduct());
			System.out.println(map);
		}
		
		/*employeeDetails.stream().filter(a -> {
			if(a.getSalary()>)
			
		}
).collect(Collectors.toList());*/
		
		
		
		
		//return empModel;
	
	}
	
	
	
	

	public static void main(String[] args) {
		
		EmployeeService s=new EmployeeService();
		s.getEmployeeTaxDetails();
		
		
		

	}

}
