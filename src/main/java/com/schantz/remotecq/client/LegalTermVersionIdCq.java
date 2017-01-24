package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class LegalTermVersionIdCq implements Serializable {
	@JsonProperty("legalTermVersionUid")
	private String legalTermVersionUid = null;
	
	@JsonProperty("legalTermVersionId")
	private String legalTermVersionId = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("legalTermIdCq")
	private LegalTermIdCq legalTermIdCq = null;
	
	@JsonProperty("isCancelled")
	private Boolean isCancelled = false;
	
	@JsonProperty("isDraft")
	private Boolean isDraft = false;
	
	
	public String getLegalTermVersionUid() {
		return legalTermVersionUid;
	}
	
	public void setLegalTermVersionUid(String legalTermVersionUid) {
		this.legalTermVersionUid = legalTermVersionUid;
	}
	
	public String getLegalTermVersionId() {
		return legalTermVersionId;
	}
	
	public void setLegalTermVersionId(String legalTermVersionId) {
		this.legalTermVersionId = legalTermVersionId;
	}
	
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
	
	public Boolean getIsDraft() {
		return isDraft;
	}
	
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
}

