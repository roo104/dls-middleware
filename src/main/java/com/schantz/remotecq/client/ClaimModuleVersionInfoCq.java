package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimModuleVersionInfoCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("transactionalStart")
	private OffsetDateTime transactionalStart = null;
	
	@JsonProperty("transactionalEnd")
	private OffsetDateTime transactionalEnd = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("maximumAmountYearly")
	private Double maximumAmountYearly = null;
	
	@JsonProperty("maximumAmountDuration")
	private Double maximumAmountDuration = null;
	
	@JsonProperty("claimModuleVersionIdCq")
	private ClaimModuleVersionIdCq claimModuleVersionIdCq = null;
	
	@JsonProperty("legalTermIdCq")
	private LegalTermIdCq legalTermIdCq = null;
	
	@JsonProperty("isCancelled")
	private Boolean isCancelled = false;
	
	@JsonProperty("isAttachableToAgreement")
	private Boolean isAttachableToAgreement = false;
	
	@JsonProperty("isDraft")
	private Boolean isDraft = false;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public OffsetDateTime getTransactionalStart() {
		return transactionalStart;
	}
	
	public void setTransactionalStart(OffsetDateTime transactionalStart) {
		this.transactionalStart = transactionalStart;
	}
	
	public OffsetDateTime getTransactionalEnd() {
		return transactionalEnd;
	}
	
	public void setTransactionalEnd(OffsetDateTime transactionalEnd) {
		this.transactionalEnd = transactionalEnd;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getMaximumAmountYearly() {
		return maximumAmountYearly;
	}
	
	public void setMaximumAmountYearly(Double maximumAmountYearly) {
		this.maximumAmountYearly = maximumAmountYearly;
	}
	
	public Double getMaximumAmountDuration() {
		return maximumAmountDuration;
	}
	
	public void setMaximumAmountDuration(Double maximumAmountDuration) {
		this.maximumAmountDuration = maximumAmountDuration;
	}
	
	public ClaimModuleVersionIdCq getClaimModuleVersionIdCq() {
		return claimModuleVersionIdCq;
	}
	
	public void setClaimModuleVersionIdCq(ClaimModuleVersionIdCq claimModuleVersionIdCq) {
		this.claimModuleVersionIdCq = claimModuleVersionIdCq;
	}
	
	public LegalTermIdCq getLegalTermIdCq() {
		return legalTermIdCq;
	}
	
	public void setLegalTermIdCq(LegalTermIdCq legalTermIdCq) {
		this.legalTermIdCq = legalTermIdCq;
	}
	
	public Boolean getIsCancelled() {
		return isCancelled;
	}
	
	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	
	public Boolean getIsAttachableToAgreement() {
		return isAttachableToAgreement;
	}
	
	public void setIsAttachableToAgreement(Boolean isAttachableToAgreement) {
		this.isAttachableToAgreement = isAttachableToAgreement;
	}
	
	public Boolean getIsDraft() {
		return isDraft;
	}
	
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
}

