package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ReferralReasonCq implements Serializable {
	@JsonProperty("createdByUser")
	private String createdByUser = null;
	
	@JsonProperty("createdTime")
	private OffsetDateTime createdTime = null;
	
	@JsonProperty("description")
	private CqMessageKey description = null;
	
	@JsonProperty("payablesReceiverReferralTypeCq")
	private String payablesReceiverReferralTypeCq = null;
	
	@JsonProperty("policyId")
	private PolicyIdCq policyId = null;
	
	@JsonProperty("keyPayableLogicCq")
	private String keyPayableLogicCq = null;
	
	
	public String getCreatedByUser() {
		return createdByUser;
	}
	
	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}
	
	public OffsetDateTime getCreatedTime() {
		return createdTime;
	}
	
	public void setCreatedTime(OffsetDateTime createdTime) {
		this.createdTime = createdTime;
	}
	
	public CqMessageKey getDescription() {
		return description;
	}
	
	public void setDescription(CqMessageKey description) {
		this.description = description;
	}
	
	public String getPayablesReceiverReferralTypeCq() {
		return payablesReceiverReferralTypeCq;
	}
	
	public void setPayablesReceiverReferralTypeCq(String payablesReceiverReferralTypeCq) {
		this.payablesReceiverReferralTypeCq = payablesReceiverReferralTypeCq;
	}
	
	public PolicyIdCq getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(PolicyIdCq policyId) {
		this.policyId = policyId;
	}
	
	public String getKeyPayableLogicCq() {
		return keyPayableLogicCq;
	}
	
	public void setKeyPayableLogicCq(String keyPayableLogicCq) {
		this.keyPayableLogicCq = keyPayableLogicCq;
	}
}

