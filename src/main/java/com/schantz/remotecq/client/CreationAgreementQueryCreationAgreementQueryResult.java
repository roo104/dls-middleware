package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CreationAgreementQueryCreationAgreementQueryResult implements Serializable {
	@JsonProperty("choosenType")
	private String choosenType = null;
	
	@JsonProperty("agreementVersionId")
	private AgreementVersionIdCq agreementVersionId = null;
	
	@JsonProperty("companyId")
	private CompanyIdCq companyId = null;
	
	
	public String getChoosenType() {
		return choosenType;
	}
	
	public void setChoosenType(String choosenType) {
		this.choosenType = choosenType;
	}
	
	public AgreementVersionIdCq getAgreementVersionId() {
		return agreementVersionId;
	}
	
	public void setAgreementVersionId(AgreementVersionIdCq agreementVersionId) {
		this.agreementVersionId = agreementVersionId;
	}
	
	public CompanyIdCq getCompanyId() {
		return companyId;
	}
	
	public void setCompanyId(CompanyIdCq companyId) {
		this.companyId = companyId;
	}
}

