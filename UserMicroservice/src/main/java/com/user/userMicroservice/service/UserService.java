package com.user.userMicroservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.userMicroservice.dto.Labour;
import com.user.userMicroservice.dto.UserLabourDto;
import com.user.userMicroservice.model.User;
import com.user.userMicroservice.repository.UserRepository;
import com.user.userMicroservice.util.UserGlobalException;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserGlobalException userGlobalException;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	

	public User updateUser(User user) {
		User newuser = new User();
		
		Optional<User> updateUser = userRepository.findById(user.getId());
		if(updateUser.isPresent()) {
			newuser.setName(user.getName());
			newuser.setEmail(user.getEmail());
			newuser.setLocation(user.getLocation());
			newuser.setCharges(user.getCharges());
			newuser.setPanCard(user.getPanCard());
			newuser.setPhoneNumber(user.getPhoneNumber());
			newuser.setWorkDetails(user.getWorkDetails());
			newuser.setWorkingDays(user.getWorkingDays());
			userRepository.save(newuser);
		}
		else {
			return null;
		}
		return user;
		
	}
	
	public UserLabourDto getUserBasedOnWork(String work) {
		List<User> users =  userRepository.findAllUserByWork(work);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8087/api/labourpoint/labour", List.class);
		
		List<Labour> labour = responseEntity.getBody();
		List<Labour> workLabour = new ArrayList<>();
		
		for(int i=0; i<labour.size(); i++) {
			if(labour.get(i).getSpecialization().equalsIgnoreCase(work)) {
				workLabour.add(labour.get(i));
			}
		}
		System.out.println("I m done");
		System.out.println(workLabour);
		System.out.println(users);
		UserLabourDto ulb = new UserLabourDto();
		ulb.setLabour(workLabour);
		ulb.setUser(users);
		return ulb;
	}
	
	public List<Labour> getLabourDetails() {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8087/api/labourpoint/labour", List.class);
		//Labour labour = responseEntity.getBody();
		
		List<Labour> labour = responseEntity.getBody();
		System.out.println(labour);
		System.out.println(responseEntity.getStatusCode());
		return labour;
	}
	
	
	
	
	

}
