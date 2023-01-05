package com.ust.transaction.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeAndHelthInsurence {

	private Employee employee;
	private EmployeeHelthInsurence employeeHelthInsurence;

}
