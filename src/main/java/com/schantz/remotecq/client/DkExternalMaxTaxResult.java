package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DkExternalMaxTaxResult implements Serializable {
	@JsonProperty("externalReferenceId")
	private String externalReferenceId = null;
	
	@JsonProperty("dkMaxTaxData")
	private DkMaxTaxData dkMaxTaxData = null;
	
	
	public String getExternalReferenceId() {
		return externalReferenceId;
	}
	
	public void setExternalReferenceId(String externalReferenceId) {
		this.externalReferenceId = externalReferenceId;
	}
	
	public DkMaxTaxData getDkMaxTaxData() {
		return dkMaxTaxData;
	}
	
	public void setDkMaxTaxData(DkMaxTaxData dkMaxTaxData) {
		this.dkMaxTaxData = dkMaxTaxData;
	}
}

