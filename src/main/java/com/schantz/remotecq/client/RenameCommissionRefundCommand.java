package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class RenameCommissionRefundCommand implements Serializable {
	@JsonProperty("commissionRefundRuleIdCq")
	private CommissionRefundRuleIdCq commissionRefundRuleIdCq = null;
	
	@JsonProperty("entityNameCq")
	private EntityNameCq entityNameCq = null;
	
	
	public CommissionRefundRuleIdCq getCommissionRefundRuleIdCq() {
		return commissionRefundRuleIdCq;
	}
	
	public void setCommissionRefundRuleIdCq(CommissionRefundRuleIdCq commissionRefundRuleIdCq) {
		this.commissionRefundRuleIdCq = commissionRefundRuleIdCq;
	}
	
	public EntityNameCq getEntityNameCq() {
		return entityNameCq;
	}
	
	public void setEntityNameCq(EntityNameCq entityNameCq) {
		this.entityNameCq = entityNameCq;
	}
}

