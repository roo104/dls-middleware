package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class NewUserCommand implements Serializable {
	@JsonProperty("userId")
	private String userId = null;
	
	@JsonProperty("userPassword")
	private String userPassword = null;
	
	@JsonProperty("email")
	private String email = null;
	
	@JsonProperty("title")
	private String title = null;
	
	@JsonProperty("firstName")
	private String firstName = null;
	
	@JsonProperty("lastName")
	private String lastName = null;
	
	@JsonProperty("phoneNumber")
	private String phoneNumber = null;
	
	@JsonProperty("description")
	private String description = null;
	
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}

