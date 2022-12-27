package com.ust.ConstructureInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	
	private int addId;

	
	private String streetName;

	
	private String city;

	
  
	@Autowired
	public Address(@Value("101") int addId,@Value("KPHP colany") String streetName,@Value("Hyderabad") String city) {
		super();
		this.addId = addId;
		this.streetName = streetName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", streetName=" + streetName + ", city=" + city + "]";
	}

}
