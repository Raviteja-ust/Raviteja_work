package com.ust.mappings.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="crop")
public class Crop {
	
	@Id
	@GeneratedValue
	private int cropId;
	private String typeOfCrop;
	private String noOfAcersForCrop;
	
	@ManyToOne
	@JoinColumn(name="former_id",nullable= false)
	private Former former;

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public String getTypeOfCrop() {
		return typeOfCrop;
	}

	public void setTypeOfCrop(String typeOfCrop) {
		this.typeOfCrop = typeOfCrop;
	}

	public String getNoOfAcersForCrop() {
		return noOfAcersForCrop;
	}

	public void setNoOfAcersForCrop(String noOfAcersForCrop) {
		this.noOfAcersForCrop = noOfAcersForCrop;
	}

	public Former getFormer() {
		return former;
	}

	public void setFormer(Former former) {
		this.former = former;
	}

	public Crop(int cropId, String typeOfCrop, String noOfAcersForCrop, Former former) {
		super();
		this.cropId = cropId;
		this.typeOfCrop = typeOfCrop;
		this.noOfAcersForCrop = noOfAcersForCrop;
		this.former = former;
	}

	public Crop() {
		super();
	}

	public Crop(String typeOfCrop, String noOfAcersForCrop) {
		super();
		this.typeOfCrop = typeOfCrop;
		this.noOfAcersForCrop = noOfAcersForCrop;
	}

	public Crop(String typeOfCrop, String noOfAcersForCrop, Former former) {
		this.typeOfCrop = typeOfCrop;
		this.noOfAcersForCrop = noOfAcersForCrop;
		this.former = former;
	}

	@Override
	public String toString() {
		return "Crop [cropId=" + cropId + ", typeOfCrop=" + typeOfCrop + ", noOfAcersForCrop=" + noOfAcersForCrop
				+ ", former=" + former + "]";
	}
	
	
	
	

}
