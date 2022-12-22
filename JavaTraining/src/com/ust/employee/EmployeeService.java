package com.ust.employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

	public List<Model> getEmployeeSort() {
		List<Model> empls = new EmployeeDao().getModel();
		System.out
				.println(empls.stream().filter(a -> a.getLocation().contentEquals("HYD")).collect(Collectors.toList()));
		return empls.stream().filter(a -> a.getLocation().contentEquals("HYD")).collect(Collectors.toList());

	}

	public List<Model> getEmployeeSumSalary() {
		List<Model> empls = new EmployeeDao().getModel();
		//List<Model> remempl = new ArrayList<>();

		for (int i = 0; i < empls.size(); i++) {
			for (int j = i + 1; j < empls.size(); j++) {
				if (empls.get(i).getSalary() == empls.get(j).getSalary()) {
					empls.get(i).setSalary(empls.get(i).getSalary() + empls.get(j).getSalary());
					empls.remove(j);
				}
			}
		}
		System.out.println(empls);
		return empls;

	}

	//Approch 2 with summimg salary
	
	public List<Model> getEmployeeSumSalaryApproch2() {
		List<Model> empls = new EmployeeDao().getModel();
		Map<Integer,Model> map=new HashMap<>();
		for(Model elist:empls)
		{
			if(map.containsKey(elist.getSalary()))
			{
				Model model=map.get(elist.getSalary());
				map.put((int) elist.getSalary(), new Model(elist.getId(),elist.getName(),elist.getLocation(),elist.getSalary()+model.getSalary(),elist.getEmail(),elist.getMobile()));
			}
			else
			{
				map.put( (int) elist.getSalary(), new Model(elist.getId(),elist.getName(),elist.getLocation(),elist.getSalary(),elist.getEmail(),elist.getMobile()));
				
			}
		}

		System.out.println(map);
		return empls;

	}
	
	public static void main(String[] args) {
		EmployeeService e = new EmployeeService();
		e.getEmployeeSort();
		e.getEmployeeSumSalary();
		e.getEmployeeSumSalaryApproch2();

	}

}