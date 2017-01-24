package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCostIdCq implements Serializable {
	@JsonProperty("costUid")
	private String costUid = null;
	
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("categoryType")
	private String categoryType = null;
	
	@JsonProperty("scopeId")
	private ScopeIdCq scopeId = null;
	
	
	public String getCostUid() {
		return costUid;
	}
	
	public void setCostUid(String costUid) {
		this.costUid = costUid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategoryType() {
		return categoryType;
	}
	
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	
	public ScopeIdCq getScopeId() {
		return scopeId;
	}
	
	public void setScopeId(ScopeIdCq scopeId) {
		this.scopeId = scopeId;
	}
}

