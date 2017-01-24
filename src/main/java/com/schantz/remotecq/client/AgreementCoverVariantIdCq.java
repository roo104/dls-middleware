package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCoverVariantIdCq implements Serializable {
	@JsonProperty("variantId")
	private String variantId = null;
	
	@JsonProperty("variantName")
	private EntityNameCq variantName = null;
	
	@JsonProperty("agreementCoverIdCq")
	private AgreementCoverIdCq agreementCoverIdCq = null;
	
	
	public String getVariantId() {
		return variantId;
	}
	
	public void setVariantId(String variantId) {
		this.variantId = variantId;
	}
	
	public EntityNameCq getVariantName() {
		return variantName;
	}
	
	public void setVariantName(EntityNameCq variantName) {
		this.variantName = variantName;
	}
	
	public AgreementCoverIdCq getAgreementCoverIdCq() {
		return agreementCoverIdCq;
	}
	
	public void setAgreementCoverIdCq(AgreementCoverIdCq agreementCoverIdCq) {
		this.agreementCoverIdCq = agreementCoverIdCq;
	}
}

