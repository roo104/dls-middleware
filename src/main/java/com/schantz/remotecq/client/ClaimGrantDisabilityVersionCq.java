package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantDisabilityVersionCq implements Serializable {
	@JsonProperty("entity")
	private String entity = null;
	
	@JsonProperty("message")
	private CqMessageKey message = null;
	
	@JsonProperty("claimGrantVersionInfoCq")
	private ClaimGrantVersionInfoCq claimGrantVersionInfoCq = null;
	
	@JsonProperty("claimGrantCq")
	private ClaimGrantCq claimGrantCq = null;
	
	@JsonProperty("claimGrantStatusCq")
	private String claimGrantStatusCq = null;
	
	@JsonProperty("insured")
	private PersonIdCq insured = null;
	
	@JsonProperty("claimGrantCauseCq")
	private ClaimGrantCauseCq claimGrantCauseCq = null;
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	@JsonProperty("claimRejectionCauseCq")
	private ClaimRejectionCauseCq claimRejectionCauseCq = null;
	
	@JsonProperty("productType")
	private String productType = null;
	
	@JsonProperty("terms")
	private String terms = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("firstPayment")
	private LocalDate firstPayment = null;
	
	@JsonProperty("lastPayment")
	private LocalDate lastPayment = null;
	
	@JsonProperty("waitingPeriodValue")
	private Long waitingPeriodValue = null;
	
	@JsonProperty("waitingPeriodLength")
	private String waitingPeriodLength = null;
	
	@JsonProperty("claimGrantDisabilityVersionIdCq")
	private ClaimGrantDisabilityVersionIdCq claimGrantDisabilityVersionIdCq = null;
	
	@JsonProperty("claimGrantDisabilityPaymentInfoCqCollection")
	private List<ClaimGrantDisabilityPaymentInfoCq> claimGrantDisabilityPaymentInfoCqCollection = new ArrayList<ClaimGrantDisabilityPaymentInfoCq>();
	
	
	public String getEntity() {
		return entity;
	}
	
	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	public CqMessageKey getMessage() {
		return message;
	}
	
	public void setMessage(CqMessageKey message) {
		this.message = message;
	}
	
	public ClaimGrantVersionInfoCq getClaimGrantVersionInfoCq() {
		return claimGrantVersionInfoCq;
	}
	
	public void setClaimGrantVersionInfoCq(ClaimGrantVersionInfoCq claimGrantVersionInfoCq) {
		this.claimGrantVersionInfoCq = claimGrantVersionInfoCq;
	}
	
	public ClaimGrantCq getClaimGrantCq() {
		return claimGrantCq;
	}
	
	public void setClaimGrantCq(ClaimGrantCq claimGrantCq) {
		this.claimGrantCq = claimGrantCq;
	}
	
	public String getClaimGrantStatusCq() {
		return claimGrantStatusCq;
	}
	
	public void setClaimGrantStatusCq(String claimGrantStatusCq) {
		this.claimGrantStatusCq = claimGrantStatusCq;
	}
	
	public PersonIdCq getInsured() {
		return insured;
	}
	
	public void setInsured(PersonIdCq insured) {
		this.insured = insured;
	}
	
	public ClaimGrantCauseCq getClaimGrantCauseCq() {
		return claimGrantCauseCq;
	}
	
	public void setClaimGrantCauseCq(ClaimGrantCauseCq claimGrantCauseCq) {
		this.claimGrantCauseCq = claimGrantCauseCq;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
	
	public ClaimRejectionCauseCq getClaimRejectionCauseCq() {
		return claimRejectionCauseCq;
	}
	
	public void setClaimRejectionCauseCq(ClaimRejectionCauseCq claimRejectionCauseCq) {
		this.claimRejectionCauseCq = claimRejectionCauseCq;
	}
	
	public String getProductType() {
		return productType;
	}
	
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getTerms() {
		return terms;
	}
	
	public void setTerms(String terms) {
		this.terms = terms;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
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
	
	public Long getWaitingPeriodValue() {
		return waitingPeriodValue;
	}
	
	public void setWaitingPeriodValue(Long waitingPeriodValue) {
		this.waitingPeriodValue = waitingPeriodValue;
	}
	
	public String getWaitingPeriodLength() {
		return waitingPeriodLength;
	}
	
	public void setWaitingPeriodLength(String waitingPeriodLength) {
		this.waitingPeriodLength = waitingPeriodLength;
	}
	
	public ClaimGrantDisabilityVersionIdCq getClaimGrantDisabilityVersionIdCq() {
		return claimGrantDisabilityVersionIdCq;
	}
	
	public void setClaimGrantDisabilityVersionIdCq(ClaimGrantDisabilityVersionIdCq claimGrantDisabilityVersionIdCq) {
		this.claimGrantDisabilityVersionIdCq = claimGrantDisabilityVersionIdCq;
	}
	
	public ClaimGrantDisabilityVersionCq addClaimGrantDisabilityPaymentInfoCqCollectionItem(ClaimGrantDisabilityPaymentInfoCq claimGrantDisabilityPaymentInfoCqCollectionItem) {
		this.claimGrantDisabilityPaymentInfoCqCollection.add(claimGrantDisabilityPaymentInfoCqCollectionItem);
		return this;
	}
	
	public List<ClaimGrantDisabilityPaymentInfoCq> getClaimGrantDisabilityPaymentInfoCqCollection() {
		return claimGrantDisabilityPaymentInfoCqCollection;
	}
	
	public void setClaimGrantDisabilityPaymentInfoCqCollection(List<ClaimGrantDisabilityPaymentInfoCq> claimGrantDisabilityPaymentInfoCqCollection) {
		this.claimGrantDisabilityPaymentInfoCqCollection = claimGrantDisabilityPaymentInfoCqCollection;
	}
}

