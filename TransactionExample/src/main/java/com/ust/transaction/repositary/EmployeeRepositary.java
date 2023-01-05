package com.ust.transaction.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.transaction.entity.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee, Integer> {

}
