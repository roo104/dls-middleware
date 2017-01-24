package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRefundRuleCq implements Serializable {
	@JsonProperty("commissionRefundRuleIdCq")
	private CommissionRefundRuleIdCq commissionRefundRuleIdCq = null;
	
	@JsonProperty("name")
	private EntityNameCq name = null;
	
	@JsonProperty("description")
	private EntityNameCq description = null;
	
	@JsonProperty("isCancelled")
	private Boolean isCancelled = false;
	
	
	public CommissionRefundRuleIdCq getCommissionRefundRuleIdCq() {
		return commissionRefundRuleIdCq;
	}
	
	public void setCommissionRefundRuleIdCq(CommissionRefundRuleIdCq commissionRefundRuleIdCq) {
		this.commissionRefundRuleIdCq = commissionRefundRuleIdCq;
	}
	
	public EntityNameCq getName() {
		return name;
	}
	
	public void setName(EntityNameCq name) {
		this.name = name;
	}
	
	public EntityNameCq getDescription() {
		return description;
	}
	
	public void setDescription(EntityNameCq description) {
		this.description = description;
	}
	
	public Boolean getIsCancelled() {
		return isCancelled;
	}
	
	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
}

