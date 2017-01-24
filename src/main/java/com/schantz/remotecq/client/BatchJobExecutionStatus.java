package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobExecutionStatus implements Serializable {
	@JsonProperty("statusCode")
	private Long statusCode = null;
	
	@JsonProperty("progressPercent")
	private Long progressPercent = null;
	
	@JsonProperty("scheduleId")
	private String scheduleId = null;
	
	@JsonProperty("batchJobStateCq")
	private String batchJobStateCq = null;
	
	@JsonProperty("batchJobActivityRequestUidCq")
	private String batchJobActivityRequestUidCq = null;
	
	
	public Long getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}
	
	public Long getProgressPercent() {
		return progressPercent;
	}
	
	public void setProgressPercent(Long progressPercent) {
		this.progressPercent = progressPercent;
	}
	
	public String getScheduleId() {
		return scheduleId;
	}
	
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	
	public String getBatchJobStateCq() {
		return batchJobStateCq;
	}
	
	public void setBatchJobStateCq(String batchJobStateCq) {
		this.batchJobStateCq = batchJobStateCq;
	}
	
	public String getBatchJobActivityRequestUidCq() {
		return batchJobActivityRequestUidCq;
	}
	
	public void setBatchJobActivityRequestUidCq(String batchJobActivityRequestUidCq) {
		this.batchJobActivityRequestUidCq = batchJobActivityRequestUidCq;
	}
}

