package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCoverIdCq implements Serializable {
	@JsonProperty("coverId")
	private String coverId = null;
	
	@JsonProperty("coverName")
	private EntityNameCq coverName = null;
	
	@JsonProperty("agreementPackageIdCq")
	private AgreementPackageIdCq agreementPackageIdCq = null;
	
	
	public String getCoverId() {
		return coverId;
	}
	
	public void setCoverId(String coverId) {
		this.coverId = coverId;
	}
	
	public EntityNameCq getCoverName() {
		return coverName;
	}
	
	public void setCoverName(EntityNameCq coverName) {
		this.coverName = coverName;
	}
	
	public AgreementPackageIdCq getAgreementPackageIdCq() {
		return agreementPackageIdCq;
	}
	
	public void setAgreementPackageIdCq(AgreementPackageIdCq agreementPackageIdCq) {
		this.agreementPackageIdCq = agreementPackageIdCq;
	}
}

