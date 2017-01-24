package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRuleEntryCq implements Serializable {
	@JsonProperty("linenumber")
	private Long linenumber = null;
	
	@JsonProperty("rate")
	private Double rate = null;
	
	@JsonProperty("commissionScopeCq")
	private CommissionScopeCq commissionScopeCq = null;
	
	@JsonProperty("commissionRuleDistributionCqCollection")
	private List<CommissionRuleDistributionCq> commissionRuleDistributionCqCollection = new ArrayList<CommissionRuleDistributionCq>();
	
	@JsonProperty("commissionRateTypeCq")
	private String commissionRateTypeCq = null;
	
	@JsonProperty("commissionRuleEntryIdCq")
	private CommissionRuleEntryIdCq commissionRuleEntryIdCq = null;
	
	
	public Long getLinenumber() {
		return linenumber;
	}
	
	public void setLinenumber(Long linenumber) {
		this.linenumber = linenumber;
	}
	
	public Double getRate() {
		return rate;
	}
	
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	public CommissionScopeCq getCommissionScopeCq() {
		return commissionScopeCq;
	}
	
	public void setCommissionScopeCq(CommissionScopeCq commissionScopeCq) {
		this.commissionScopeCq = commissionScopeCq;
	}
	
	public CommissionRuleEntryCq addCommissionRuleDistributionCqCollectionItem(CommissionRuleDistributionCq commissionRuleDistributionCqCollectionItem) {
		this.commissionRuleDistributionCqCollection.add(commissionRuleDistributionCqCollectionItem);
		return this;
	}
	
	public List<CommissionRuleDistributionCq> getCommissionRuleDistributionCqCollection() {
		return commissionRuleDistributionCqCollection;
	}
	
	public void setCommissionRuleDistributionCqCollection(List<CommissionRuleDistributionCq> commissionRuleDistributionCqCollection) {
		this.commissionRuleDistributionCqCollection = commissionRuleDistributionCqCollection;
	}
	
	public String getCommissionRateTypeCq() {
		return commissionRateTypeCq;
	}
	
	public void setCommissionRateTypeCq(String commissionRateTypeCq) {
		this.commissionRateTypeCq = commissionRateTypeCq;
	}
	
	public CommissionRuleEntryIdCq getCommissionRuleEntryIdCq() {
		return commissionRuleEntryIdCq;
	}
	
	public void setCommissionRuleEntryIdCq(CommissionRuleEntryIdCq commissionRuleEntryIdCq) {
		this.commissionRuleEntryIdCq = commissionRuleEntryIdCq;
	}
}

