package com.ust.mappings.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "apps")
public class Apps {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "app_name" ,length = 255)
	private String appName;
	@Column(name="app_size", length=255)
	private int appSize;
	
	@ManyToOne
	@JoinColumn(name="mobile_id",nullable= false)
	private Mobile mobile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public int getAppSize() {
		return appSize;
	}

	public void setAppSize(int appSize) {
		this.appSize = appSize;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public Apps(int id, String appName, int appSize, Mobile mobile) {
		super();
		this.id = id;
		this.appName = appName;
		this.appSize = appSize;
		this.mobile = mobile;
	}

	public Apps() {
		super();
	}
	
	

	public Apps(String appName, int appSize, Mobile mobile) {
		super();
		this.appName = appName;
		this.appSize = appSize;
		this.mobile = mobile;
	}

	public Apps(String appName, int appSize) {
		super();
		this.appName = appName;
		this.appSize = appSize;
	}

	@Override
	public String toString() {
		return "Apps [id=" + id + ", appName=" + appName + ", appSize=" + appSize + ", mobile=" + mobile + "]";
	}
	
	
	
	

}
