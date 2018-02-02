package com.example.gymapp;

import java.util.List;
import java.util.ArrayList;

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
	private String day;
	private String time;
	private String pictureUrl;
	@Indexed(direction =IndexDirection.ASCENDING)
	private int price;
	private int duration;
	private int maxNumber;
	private int numberOfPar;  //number of participants
	private List<User> users;
	private Boolean gymClassFull = false;
	 
	 
	
	
	 protected GymClass() {this.users = new ArrayList<>();}

	 public GymClass(String name, String description,String day,String time, String pictureUrl, int price, int duration, int maxNumber,
				int numberOfPar,List<User> users, Boolean gymClassFull) {
			super();
			this.name = name;
			this.description = description;
			this.day = day;
			this.time =time;
			this.pictureUrl =pictureUrl;
			this.price = price;
			this.duration = duration;
			this.maxNumber = maxNumber;
			this.numberOfPar = numberOfPar;
			this.users = users;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
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

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
