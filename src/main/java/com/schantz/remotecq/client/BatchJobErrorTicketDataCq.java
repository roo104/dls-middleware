package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobErrorTicketDataCq implements Serializable {
	@JsonProperty("eventTime")
	private OffsetDateTime eventTime = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("note")
	private String note = null;
	
	@JsonProperty("status")
	private String status = null;
	
	@JsonProperty("batchJobIdCq")
	private BatchJobIdCq batchJobIdCq = null;
	
	@JsonProperty("severity")
	private String severity = null;
	
	@JsonProperty("batchJobErrorTicketUidCq")
	private String batchJobErrorTicketUidCq = null;
	
	
	public OffsetDateTime getEventTime() {
		return eventTime;
	}
	
	public void setEventTime(OffsetDateTime eventTime) {
		this.eventTime = eventTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public BatchJobIdCq getBatchJobIdCq() {
		return batchJobIdCq;
	}
	
	public void setBatchJobIdCq(BatchJobIdCq batchJobIdCq) {
		this.batchJobIdCq = batchJobIdCq;
	}
	
	public String getSeverity() {
		return severity;
	}
	
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	
	public String getBatchJobErrorTicketUidCq() {
		return batchJobErrorTicketUidCq;
	}
	
	public void setBatchJobErrorTicketUidCq(String batchJobErrorTicketUidCq) {
		this.batchJobErrorTicketUidCq = batchJobErrorTicketUidCq;
	}
}

