package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class SetPolicyOnHoldCommand implements Serializable {
	@JsonProperty("policyId")
	private PolicyIdCq policyId = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("onHoldTypeCq")
	private String onHoldTypeCq = null;
	
	@JsonProperty("onHoldReasonTypeCq")
	private String onHoldReasonTypeCq = null;
	
	
	public PolicyIdCq getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(PolicyIdCq policyId) {
		this.policyId = policyId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getOnHoldTypeCq() {
		return onHoldTypeCq;
	}
	
	public void setOnHoldTypeCq(String onHoldTypeCq) {
		this.onHoldTypeCq = onHoldTypeCq;
	}
	
	public String getOnHoldReasonTypeCq() {
		return onHoldReasonTypeCq;
	}
	
	public void setOnHoldReasonTypeCq(String onHoldReasonTypeCq) {
		this.onHoldReasonTypeCq = onHoldReasonTypeCq;
	}
}

