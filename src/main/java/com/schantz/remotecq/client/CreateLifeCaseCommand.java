package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CreateLifeCaseCommand implements Serializable {
	@JsonProperty("caseName")
	private String caseName = null;
	
	@JsonProperty("lifeCaseTypeCq")
	private String lifeCaseTypeCq = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("agreementIdCq")
	private AgreementIdCq agreementIdCq = null;
	
	@JsonProperty("companyIdCq")
	private CompanyIdCq companyIdCq = null;
	
	@JsonProperty("personIdCq")
	private PersonIdCq personIdCq = null;
	
	@JsonProperty("configurationFieldCqCollection")
	private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();
	
	@JsonProperty("caseOwner")
	private UserIdCq caseOwner = null;
	
	@JsonProperty("claimCq")
	private ClaimCq claimCq = null;
	
	@JsonProperty("claimIdCq")
	private ClaimIdCq claimIdCq = null;
	
	
	public String getCaseName() {
		return caseName;
	}
	
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}
	
	public String getLifeCaseTypeCq() {
		return lifeCaseTypeCq;
	}
	
	public void setLifeCaseTypeCq(String lifeCaseTypeCq) {
		this.lifeCaseTypeCq = lifeCaseTypeCq;
	}
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
	}
	
	public AgreementIdCq getAgreementIdCq() {
		return agreementIdCq;
	}
	
	public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
		this.agreementIdCq = agreementIdCq;
	}
	
	public CompanyIdCq getCompanyIdCq() {
		return companyIdCq;
	}
	
	public void setCompanyIdCq(CompanyIdCq companyIdCq) {
		this.companyIdCq = companyIdCq;
	}
	
	public PersonIdCq getPersonIdCq() {
		return personIdCq;
	}
	
	public void setPersonIdCq(PersonIdCq personIdCq) {
		this.personIdCq = personIdCq;
	}
	
	public CreateLifeCaseCommand addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
		this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
		return this;
	}
	
	public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
		return configurationFieldCqCollection;
	}
	
	public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
		this.configurationFieldCqCollection = configurationFieldCqCollection;
	}
	
	public UserIdCq getCaseOwner() {
		return caseOwner;
	}
	
	public void setCaseOwner(UserIdCq caseOwner) {
		this.caseOwner = caseOwner;
	}
	
	public ClaimCq getClaimCq() {
		return claimCq;
	}
	
	public void setClaimCq(ClaimCq claimCq) {
		this.claimCq = claimCq;
	}
	
	public ClaimIdCq getClaimIdCq() {
		return claimIdCq;
	}
	
	public void setClaimIdCq(ClaimIdCq claimIdCq) {
		this.claimIdCq = claimIdCq;
	}
}

