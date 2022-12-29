package com.user.userMicroservice.dto;

import java.util.List;

import com.user.userMicroservice.model.User;

public class UserLabourDto {

	private List<User> user;
	private List<Labour> labour;
	
	
	public UserLabourDto() {
		super();
	}


	public UserLabourDto(List<User> user, List<Labour> labour) {
		super();
		this.user = user;
		this.labour = labour;
	}


	public List<User> getUser() {
		return user;
	}


	public void setUser(List<User> user) {
		this.user = user;
	}


	public List<Labour> getLabour() {
		return labour;
	}


	public void setLabour(List<Labour> labour) {
		this.labour = labour;
	}
	
	
}
