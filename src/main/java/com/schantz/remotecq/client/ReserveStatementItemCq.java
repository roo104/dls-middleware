package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveStatementItemCq implements Serializable {
	@JsonProperty("groupId")
	private CqMessageKey groupId = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("childCollection")
	private List<ReserveStatementItemCq> childCollection = new ArrayList<ReserveStatementItemCq>();
	
	@JsonProperty("isChargeGroup")
	private Boolean isChargeGroup = false;
	
	@JsonProperty("isInValuePeriode")
	private Boolean isInValuePeriode = false;
	
	
	public CqMessageKey getGroupId() {
		return groupId;
	}
	
	public void setGroupId(CqMessageKey groupId) {
		this.groupId = groupId;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public ReserveStatementItemCq addChildCollectionItem(ReserveStatementItemCq childCollectionItem) {
		this.childCollection.add(childCollectionItem);
		return this;
	}
	
	public List<ReserveStatementItemCq> getChildCollection() {
		return childCollection;
	}
	
	public void setChildCollection(List<ReserveStatementItemCq> childCollection) {
		this.childCollection = childCollection;
	}
	
	public Boolean getIsChargeGroup() {
		return isChargeGroup;
	}
	
	public void setIsChargeGroup(Boolean isChargeGroup) {
		this.isChargeGroup = isChargeGroup;
	}
	
	public Boolean getIsInValuePeriode() {
		return isInValuePeriode;
	}
	
	public void setIsInValuePeriode(Boolean isInValuePeriode) {
		this.isInValuePeriode = isInValuePeriode;
	}
}

