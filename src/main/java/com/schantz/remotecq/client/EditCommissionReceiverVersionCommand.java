package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class EditCommissionReceiverVersionCommand implements Serializable {
	@JsonProperty("draftId")
	private CommissionReceiverVersionIdCq draftId = null;
	
	@JsonProperty("externReference")
	private String externReference = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("commissionRegulationIdCq")
	private CommissionRegulationIdCq commissionRegulationIdCq = null;
	
	@JsonProperty("isActive")
	private Boolean isActive = false;
	
	
	public CommissionReceiverVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(CommissionReceiverVersionIdCq draftId) {
		this.draftId = draftId;
	}
	
	public String getExternReference() {
		return externReference;
	}
	
	public void setExternReference(String externReference) {
		this.externReference = externReference;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public CommissionRegulationIdCq getCommissionRegulationIdCq() {
		return commissionRegulationIdCq;
	}
	
	public void setCommissionRegulationIdCq(CommissionRegulationIdCq commissionRegulationIdCq) {
		this.commissionRegulationIdCq = commissionRegulationIdCq;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}

