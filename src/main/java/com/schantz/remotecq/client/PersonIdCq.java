package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PersonIdCq implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("registration")
	private String registration = null;
	
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("personName")
	private PersonNameCq personName = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PersonNameCq getPersonName() {
		return personName;
	}
	
	public void setPersonName(PersonNameCq personName) {
		this.personName = personName;
	}
}

