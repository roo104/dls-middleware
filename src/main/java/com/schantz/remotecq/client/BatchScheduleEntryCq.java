package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleEntryCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("timingDescription")
	private String timingDescription = null;
	
	@JsonProperty("batchScheduleIdCq")
	private BatchScheduleIdCq batchScheduleIdCq = null;
	
	@JsonProperty("predecessor")
	private BatchScheduleIdCq predecessor = null;
	
	@JsonProperty("successor")
	private BatchScheduleIdCq successor = null;
	
	@JsonProperty("isDisabled")
	private Boolean isDisabled = false;
	
	@JsonProperty("isOneShot")
	private Boolean isOneShot = false;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTimingDescription() {
		return timingDescription;
	}
	
	public void setTimingDescription(String timingDescription) {
		this.timingDescription = timingDescription;
	}
	
	public BatchScheduleIdCq getBatchScheduleIdCq() {
		return batchScheduleIdCq;
	}
	
	public void setBatchScheduleIdCq(BatchScheduleIdCq batchScheduleIdCq) {
		this.batchScheduleIdCq = batchScheduleIdCq;
	}
	
	public BatchScheduleIdCq getPredecessor() {
		return predecessor;
	}
	
	public void setPredecessor(BatchScheduleIdCq predecessor) {
		this.predecessor = predecessor;
	}
	
	public BatchScheduleIdCq getSuccessor() {
		return successor;
	}
	
	public void setSuccessor(BatchScheduleIdCq successor) {
		this.successor = successor;
	}
	
	public Boolean getIsDisabled() {
		return isDisabled;
	}
	
	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	
	public Boolean getIsOneShot() {
		return isOneShot;
	}
	
	public void setIsOneShot(Boolean isOneShot) {
		this.isOneShot = isOneShot;
	}
}

