package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobActivitySearchEntry implements Serializable {
	@JsonProperty("batchJobExplanatoryName")
	private String batchJobExplanatoryName = null;
	
	@JsonProperty("node")
	private String node = null;
	
	@JsonProperty("startDateTime")
	private OffsetDateTime startDateTime = null;
	
	@JsonProperty("endDateTime")
	private OffsetDateTime endDateTime = null;
	
	@JsonProperty("progress")
	private Long progress = null;
	
	@JsonProperty("batchJobExitCode")
	private Long batchJobExitCode = null;
	
	@JsonProperty("errorTicketStatus")
	private String errorTicketStatus = null;
	
	@JsonProperty("batchJobState")
	private String batchJobState = null;
	
	@JsonProperty("batchJobActivityRequestIdCq")
	private BatchJobActivityRequestIdCq batchJobActivityRequestIdCq = null;
	
	@JsonProperty("batchJobIdCq")
	private BatchJobIdCq batchJobIdCq = null;
	
	@JsonProperty("scheduleId")
	private BatchScheduleIdCq scheduleId = null;
	
	@JsonProperty("successorScheduleId")
	private BatchScheduleIdCq successorScheduleId = null;
	
	@JsonProperty("batchJobErrorTicketUidCq")
	private String batchJobErrorTicketUidCq = null;
	
	
	public String getBatchJobExplanatoryName() {
		return batchJobExplanatoryName;
	}
	
	public void setBatchJobExplanatoryName(String batchJobExplanatoryName) {
		this.batchJobExplanatoryName = batchJobExplanatoryName;
	}
	
	public String getNode() {
		return node;
	}
	
	public void setNode(String node) {
		this.node = node;
	}
	
	public OffsetDateTime getStartDateTime() {
		return startDateTime;
	}
	
	public void setStartDateTime(OffsetDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	
	public OffsetDateTime getEndDateTime() {
		return endDateTime;
	}
	
	public void setEndDateTime(OffsetDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	
	public Long getProgress() {
		return progress;
	}
	
	public void setProgress(Long progress) {
		this.progress = progress;
	}
	
	public Long getBatchJobExitCode() {
		return batchJobExitCode;
	}
	
	public void setBatchJobExitCode(Long batchJobExitCode) {
		this.batchJobExitCode = batchJobExitCode;
	}
	
	public String getErrorTicketStatus() {
		return errorTicketStatus;
	}
	
	public void setErrorTicketStatus(String errorTicketStatus) {
		this.errorTicketStatus = errorTicketStatus;
	}
	
	public String getBatchJobState() {
		return batchJobState;
	}
	
	public void setBatchJobState(String batchJobState) {
		this.batchJobState = batchJobState;
	}
	
	public BatchJobActivityRequestIdCq getBatchJobActivityRequestIdCq() {
		return batchJobActivityRequestIdCq;
	}
	
	public void setBatchJobActivityRequestIdCq(BatchJobActivityRequestIdCq batchJobActivityRequestIdCq) {
		this.batchJobActivityRequestIdCq = batchJobActivityRequestIdCq;
	}
	
	public BatchJobIdCq getBatchJobIdCq() {
		return batchJobIdCq;
	}
	
	public void setBatchJobIdCq(BatchJobIdCq batchJobIdCq) {
		this.batchJobIdCq = batchJobIdCq;
	}
	
	public BatchScheduleIdCq getScheduleId() {
		return scheduleId;
	}
	
	public void setScheduleId(BatchScheduleIdCq scheduleId) {
		this.scheduleId = scheduleId;
	}
	
	public BatchScheduleIdCq getSuccessorScheduleId() {
		return successorScheduleId;
	}
	
	public void setSuccessorScheduleId(BatchScheduleIdCq successorScheduleId) {
		this.successorScheduleId = successorScheduleId;
	}
	
	public String getBatchJobErrorTicketUidCq() {
		return batchJobErrorTicketUidCq;
	}
	
	public void setBatchJobErrorTicketUidCq(String batchJobErrorTicketUidCq) {
		this.batchJobErrorTicketUidCq = batchJobErrorTicketUidCq;
	}
}

