package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class OnHoldLevelCq implements Serializable {
	@JsonProperty("priceGroupIdCq")
	private PriceGroupIdCq priceGroupIdCq = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("agreementIdCq")
	private AgreementIdCq agreementIdCq = null;
	
	
	public PriceGroupIdCq getPriceGroupIdCq() {
		return priceGroupIdCq;
	}
	
	public void setPriceGroupIdCq(PriceGroupIdCq priceGroupIdCq) {
		this.priceGroupIdCq = priceGroupIdCq;
	}
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
	}
	
	public AgreementIdCq getAgreementIdCq() {
		return agreementIdCq;
	}
	
	public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
		this.agreementIdCq = agreementIdCq;
	}
}

