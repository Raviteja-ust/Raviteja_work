package com.ust.mappings.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="mobile")
public class Mobile {
	
	@Id
	@GeneratedValue
	private  int id;
	
	@Column(name = "mobile_brand",length = 255)
	private String mobileBrand;
	
	@Column(name="mobile_name", length=255)
	private String mobileName;
	
	@OneToMany(mappedBy="mobile",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Apps> apps;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public Set<Apps> getApps() {
		return apps;
	}

	public void setApps(Set<Apps> apps) {
		this.apps = apps;
	}

	
	public Mobile(String mobileBrand, String mobileName) {
		super();
		this.mobileBrand = mobileBrand;
		this.mobileName = mobileName;
	}

	public Mobile(int id, String mobileBrand, String mobileName, Set<Apps> apps) {
		super();
		this.id = id;
		this.mobileBrand = mobileBrand;
		this.mobileName = mobileName;
		this.apps = apps;
	}

	public Mobile() {
		super();
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileBrand=" + mobileBrand + ", mobileName=" + mobileName + ", apps=" + apps
				+ "]";
	}
	
	
	

}
