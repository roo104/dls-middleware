package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementHealthGroupQueryAgreementHealthGroupQueryResult implements Serializable {
	@JsonProperty("searchDate")
	private LocalDate searchDate = null;
	
	@JsonProperty("agreementVersionIdCq")
	private AgreementVersionIdCq agreementVersionIdCq = null;
	
	
	public LocalDate getSearchDate() {
		return searchDate;
	}
	
	public void setSearchDate(LocalDate searchDate) {
		this.searchDate = searchDate;
	}
	
	public AgreementVersionIdCq getAgreementVersionIdCq() {
		return agreementVersionIdCq;
	}
	
	public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
		this.agreementVersionIdCq = agreementVersionIdCq;
	}
}

