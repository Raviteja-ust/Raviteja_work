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
 * import com.ust.transaction.entity.EmployeeHelthInsurence; import
 * com.ust.transaction.service.EmployeeHelthInsurenceService;
 * 
 * @Controller public class EmployeeHelthInsurenceController {
 * 
 * @Autowired private EmployeeHelthInsurenceService
 * employeeHelthInsurenceService;
 * 
 * @PostMapping("/saveEmployee") public EmployeeHelthInsurence
 * saveEmployee(@RequestBody EmployeeHelthInsurence employeeHelthInsurence) {
 * return employeeHelthInsurenceService.saveEmpHelthInsurenceRecord(
 * employeeHelthInsurence); }
 * 
 * @DeleteMapping("/delete/{id}") public String deleteEmployee(@PathVariable int
 * id) { return employeeHelthInsurenceService.deleteEmpHelthInsurenceRecord(id);
 * }
 * 
 * 
 * }
 */