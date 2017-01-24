package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class StartProcessInstanceCommand implements Serializable {
	@JsonProperty("processVersionIdCq")
	private ProcessVersionIdCq processVersionIdCq = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("companyIdCq")
	private CompanyIdCq companyIdCq = null;
	
	@JsonProperty("personIdCq")
	private PersonIdCq personIdCq = null;
	
	@JsonProperty("agreementIdCq")
	private AgreementIdCq agreementIdCq = null;
	
	@JsonProperty("configurationFieldCqCollection")
	private List<ConfigurationFieldCq> configurationFieldCqCollection = new ArrayList<ConfigurationFieldCq>();
	
	@JsonProperty("priceGroupIdCq")
	private PriceGroupIdCq priceGroupIdCq = null;
	
	@JsonProperty("lifeCaseIdCq")
	private LifeCaseIdCq lifeCaseIdCq = null;
	
	
	public ProcessVersionIdCq getProcessVersionIdCq() {
		return processVersionIdCq;
	}
	
	public void setProcessVersionIdCq(ProcessVersionIdCq processVersionIdCq) {
		this.processVersionIdCq = processVersionIdCq;
	}
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
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
	
	public AgreementIdCq getAgreementIdCq() {
		return agreementIdCq;
	}
	
	public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
		this.agreementIdCq = agreementIdCq;
	}
	
	public StartProcessInstanceCommand addConfigurationFieldCqCollectionItem(ConfigurationFieldCq configurationFieldCqCollectionItem) {
		this.configurationFieldCqCollection.add(configurationFieldCqCollectionItem);
		return this;
	}
	
	public List<ConfigurationFieldCq> getConfigurationFieldCqCollection() {
		return configurationFieldCqCollection;
	}
	
	public void setConfigurationFieldCqCollection(List<ConfigurationFieldCq> configurationFieldCqCollection) {
		this.configurationFieldCqCollection = configurationFieldCqCollection;
	}
	
	public PriceGroupIdCq getPriceGroupIdCq() {
		return priceGroupIdCq;
	}
	
	public void setPriceGroupIdCq(PriceGroupIdCq priceGroupIdCq) {
		this.priceGroupIdCq = priceGroupIdCq;
	}
	
	public LifeCaseIdCq getLifeCaseIdCq() {
		return lifeCaseIdCq;
	}
	
	public void setLifeCaseIdCq(LifeCaseIdCq lifeCaseIdCq) {
		this.lifeCaseIdCq = lifeCaseIdCq;
	}
}

