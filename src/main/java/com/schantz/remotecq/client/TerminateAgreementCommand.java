package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TerminateAgreementCommand implements Serializable {
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("agreementVersionIdCq")
	private AgreementVersionIdCq agreementVersionIdCq = null;
	
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getVersionNote() {
		return versionNote;
	}
	
	public void setVersionNote(String versionNote) {
		this.versionNote = versionNote;
	}
	
	public AgreementVersionIdCq getAgreementVersionIdCq() {
		return agreementVersionIdCq;
	}
	
	public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
		this.agreementVersionIdCq = agreementVersionIdCq;
	}
}

