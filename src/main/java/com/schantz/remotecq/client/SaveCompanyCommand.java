package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class SaveCompanyCommand implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("organisationName")
	private String organisationName = null;
	
	@JsonProperty("registrationNumber")
	private String registrationNumber = null;
	
	@JsonProperty("primaryPhone")
	private String primaryPhone = null;
	
	@JsonProperty("primaryEmail")
	private String primaryEmail = null;
	
	@JsonProperty("primaryAddress")
	private AddressCq primaryAddress = null;
	
	@JsonProperty("companyTypeCq")
	private String companyTypeCq = null;
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	@JsonProperty("defaultOutputChannelType")
	private String defaultOutputChannelType = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getOrganisationName() {
		return organisationName;
	}
	
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	
	public AddressCq getPrimaryAddress() {
		return primaryAddress;
	}
	
	public void setPrimaryAddress(AddressCq primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	
	public String getCompanyTypeCq() {
		return companyTypeCq;
	}
	
	public void setCompanyTypeCq(String companyTypeCq) {
		this.companyTypeCq = companyTypeCq;
	}
	
	public CompanyIdCq getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(CompanyIdCq companyId) {
		this.companyId = companyId;
	}
	
	public String getDefaultOutputChannelType() {
		return defaultOutputChannelType;
	}
	
	public void setDefaultOutputChannelType(String defaultOutputChannelType) {
		this.defaultOutputChannelType = defaultOutputChannelType;
	}
}

