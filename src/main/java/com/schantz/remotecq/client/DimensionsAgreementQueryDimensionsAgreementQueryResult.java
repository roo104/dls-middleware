package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DimensionsAgreementQueryDimensionsAgreementQueryResult implements Serializable {
	@JsonProperty("agreementVersionId")
	private AgreementVersionIdCq agreementVersionId = null;
	
	
	public AgreementVersionIdCq getAgreementVersionId() {
		return agreementVersionId;
	}
	
	public void setAgreementVersionId(AgreementVersionIdCq agreementVersionId) {
		this.agreementVersionId = agreementVersionId;
	}
}

