package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionDataCq implements Serializable {
	@JsonProperty("noCommissionReason")
	private String noCommissionReason = null;
	
	@JsonProperty("commissionDataItemCqCollection")
	private List<CommissionDataItemCq> commissionDataItemCqCollection = new ArrayList<CommissionDataItemCq>();
	
	@JsonProperty("isNoCommission")
	private Boolean isNoCommission = false;
	
	
	public String getNoCommissionReason() {
		return noCommissionReason;
	}
	
	public void setNoCommissionReason(String noCommissionReason) {
		this.noCommissionReason = noCommissionReason;
	}
	
	public CommissionDataCq addCommissionDataItemCqCollectionItem(CommissionDataItemCq commissionDataItemCqCollectionItem) {
		this.commissionDataItemCqCollection.add(commissionDataItemCqCollectionItem);
		return this;
	}
	
	public List<CommissionDataItemCq> getCommissionDataItemCqCollection() {
		return commissionDataItemCqCollection;
	}
	
	public void setCommissionDataItemCqCollection(List<CommissionDataItemCq> commissionDataItemCqCollection) {
		this.commissionDataItemCqCollection = commissionDataItemCqCollection;
	}
	
	public Boolean getIsNoCommission() {
		return isNoCommission;
	}
	
	public void setIsNoCommission(Boolean isNoCommission) {
		this.isNoCommission = isNoCommission;
	}
}

