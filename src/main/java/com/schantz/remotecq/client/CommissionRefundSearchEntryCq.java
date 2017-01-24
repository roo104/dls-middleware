package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRefundSearchEntryCq implements Serializable {
	@JsonProperty("commissionRefundRuleVersionIdCq")
	private CommissionRefundRuleVersionIdCq commissionRefundRuleVersionIdCq = null;
	
	@JsonProperty("commissionRefundRuleCq")
	private CommissionRefundRuleCq commissionRefundRuleCq = null;
	
	@JsonProperty("isCancelled")
	private Boolean isCancelled = false;
	
	@JsonProperty("isDraft")
	private Boolean isDraft = false;
	
	
	public CommissionRefundRuleVersionIdCq getCommissionRefundRuleVersionIdCq() {
		return commissionRefundRuleVersionIdCq;
	}
	
	public void setCommissionRefundRuleVersionIdCq(CommissionRefundRuleVersionIdCq commissionRefundRuleVersionIdCq) {
		this.commissionRefundRuleVersionIdCq = commissionRefundRuleVersionIdCq;
	}
	
	public CommissionRefundRuleCq getCommissionRefundRuleCq() {
		return commissionRefundRuleCq;
	}
	
	public void setCommissionRefundRuleCq(CommissionRefundRuleCq commissionRefundRuleCq) {
		this.commissionRefundRuleCq = commissionRefundRuleCq;
	}
	
	public Boolean getIsCancelled() {
		return isCancelled;
	}
	
	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	
	public Boolean getIsDraft() {
		return isDraft;
	}
	
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
}

