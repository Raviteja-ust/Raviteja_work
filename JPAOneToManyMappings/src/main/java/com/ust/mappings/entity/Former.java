package com.ust.mappings.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="former")
public class Former {
	@Id
	@GeneratedValue
	private int formerId;
	private String formerName;
	private int noOfAcres;
	private String typeOfCrop;
	
	@OneToMany(mappedBy="former",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Crop> crop;

	public Former(int formerId, String formerName, int noOfAcres, String typeOfCrop, List<Crop> crop) {
		super();
		this.formerId = formerId;
		this.formerName = formerName;
		this.noOfAcres = noOfAcres;
		this.typeOfCrop = typeOfCrop;
		this.crop = crop;
	}

	public Former() {
		super();
	}

	public Former(String formerName, int noOfAcres, String typeOfCrop, List<Crop> crop) {
		super();
		this.formerName = formerName;
		this.noOfAcres = noOfAcres;
		this.typeOfCrop = typeOfCrop;
		this.crop = crop;
	}

	public Former(String formerName, int noOfAcres, String typeOfCrop) {
		super();
		this.formerName = formerName;
		this.noOfAcres = noOfAcres;
		this.typeOfCrop = typeOfCrop;
	}

	public int getFormerId() {
		return formerId;
	}

	public void setFormerId(int formerId) {
		this.formerId = formerId;
	}

	public String getFormerName() {
		return formerName;
	}

	public void setFormerName(String formerName) {
		this.formerName = formerName;
	}

	public int getNoOfAcres() {
		return noOfAcres;
	}

	public void setNoOfAcres(int noOfAcres) {
		this.noOfAcres = noOfAcres;
	}

	public String getTypeOfCrop() {
		return typeOfCrop;
	}

	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}

	public List<Crop> getCrop() {
		return crop;
	}

	public void setCrop(List<Crop> crop) {
		this.crop = crop;
	}

	@Override
	public String toString() {
		return "Former [formerId=" + formerId + ", formerName=" + formerName + ", noOfAcres=" + noOfAcres
				+ ", typeOfCrop=" + typeOfCrop + ", crop=" + crop + "]";
	}
	
		

}
