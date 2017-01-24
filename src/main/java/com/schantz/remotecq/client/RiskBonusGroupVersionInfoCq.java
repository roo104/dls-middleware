package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class RiskBonusGroupVersionInfoCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createBy")
	private String createBy = null;
	
	@JsonProperty("riskBonusGroupVersionIdCq")
	private RiskBonusGroupVersionIdCq riskBonusGroupVersionIdCq = null;
	
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
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateBy() {
		return createBy;
	}
	
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	public RiskBonusGroupVersionIdCq getRiskBonusGroupVersionIdCq() {
		return riskBonusGroupVersionIdCq;
	}
	
	public void setRiskBonusGroupVersionIdCq(RiskBonusGroupVersionIdCq riskBonusGroupVersionIdCq) {
		this.riskBonusGroupVersionIdCq = riskBonusGroupVersionIdCq;
	}
	
	public Boolean getIsDraft() {
		return isDraft;
	}
	
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
}

