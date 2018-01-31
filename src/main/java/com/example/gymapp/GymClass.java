package com.example.gymapp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="GymClasses")
public class GymClass {
	
	@Id
	 private String id;	 
	 private String name;
	 private String description;
	 @Indexed(direction =IndexDirection.ASCENDING)
	 private String price;
	 private String duration;
	 private int maxNumber;
	 private int numberOfPar;  //number of participants
	 private Boolean gymClassFull = false;
	 
	 
	 public GymClass() {
			super();
			
		} 
	 
	 public GymClass(String name, String description, String price, String duration, int maxNumber,
				int numberOfPar, Boolean gymClassFull) {
			super();
			this.name = name;
			this.description = description;
			this.price = price;
			this.duration = duration;
			this.maxNumber = maxNumber;
			this.numberOfPar = numberOfPar;
			this.gymClassFull = gymClassFull;
		} 
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getMaxNumber() {
		return maxNumber;
	}
	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}
	public int getNumberOfPar() {
		return numberOfPar;
	}
	public void setNumberOfPar(int numberOfPar) {
		this.numberOfPar = numberOfPar;
	}
	public Boolean getGymClassFull() {
		return gymClassFull;
	}
	public void setGymClassFull(Boolean gymClassFull) {
		this.gymClassFull = gymClassFull;
	}
}
