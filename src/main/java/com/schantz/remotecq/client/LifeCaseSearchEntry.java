package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class LifeCaseSearchEntry implements Serializable {
	@JsonProperty("caseName")
	private String caseName = null;
	
	@JsonProperty("lifeCaseIdCq")
	private LifeCaseIdCq lifeCaseIdCq = null;
	
	@JsonProperty("lifeCaseTypeCq")
	private String lifeCaseTypeCq = null;
	
	@JsonProperty("businessEntitiesRelationshipCq")
	private BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq = null;
	
	@JsonProperty("lifeCaseStateCq")
	private String lifeCaseStateCq = null;
	
	@JsonProperty("caseOwner")
	private UserIdCq caseOwner = null;
	
	
	public String getCaseName() {
		return caseName;
	}
	
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}
	
	public LifeCaseIdCq getLifeCaseIdCq() {
		return lifeCaseIdCq;
	}
	
	public void setLifeCaseIdCq(LifeCaseIdCq lifeCaseIdCq) {
		this.lifeCaseIdCq = lifeCaseIdCq;
	}
	
	public String getLifeCaseTypeCq() {
		return lifeCaseTypeCq;
	}
	
	public void setLifeCaseTypeCq(String lifeCaseTypeCq) {
		this.lifeCaseTypeCq = lifeCaseTypeCq;
	}
	
	public BusinessEntitiesRelationshipCq getBusinessEntitiesRelationshipCq() {
		return businessEntitiesRelationshipCq;
	}
	
	public void setBusinessEntitiesRelationshipCq(BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq) {
		this.businessEntitiesRelationshipCq = businessEntitiesRelationshipCq;
	}
	
	public String getLifeCaseStateCq() {
		return lifeCaseStateCq;
	}
	
	public void setLifeCaseStateCq(String lifeCaseStateCq) {
		this.lifeCaseStateCq = lifeCaseStateCq;
	}
	
	public UserIdCq getCaseOwner() {
		return caseOwner;
	}
	
	public void setCaseOwner(UserIdCq caseOwner) {
		this.caseOwner = caseOwner;
	}
}

