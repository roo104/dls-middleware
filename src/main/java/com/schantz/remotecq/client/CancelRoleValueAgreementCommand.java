package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CancelRoleValueAgreementCommand implements Serializable {
	@JsonProperty("agreementRoleTypeCq")
	private String agreementRoleTypeCq = null;
	
	@JsonProperty("agreementIdCq")
	private AgreementIdCq agreementIdCq = null;
	
	
	public String getAgreementRoleTypeCq() {
		return agreementRoleTypeCq;
	}
	
	public void setAgreementRoleTypeCq(String agreementRoleTypeCq) {
		this.agreementRoleTypeCq = agreementRoleTypeCq;
	}
	
	public AgreementIdCq getAgreementIdCq() {
		return agreementIdCq;
	}
	
	public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
		this.agreementIdCq = agreementIdCq;
	}
}

