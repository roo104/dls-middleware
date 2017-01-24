package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimTreatmentProductCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("claimProductIdCq")
	private ClaimProductIdCq claimProductIdCq = null;
	
	@JsonProperty("maxAmount")
	private Double maxAmount = null;
	
	@JsonProperty("noOfPayments")
	private Long noOfPayments = null;
	
	@JsonProperty("period")
	private Long period = null;
	
	@JsonProperty("noOfPaymentsUsed")
	private Long noOfPaymentsUsed = null;
	
	@JsonProperty("amountUsed")
	private Double amountUsed = null;
	
	@JsonProperty("companyIdCqCollection")
	private List<CompanyIdCq> companyIdCqCollection = new ArrayList<CompanyIdCq>();
	
	@JsonProperty("periodLengthCq")
	private String periodLengthCq = null;
	
	@JsonProperty("periodStartCq")
	private String periodStartCq = null;
	
	@JsonProperty("claimTreatmentTypeCq")
	private ClaimTreatmentTypeCq claimTreatmentTypeCq = null;
	
	@JsonProperty("isLockedToStandardPartner")
	private Boolean isLockedToStandardPartner = false;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ClaimProductIdCq getClaimProductIdCq() {
		return claimProductIdCq;
	}
	
	public void setClaimProductIdCq(ClaimProductIdCq claimProductIdCq) {
		this.claimProductIdCq = claimProductIdCq;
	}
	
	public Double getMaxAmount() {
		return maxAmount;
	}
	
	public void setMaxAmount(Double maxAmount) {
		this.maxAmount = maxAmount;
	}
	
	public Long getNoOfPayments() {
		return noOfPayments;
	}
	
	public void setNoOfPayments(Long noOfPayments) {
		this.noOfPayments = noOfPayments;
	}
	
	public Long getPeriod() {
		return period;
	}
	
	public void setPeriod(Long period) {
		this.period = period;
	}
	
	public Long getNoOfPaymentsUsed() {
		return noOfPaymentsUsed;
	}
	
	public void setNoOfPaymentsUsed(Long noOfPaymentsUsed) {
		this.noOfPaymentsUsed = noOfPaymentsUsed;
	}
	
	public Double getAmountUsed() {
		return amountUsed;
	}
	
	public void setAmountUsed(Double amountUsed) {
		this.amountUsed = amountUsed;
	}
	
	public ClaimTreatmentProductCq addCompanyIdCqCollectionItem(CompanyIdCq companyIdCqCollectionItem) {
		this.companyIdCqCollection.add(companyIdCqCollectionItem);
		return this;
	}
	
	public List<CompanyIdCq> getCompanyIdCqCollection() {
		return companyIdCqCollection;
	}
	
	public void setCompanyIdCqCollection(List<CompanyIdCq> companyIdCqCollection) {
		this.companyIdCqCollection = companyIdCqCollection;
	}
	
	public String getPeriodLengthCq() {
		return periodLengthCq;
	}
	
	public void setPeriodLengthCq(String periodLengthCq) {
		this.periodLengthCq = periodLengthCq;
	}
	
	public String getPeriodStartCq() {
		return periodStartCq;
	}
	
	public void setPeriodStartCq(String periodStartCq) {
		this.periodStartCq = periodStartCq;
	}
	
	public ClaimTreatmentTypeCq getClaimTreatmentTypeCq() {
		return claimTreatmentTypeCq;
	}
	
	public void setClaimTreatmentTypeCq(ClaimTreatmentTypeCq claimTreatmentTypeCq) {
		this.claimTreatmentTypeCq = claimTreatmentTypeCq;
	}
	
	public Boolean getIsLockedToStandardPartner() {
		return isLockedToStandardPartner;
	}
	
	public void setIsLockedToStandardPartner(Boolean isLockedToStandardPartner) {
		this.isLockedToStandardPartner = isLockedToStandardPartner;
	}
}

