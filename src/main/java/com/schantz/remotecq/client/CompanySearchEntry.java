package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CompanySearchEntry implements Serializable {
	@JsonProperty("registration")
	private String registration = null;
	
	@JsonProperty("companyName")
	private String companyName = null;
	
	@JsonProperty("phoneNumber")
	private String phoneNumber = null;
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	@JsonProperty("addressCq")
	private AddressCq addressCq = null;
	
	@JsonProperty("companyType")
	private String companyType = null;
	
	
	public String getRegistration() {
		return registration;
	}
	
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public CompanyIdCq getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(CompanyIdCq companyId) {
		this.companyId = companyId;
	}
	
	public AddressCq getAddressCq() {
		return addressCq;
	}
	
	public void setAddressCq(AddressCq addressCq) {
		this.addressCq = addressCq;
	}
	
	public String getCompanyType() {
		return companyType;
	}
	
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
}

