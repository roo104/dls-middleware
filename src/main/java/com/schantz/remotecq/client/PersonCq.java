package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PersonCq implements Serializable {
	@JsonProperty("changeDate")
	private LocalDate changeDate = null;
	
	@JsonProperty("birthDate")
	private LocalDate birthDate = null;
	
	@JsonProperty("deathDate")
	private LocalDate deathDate = null;
	
	@JsonProperty("education")
	private String education = null;
	
	@JsonProperty("phoneNumber")
	private String phoneNumber = null;
	
	@JsonProperty("mobileNumber")
	private String mobileNumber = null;
	
	@JsonProperty("emailAddress")
	private String emailAddress = null;
	
	@JsonProperty("workNumber")
	private String workNumber = null;
	
	@JsonProperty("age")
	private AgeCq age = null;
	
	@JsonProperty("addressCollection")
	private List<AddressCq> addressCollection = new ArrayList<AddressCq>();
	
	@JsonProperty("primaryAddress")
	private AddressCq primaryAddress = null;
	
	@JsonProperty("gender")
	private String gender = null;
	
	@JsonProperty("personId")
	private PersonIdCq personId = null;
	
	@JsonProperty("name")
	private PersonNameCq name = null;
	
	@JsonProperty("defaultOutputChannelType")
	private String defaultOutputChannelType = null;
	
	
	public LocalDate getChangeDate() {
		return changeDate;
	}
	
	public void setChangeDate(LocalDate changeDate) {
		this.changeDate = changeDate;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public LocalDate getDeathDate() {
		return deathDate;
	}
	
	public void setDeathDate(LocalDate deathDate) {
		this.deathDate = deathDate;
	}
	
	public String getEducation() {
		return education;
	}
	
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getWorkNumber() {
		return workNumber;
	}
	
	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}
	
	public AgeCq getAge() {
		return age;
	}
	
	public void setAge(AgeCq age) {
		this.age = age;
	}
	
	public PersonCq addAddressCollectionItem(AddressCq addressCollectionItem) {
		this.addressCollection.add(addressCollectionItem);
		return this;
	}
	
	public List<AddressCq> getAddressCollection() {
		return addressCollection;
	}
	
	public void setAddressCollection(List<AddressCq> addressCollection) {
		this.addressCollection = addressCollection;
	}
	
	public AddressCq getPrimaryAddress() {
		return primaryAddress;
	}
	
	public void setPrimaryAddress(AddressCq primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public PersonIdCq getPersonId() {
		return personId;
	}
	
	public void setPersonId(PersonIdCq personId) {
		this.personId = personId;
	}
	
	public PersonNameCq getName() {
		return name;
	}
	
	public void setName(PersonNameCq name) {
		this.name = name;
	}
	
	public String getDefaultOutputChannelType() {
		return defaultOutputChannelType;
	}
	
	public void setDefaultOutputChannelType(String defaultOutputChannelType) {
		this.defaultOutputChannelType = defaultOutputChannelType;
	}
}

