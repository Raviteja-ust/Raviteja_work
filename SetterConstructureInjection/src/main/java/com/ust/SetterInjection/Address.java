package com.ust.SetterInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("101")
	private int addId;
	
	@Value("KPHP colany")
	private String streetName;
	
	@Value("Hyderabad")
	private String city;
	
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", streetName=" + streetName + ", city=" + city + "]";
	}
	
	

}
