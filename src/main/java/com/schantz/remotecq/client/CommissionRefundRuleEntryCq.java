package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRefundRuleEntryCq implements Serializable {
	@JsonProperty("commissionScopeCq")
	private CommissionScopeCq commissionScopeCq = null;
	
	@JsonProperty("commissionRefundPeriodCqCollection")
	private List<CommissionRefundPeriodCq> commissionRefundPeriodCqCollection = new ArrayList<CommissionRefundPeriodCq>();
	
	@JsonProperty("periodLengthCq")
	private String periodLengthCq = null;
	
	@JsonProperty("commissionRefundEntryIdCq")
	private CommissionRefundEntryIdCq commissionRefundEntryIdCq = null;
	
	
	public CommissionScopeCq getCommissionScopeCq() {
		return commissionScopeCq;
	}
	
	public void setCommissionScopeCq(CommissionScopeCq commissionScopeCq) {
		this.commissionScopeCq = commissionScopeCq;
	}
	
	public CommissionRefundRuleEntryCq addCommissionRefundPeriodCqCollectionItem(CommissionRefundPeriodCq commissionRefundPeriodCqCollectionItem) {
		this.commissionRefundPeriodCqCollection.add(commissionRefundPeriodCqCollectionItem);
		return this;
	}
	
	public List<CommissionRefundPeriodCq> getCommissionRefundPeriodCqCollection() {
		return commissionRefundPeriodCqCollection;
	}
	
	public void setCommissionRefundPeriodCqCollection(List<CommissionRefundPeriodCq> commissionRefundPeriodCqCollection) {
		this.commissionRefundPeriodCqCollection = commissionRefundPeriodCqCollection;
	}
	
	public String getPeriodLengthCq() {
		return periodLengthCq;
	}
	
	public void setPeriodLengthCq(String periodLengthCq) {
		this.periodLengthCq = periodLengthCq;
	}
	
	public CommissionRefundEntryIdCq getCommissionRefundEntryIdCq() {
		return commissionRefundEntryIdCq;
	}
	
	public void setCommissionRefundEntryIdCq(CommissionRefundEntryIdCq commissionRefundEntryIdCq) {
		this.commissionRefundEntryIdCq = commissionRefundEntryIdCq;
	}
}

