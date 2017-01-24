package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantDeathDetail implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("period")
	private String period = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("reference")
	private String reference = null;
	
	@JsonProperty("entityNameCq")
	private EntityNameCq entityNameCq = null;
	
	@JsonProperty("taxCodeCq")
	private String taxCodeCq = null;
	
	@JsonProperty("benefitTypeCq")
	private String benefitTypeCq = null;
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	@JsonProperty("lifeCoverStateCq")
	private String lifeCoverStateCq = null;
	
	@JsonProperty("policyHolder")
	private PersonNameCq policyHolder = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("beneficiaryCollection")
	private List<LegalPartyIdCq> beneficiaryCollection = new ArrayList<LegalPartyIdCq>();
	
	@JsonProperty("isQuote")
	private Boolean isQuote = false;
	
	@JsonProperty("isConverted")
	private Boolean isConverted = false;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getPeriod() {
		return period;
	}
	
	public void setPeriod(String period) {
		this.period = period;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public EntityNameCq getEntityNameCq() {
		return entityNameCq;
	}
	
	public void setEntityNameCq(EntityNameCq entityNameCq) {
		this.entityNameCq = entityNameCq;
	}
	
	public String getTaxCodeCq() {
		return taxCodeCq;
	}
	
	public void setTaxCodeCq(String taxCodeCq) {
		this.taxCodeCq = taxCodeCq;
	}
	
	public String getBenefitTypeCq() {
		return benefitTypeCq;
	}
	
	public void setBenefitTypeCq(String benefitTypeCq) {
		this.benefitTypeCq = benefitTypeCq;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
	
	public String getLifeCoverStateCq() {
		return lifeCoverStateCq;
	}
	
	public void setLifeCoverStateCq(String lifeCoverStateCq) {
		this.lifeCoverStateCq = lifeCoverStateCq;
	}
	
	public PersonNameCq getPolicyHolder() {
		return policyHolder;
	}
	
	public void setPolicyHolder(PersonNameCq policyHolder) {
		this.policyHolder = policyHolder;
	}
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
	}
	
	public ClaimGrantDeathDetail addBeneficiaryCollectionItem(LegalPartyIdCq beneficiaryCollectionItem) {
		this.beneficiaryCollection.add(beneficiaryCollectionItem);
		return this;
	}
	
	public List<LegalPartyIdCq> getBeneficiaryCollection() {
		return beneficiaryCollection;
	}
	
	public void setBeneficiaryCollection(List<LegalPartyIdCq> beneficiaryCollection) {
		this.beneficiaryCollection = beneficiaryCollection;
	}
	
	public Boolean getIsQuote() {
		return isQuote;
	}
	
	public void setIsQuote(Boolean isQuote) {
		this.isQuote = isQuote;
	}
	
	public Boolean getIsConverted() {
		return isConverted;
	}
	
	public void setIsConverted(Boolean isConverted) {
		this.isConverted = isConverted;
	}
}

