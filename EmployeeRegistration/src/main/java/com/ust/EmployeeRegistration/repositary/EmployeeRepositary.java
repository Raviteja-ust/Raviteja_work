package com.ust.EmployeeRegistration.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.EmployeeRegistration.model.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Integer> {
	

}
