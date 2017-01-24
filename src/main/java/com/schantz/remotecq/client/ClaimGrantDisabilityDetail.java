package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantDisabilityDetail implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("waitingPeriod")
	private String waitingPeriod = null;
	
	@JsonProperty("firstPayment")
	private LocalDate firstPayment = null;
	
	@JsonProperty("lastPayment")
	private LocalDate lastPayment = null;
	
	@JsonProperty("reference")
	private String reference = null;
	
	@JsonProperty("entityNameCq")
	private EntityNameCq entityNameCq = null;
	
	@JsonProperty("claimProductTypeCauseCq")
	private ClaimProductTypeCauseCq claimProductTypeCauseCq = null;
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("lifeCoverStateCq")
	private String lifeCoverStateCq = null;
	
	@JsonProperty("policyHolder")
	private PersonNameCq policyHolder = null;
	
	@JsonProperty("legalTermCq")
	private LegalTermCq legalTermCq = null;
	
	@JsonProperty("isQuote")
	private Boolean isQuote = false;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getWaitingPeriod() {
		return waitingPeriod;
	}
	
	public void setWaitingPeriod(String waitingPeriod) {
		this.waitingPeriod = waitingPeriod;
	}
	
	public LocalDate getFirstPayment() {
		return firstPayment;
	}
	
	public void setFirstPayment(LocalDate firstPayment) {
		this.firstPayment = firstPayment;
	}
	
	public LocalDate getLastPayment() {
		return lastPayment;
	}
	
	public void setLastPayment(LocalDate lastPayment) {
		this.lastPayment = lastPayment;
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
	
	public ClaimProductTypeCauseCq getClaimProductTypeCauseCq() {
		return claimProductTypeCauseCq;
	}
	
	public void setClaimProductTypeCauseCq(ClaimProductTypeCauseCq claimProductTypeCauseCq) {
		this.claimProductTypeCauseCq = claimProductTypeCauseCq;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
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
	
	public LegalTermCq getLegalTermCq() {
		return legalTermCq;
	}
	
	public void setLegalTermCq(LegalTermCq legalTermCq) {
		this.legalTermCq = legalTermCq;
	}
	
	public Boolean getIsQuote() {
		return isQuote;
	}
	
	public void setIsQuote(Boolean isQuote) {
		this.isQuote = isQuote;
	}
}

