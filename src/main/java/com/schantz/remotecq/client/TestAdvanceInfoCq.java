package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TestAdvanceInfoCq implements Serializable {
	@JsonProperty("testAdvanceUid")
	private String testAdvanceUid = null;
	
	@JsonProperty("orderedBy")
	private String orderedBy = null;
	
	@JsonProperty("orderTime")
	private OffsetDateTime orderTime = null;
	
	@JsonProperty("newSystemTime")
	private OffsetDateTime newSystemTime = null;
	
	@JsonProperty("advanceToAtStart")
	private LocalDate advanceToAtStart = null;
	
	@JsonProperty("durationSecs")
	private Long durationSecs = null;
	
	@JsonProperty("policies")
	private Long policies = null;
	
	@JsonProperty("testAdvanceStatusCq")
	private String testAdvanceStatusCq = null;
	
	@JsonProperty("isCalculateCommission")
	private Boolean isCalculateCommission = false;
	
	@JsonProperty("isCreateReceivable")
	private Boolean isCreateReceivable = false;
	
	
	public String getTestAdvanceUid() {
		return testAdvanceUid;
	}
	
	public void setTestAdvanceUid(String testAdvanceUid) {
		this.testAdvanceUid = testAdvanceUid;
	}
	
	public String getOrderedBy() {
		return orderedBy;
	}
	
	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}
	
	public OffsetDateTime getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(OffsetDateTime orderTime) {
		this.orderTime = orderTime;
	}
	
	public OffsetDateTime getNewSystemTime() {
		return newSystemTime;
	}
	
	public void setNewSystemTime(OffsetDateTime newSystemTime) {
		this.newSystemTime = newSystemTime;
	}
	
	public LocalDate getAdvanceToAtStart() {
		return advanceToAtStart;
	}
	
	public void setAdvanceToAtStart(LocalDate advanceToAtStart) {
		this.advanceToAtStart = advanceToAtStart;
	}
	
	public Long getDurationSecs() {
		return durationSecs;
	}
	
	public void setDurationSecs(Long durationSecs) {
		this.durationSecs = durationSecs;
	}
	
	public Long getPolicies() {
		return policies;
	}
	
	public void setPolicies(Long policies) {
		this.policies = policies;
	}
	
	public String getTestAdvanceStatusCq() {
		return testAdvanceStatusCq;
	}
	
	public void setTestAdvanceStatusCq(String testAdvanceStatusCq) {
		this.testAdvanceStatusCq = testAdvanceStatusCq;
	}
	
	public Boolean getIsCalculateCommission() {
		return isCalculateCommission;
	}
	
	public void setIsCalculateCommission(Boolean isCalculateCommission) {
		this.isCalculateCommission = isCalculateCommission;
	}
	
	public Boolean getIsCreateReceivable() {
		return isCreateReceivable;
	}
	
	public void setIsCreateReceivable(Boolean isCreateReceivable) {
		this.isCreateReceivable = isCreateReceivable;
	}
}

