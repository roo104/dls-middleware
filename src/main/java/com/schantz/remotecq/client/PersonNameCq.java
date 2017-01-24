package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PersonNameCq implements Serializable {
	@JsonProperty("salutation")
	private String salutation = null;
	
	@JsonProperty("firstName")
	private String firstName = null;
	
	@JsonProperty("middleName")
	private String middleName = null;
	
	@JsonProperty("lastName")
	private String lastName = null;
	
	
	public String getSalutation() {
		return salutation;
	}
	
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

