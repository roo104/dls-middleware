package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementValidationMessageCq implements Serializable {
	@JsonProperty("validationException")
	private CqMessageKey validationException = null;
	
	@JsonProperty("agreementValidationMessagePlacementCq")
	private AgreementValidationMessagePlacementCq agreementValidationMessagePlacementCq = null;
	
	
	public CqMessageKey getValidationException() {
		return validationException;
	}
	
	public void setValidationException(CqMessageKey validationException) {
		this.validationException = validationException;
	}
	
	public AgreementValidationMessagePlacementCq getAgreementValidationMessagePlacementCq() {
		return agreementValidationMessagePlacementCq;
	}
	
	public void setAgreementValidationMessagePlacementCq(AgreementValidationMessagePlacementCq agreementValidationMessagePlacementCq) {
		this.agreementValidationMessagePlacementCq = agreementValidationMessagePlacementCq;
	}
}

