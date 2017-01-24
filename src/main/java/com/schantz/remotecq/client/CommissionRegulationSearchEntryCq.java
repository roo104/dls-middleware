package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionRegulationSearchEntryCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("createdBy")
	private String createdBy = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("name")
	private EntityNameCq name = null;
	
	@JsonProperty("commissionRegulationVersionIdCq")
	private CommissionRegulationVersionIdCq commissionRegulationVersionIdCq = null;
	
	@JsonProperty("commissionRegulationIdCq")
	private CommissionRegulationIdCq commissionRegulationIdCq = null;
	
	@JsonProperty("isCancelled")
	private Boolean isCancelled = false;
	
	@JsonProperty("isDraft")
	private Boolean isDraft = false;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public EntityNameCq getName() {
		return name;
	}
	
	public void setName(EntityNameCq name) {
		this.name = name;
	}
	
	public CommissionRegulationVersionIdCq getCommissionRegulationVersionIdCq() {
		return commissionRegulationVersionIdCq;
	}
	
	public void setCommissionRegulationVersionIdCq(CommissionRegulationVersionIdCq commissionRegulationVersionIdCq) {
		this.commissionRegulationVersionIdCq = commissionRegulationVersionIdCq;
	}
	
	public CommissionRegulationIdCq getCommissionRegulationIdCq() {
		return commissionRegulationIdCq;
	}
	
	public void setCommissionRegulationIdCq(CommissionRegulationIdCq commissionRegulationIdCq) {
		this.commissionRegulationIdCq = commissionRegulationIdCq;
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

