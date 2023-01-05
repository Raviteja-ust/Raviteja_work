package com.ust.transaction.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="employee_trn_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	
	@Id
	private int empId;
	private String empName;

}
