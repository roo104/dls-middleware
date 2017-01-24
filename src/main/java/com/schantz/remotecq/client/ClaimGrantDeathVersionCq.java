package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantDeathVersionCq implements Serializable {
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
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("firstPayment")
	private LocalDate firstPayment = null;
	
	@JsonProperty("lastPayment")
	private LocalDate lastPayment = null;
	
	@JsonProperty("terms")
	private String terms = null;
	
	@JsonProperty("claimGrantDeathVersionIdCq")
	private ClaimGrantDeathVersionIdCq claimGrantDeathVersionIdCq = null;
	
	@JsonProperty("claimGrantDeathPaymentInfoCqCollection")
	private List<ClaimGrantDeathPaymentInfoCq> claimGrantDeathPaymentInfoCqCollection = new ArrayList<ClaimGrantDeathPaymentInfoCq>();
	
	
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
	
	public String getTerms() {
		return terms;
	}
	
	public void setTerms(String terms) {
		this.terms = terms;
	}
	
	public ClaimGrantDeathVersionIdCq getClaimGrantDeathVersionIdCq() {
		return claimGrantDeathVersionIdCq;
	}
	
	public void setClaimGrantDeathVersionIdCq(ClaimGrantDeathVersionIdCq claimGrantDeathVersionIdCq) {
		this.claimGrantDeathVersionIdCq = claimGrantDeathVersionIdCq;
	}
	
	public ClaimGrantDeathVersionCq addClaimGrantDeathPaymentInfoCqCollectionItem(ClaimGrantDeathPaymentInfoCq claimGrantDeathPaymentInfoCqCollectionItem) {
		this.claimGrantDeathPaymentInfoCqCollection.add(claimGrantDeathPaymentInfoCqCollectionItem);
		return this;
	}
	
	public List<ClaimGrantDeathPaymentInfoCq> getClaimGrantDeathPaymentInfoCqCollection() {
		return claimGrantDeathPaymentInfoCqCollection;
	}
	
	public void setClaimGrantDeathPaymentInfoCqCollection(List<ClaimGrantDeathPaymentInfoCq> claimGrantDeathPaymentInfoCqCollection) {
		this.claimGrantDeathPaymentInfoCqCollection = claimGrantDeathPaymentInfoCqCollection;
	}
}

