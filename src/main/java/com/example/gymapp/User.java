package com.example.gymapp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Users")
public class User {

	
	@Id
	private String id;	
	private String name;
	private String email;
	private String photoUrl;
	
	
	
	public User() {
		super();
	
	}
	public User(String name, String email, String photoUrl) {
		super();
		this.name = name;
		this.email = email;
		this.photoUrl = photoUrl;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	
}
