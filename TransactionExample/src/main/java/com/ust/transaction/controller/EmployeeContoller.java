/*
 * package com.ust.transaction.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody;
 * 
 * import com.ust.transaction.entity.Employee; import
 * com.ust.transaction.service.EmployeeService;
 * 
 * @Controller public class EmployeeContoller {
 * 
 * @Autowired private EmployeeService employeeService;
 * 
 * @PostMapping("/saveEmployee") public Employee saveEmployee(@RequestBody
 * Employee employee) { return employeeService.saveEmpRecord(employee); }
 * 
 * @DeleteMapping("/delete/{id}") public String deleteEmployee(@PathVariable int
 * id) { return employeeService.deleteEmpRecord(id); }
 * 
 * }
 */