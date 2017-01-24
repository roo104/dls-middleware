package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRegulationVersionCq implements Serializable {
	@JsonProperty("commissionRuleCqCollection")
	private List<CommissionRuleCq> commissionRuleCqCollection = new ArrayList<CommissionRuleCq>();
	
	@JsonProperty("commissionRegulationVersionInfoCq")
	private CommissionRegulationVersionInfoCq commissionRegulationVersionInfoCq = null;
	
	@JsonProperty("commissionRefundRuleCq")
	private CommissionRefundRuleCq commissionRefundRuleCq = null;
	
	@JsonProperty("commissionRefundRuleVersionIdCq")
	private CommissionRefundRuleVersionIdCq commissionRefundRuleVersionIdCq = null;
	
	public CommissionRegulationVersionCq addCommissionRuleCqCollectionItem(CommissionRuleCq commissionRuleCqCollectionItem) {
		this.commissionRuleCqCollection.add(commissionRuleCqCollectionItem);
		return this;
	}
	
	public List<CommissionRuleCq> getCommissionRuleCqCollection() {
		return commissionRuleCqCollection;
	}
	
	public void setCommissionRuleCqCollection(List<CommissionRuleCq> commissionRuleCqCollection) {
		this.commissionRuleCqCollection = commissionRuleCqCollection;
	}
	
	public CommissionRegulationVersionInfoCq getCommissionRegulationVersionInfoCq() {
		return commissionRegulationVersionInfoCq;
	}
	
	public void setCommissionRegulationVersionInfoCq(CommissionRegulationVersionInfoCq commissionRegulationVersionInfoCq) {
		this.commissionRegulationVersionInfoCq = commissionRegulationVersionInfoCq;
	}
	
	public CommissionRefundRuleCq getCommissionRefundRuleCq() {
		return commissionRefundRuleCq;
	}
	
	public void setCommissionRefundRuleCq(CommissionRefundRuleCq commissionRefundRuleCq) {
		this.commissionRefundRuleCq = commissionRefundRuleCq;
	}
	
	public CommissionRefundRuleVersionIdCq getCommissionRefundRuleVersionIdCq() {
		return commissionRefundRuleVersionIdCq;
	}
	
	public void setCommissionRefundRuleVersionIdCq(CommissionRefundRuleVersionIdCq commissionRefundRuleVersionIdCq) {
		this.commissionRefundRuleVersionIdCq = commissionRefundRuleVersionIdCq;
	}
}

