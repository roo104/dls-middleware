package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementRoleValueEntryCq implements Serializable {
	@JsonProperty("agreementRoleTypeCq")
	private String agreementRoleTypeCq = null;
	
	@JsonProperty("agreementRoleValueCq")
	private AgreementRoleValueCq agreementRoleValueCq = null;
	
	
	public String getAgreementRoleTypeCq() {
		return agreementRoleTypeCq;
	}
	
	public void setAgreementRoleTypeCq(String agreementRoleTypeCq) {
		this.agreementRoleTypeCq = agreementRoleTypeCq;
	}
	
	public AgreementRoleValueCq getAgreementRoleValueCq() {
		return agreementRoleValueCq;
	}
	
	public void setAgreementRoleValueCq(AgreementRoleValueCq agreementRoleValueCq) {
		this.agreementRoleValueCq = agreementRoleValueCq;
	}
}

