package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CreateNewAgreementCommand implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("createAsCancelledDraft")
	private Boolean createAsCancelledDraft = false;
	
	@JsonProperty("newAgreementData")
	private NewAgreementData newAgreementData = null;
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public Boolean getCreateAsCancelledDraft() {
		return createAsCancelledDraft;
	}
	
	public void setCreateAsCancelledDraft(Boolean createAsCancelledDraft) {
		this.createAsCancelledDraft = createAsCancelledDraft;
	}
	
	public NewAgreementData getNewAgreementData() {
		return newAgreementData;
	}
	
	public void setNewAgreementData(NewAgreementData newAgreementData) {
		this.newAgreementData = newAgreementData;
	}
	
	public CompanyIdCq getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(CompanyIdCq companyId) {
		this.companyId = companyId;
	}
}

