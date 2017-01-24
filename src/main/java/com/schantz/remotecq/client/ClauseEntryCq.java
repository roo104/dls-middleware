package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ClauseEntryCq implements Serializable {
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("policyCoverIdCq")
	private PolicyCoverIdCq policyCoverIdCq = null;
	
	@JsonProperty("policyPackageIdCq")
	private PolicyPackageIdCq policyPackageIdCq = null;
	
	@JsonProperty("clauseIdCq")
	private ClauseIdCq clauseIdCq = null;
	
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public PolicyCoverIdCq getPolicyCoverIdCq() {
		return policyCoverIdCq;
	}
	
	public void setPolicyCoverIdCq(PolicyCoverIdCq policyCoverIdCq) {
		this.policyCoverIdCq = policyCoverIdCq;
	}
	
	public PolicyPackageIdCq getPolicyPackageIdCq() {
		return policyPackageIdCq;
	}
	
	public void setPolicyPackageIdCq(PolicyPackageIdCq policyPackageIdCq) {
		this.policyPackageIdCq = policyPackageIdCq;
	}
	
	public ClauseIdCq getClauseIdCq() {
		return clauseIdCq;
	}
	
	public void setClauseIdCq(ClauseIdCq clauseIdCq) {
		this.clauseIdCq = clauseIdCq;
	}
}

