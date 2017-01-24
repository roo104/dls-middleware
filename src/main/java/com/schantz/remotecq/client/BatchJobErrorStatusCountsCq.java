package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobErrorStatusCountsCq implements Serializable {
	@JsonProperty("newCount")
	private Long newCount = null;
	
	@JsonProperty("inProgressCount")
	private Long inProgressCount = null;
	
	@JsonProperty("solvedCount")
	private Long solvedCount = null;
	
	@JsonProperty("notAnIssueCount")
	private Long notAnIssueCount = null;
	
	@JsonProperty("onHoldCount")
	private Long onHoldCount = null;
	
	@JsonProperty("sincePeriod")
	private String sincePeriod = null;
	
	
	public Long getNewCount() {
		return newCount;
	}
	
	public void setNewCount(Long newCount) {
		this.newCount = newCount;
	}
	
	public Long getInProgressCount() {
		return inProgressCount;
	}
	
	public void setInProgressCount(Long inProgressCount) {
		this.inProgressCount = inProgressCount;
	}
	
	public Long getSolvedCount() {
		return solvedCount;
	}
	
	public void setSolvedCount(Long solvedCount) {
		this.solvedCount = solvedCount;
	}
	
	public Long getNotAnIssueCount() {
		return notAnIssueCount;
	}
	
	public void setNotAnIssueCount(Long notAnIssueCount) {
		this.notAnIssueCount = notAnIssueCount;
	}
	
	public Long getOnHoldCount() {
		return onHoldCount;
	}
	
	public void setOnHoldCount(Long onHoldCount) {
		this.onHoldCount = onHoldCount;
	}
	
	public String getSincePeriod() {
		return sincePeriod;
	}
	
	public void setSincePeriod(String sincePeriod) {
		this.sincePeriod = sincePeriod;
	}
}

