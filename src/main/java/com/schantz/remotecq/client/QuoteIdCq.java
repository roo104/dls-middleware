package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class QuoteIdCq implements Serializable {
	@JsonProperty("uniqueId")
	private String uniqueId = null;
	
	@JsonProperty("quotePolicyId")
	private PolicyIdCq quotePolicyId = null;
	
	@JsonProperty("basePolicyId")
	private PolicyIdCq basePolicyId = null;
	
	
	public String getUniqueId() {
		return uniqueId;
	}
	
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public PolicyIdCq getQuotePolicyId() {
		return quotePolicyId;
	}
	
	public void setQuotePolicyId(PolicyIdCq quotePolicyId) {
		this.quotePolicyId = quotePolicyId;
	}
	
	public PolicyIdCq getBasePolicyId() {
		return basePolicyId;
	}
	
	public void setBasePolicyId(PolicyIdCq basePolicyId) {
		this.basePolicyId = basePolicyId;
	}
}

