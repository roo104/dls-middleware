package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RoleValuePossibilitiesAgreementQueryRoleValuePossibilitiesAgreementQueryResult implements Serializable {
	@JsonProperty("agreementRoleTypeCq")
	private String agreementRoleTypeCq = null;
	
	
	public String getAgreementRoleTypeCq() {
		return agreementRoleTypeCq;
	}
	
	public void setAgreementRoleTypeCq(String agreementRoleTypeCq) {
		this.agreementRoleTypeCq = agreementRoleTypeCq;
	}
}

