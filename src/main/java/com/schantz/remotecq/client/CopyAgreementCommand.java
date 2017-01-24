package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CopyAgreementCommand implements Serializable {
	@JsonProperty("agreementName")
	private String agreementName = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("copyMe")
	private AgreementVersionIdCq copyMe = null;
	
	@JsonProperty("companyIdCq")
	private CompanyIdCq companyIdCq = null;
	
	
	public String getAgreementName() {
		return agreementName;
	}
	
	public void setAgreementName(String agreementName) {
		this.agreementName = agreementName;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getVersionNote() {
		return versionNote;
	}
	
	public void setVersionNote(String versionNote) {
		this.versionNote = versionNote;
	}
	
	public AgreementVersionIdCq getCopyMe() {
		return copyMe;
	}
	
	public void setCopyMe(AgreementVersionIdCq copyMe) {
		this.copyMe = copyMe;
	}
	
	public CompanyIdCq getCompanyIdCq() {
		return companyIdCq;
	}
	
	public void setCompanyIdCq(CompanyIdCq companyIdCq) {
		this.companyIdCq = companyIdCq;
	}
}

