package com.ust.labour.labourPoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.labour.labourPoint.model.Labour;
import com.ust.labour.labourPoint.repository.LabourRepository;

@Service
public class LabourService {
	
	@Autowired
	private LabourRepository labourRepository;
	
	public Labour addNewLabour(Labour labour) {
		return labourRepository.save(labour);
	}
	
	//public Labour getById(int id) {
		//retrun null;
	//}
	
	public List<Labour> retrieveAllLabour(){
		return labourRepository.findAll();
	}
	 
	public List<Labour> findByLabourSpecialization(String specialization){
		return labourRepository.findBySpecialization(specialization);
	}
	
	public List<Labour> findByLabourPricePerDay(double pricePerDay){
		return labourRepository.findByPayPerDay(pricePerDay);
	}
	
	public List<Labour> getLabourBasedOnWork(String work) {
		//return labourRepository.findAllLabourByWork(work);
		return null;
	}

	public Labour updateExistingLabour(Labour labour) {
		Labour newLabour = new Labour();
		Optional<Labour> findById = labourRepository.findById(labour.getUuid());
		if(findById.isPresent()) {
			newLabour.setUuid(labour.getUuid());
			newLabour.setLabourName(labour.getLabourName());
			newLabour.setPanCard(labour.getPanCard());
			newLabour.setMobileNo(labour.getMobileNo());
			newLabour.setSpecialization(labour.getSpecialization());
			newLabour.setPayPerDay(labour.getPayPerDay());
			newLabour.setLocations(labour.getLocations());
		}
		else {
			return new Labour();
		}
		
		return labourRepository.save(newLabour); 
	}
}
