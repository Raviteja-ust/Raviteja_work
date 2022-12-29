package com.ust.labour.labourPoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.labour.labourPoint.exception.LabourNotFoundException;
import com.ust.labour.labourPoint.model.Labour;
import com.ust.labour.labourPoint.service.LabourService;

@RestController
@RequestMapping("api/labourpoint")
public class LabourController {

	@Autowired
	private LabourService labourService;

	@GetMapping(path = "labour")
	public List<Labour> retrieveAllLabour() {
		return labourService.retrieveAllLabour();
	}
	
	
	
	@PostMapping(path = "labour/register")
	public Labour createNewLabour(@RequestBody Labour labour) {
		return labourService.addNewLabour(labour);	
	}
	
	@GetMapping("/labour/work/{specialization}")
	public List<Labour> getLabourBasedOnWork(@PathVariable String specialization) {
		return labourService.getLabourBasedOnWork(specialization);
	}
	
	@PutMapping(path = "labour/update")
	public Labour updateLabour(@RequestBody Labour labour) {
		return labourService.updateExistingLabour(labour);
	}
	
	@GetMapping(path = "labour/price/{price}")
	public List<Labour> retrieveLabourByPricePerDay(@PathVariable double price) {
		System.out.println("Labour By Price..."+price);
		return labourService.findByLabourPricePerDay(price);	
	}
	
	@GetMapping(path = "labour/specialization/{specialization}")
	public List<Labour> retrieveLabourBySpecialization(@PathVariable String specialization) {
		return labourService.findByLabourSpecialization(specialization);	
	}
}
