package com.ust.validation;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceValidation {

	public List<EmpModel> getPanValidate() {

		List<EmpModel> model = new EmployeeDao().getModel();
		 List<EmpModel> collect = model.stream()
				.filter(a -> (a.getPanNumber() .length()== 10) && 
						     (a.getPanNumber() .substring(0, 5).matches("[A-Z]{5}"))
						     && (a.getPanNumber() .substring(5, 9).matches("[0-9]{4}")) 
						     && (a.getPanNumber() .substring(9, 10).matches("[A-Z]{1}")))
				.collect(Collectors.toList());
		System.out.println(collect);

		return collect;

	}

	public static void main(String[] args) {

		EmployeeServiceValidation esv = new EmployeeServiceValidation();
		esv.getPanValidate();

	}

}
