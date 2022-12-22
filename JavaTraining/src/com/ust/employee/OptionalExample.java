package com.ust.employee;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {

	public static void main(String[] args) {

		//String[] words = new String[10];
	//	Optional<String> checkNull = Optional.ofNullable(words[5]);
		//if (checkNull.isPresent()) {
		//	String word = words[5].toLowerCase();
		//	System.out.print(word);
		//} else
		//	System.out.println("word is null");
		
		List<Model> empls = new EmployeeDao().getModel();
		Optional<List<Model>> ofNullable = Optional.ofNullable(empls);
		if(ofNullable.isPresent())
		{
			   System.out.println(empls.stream().filter(a -> a.getLocation().contentEquals("HYD")).collect(Collectors.toList()));
				
		}
		else
		{
			System.out.println("Employee details not found");
		}
	}
	

	

}
