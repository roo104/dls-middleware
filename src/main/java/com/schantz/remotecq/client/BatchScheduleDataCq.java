package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleDataCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("nodeId")
	private String nodeId = null;
	
	@JsonProperty("paramsCollection")
	private List<BatchParameterCq> paramsCollection = new ArrayList<BatchParameterCq>();
	
	@JsonProperty("scheduleSpec")
	private BatchScheduleSpecCq scheduleSpec = null;
	
	@JsonProperty("batchJobIdCq")
	private BatchJobIdCq batchJobIdCq = null;
	
	@JsonProperty("predecessorSchedueId")
	private BatchScheduleIdCq predecessorSchedueId = null;
	
	@JsonProperty("isFailIfPredecessorFails")
	private Boolean isFailIfPredecessorFails = false;
	
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
	
	public String getNodeId() {
		return nodeId;
	}
	
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	
	public BatchScheduleDataCq addParamsCollectionItem(BatchParameterCq paramsCollectionItem) {
		this.paramsCollection.add(paramsCollectionItem);
		return this;
	}
	
	public List<BatchParameterCq> getParamsCollection() {
		return paramsCollection;
	}
	
	public void setParamsCollection(List<BatchParameterCq> paramsCollection) {
		this.paramsCollection = paramsCollection;
	}
	
	public BatchScheduleSpecCq getScheduleSpec() {
		return scheduleSpec;
	}
	
	public void setScheduleSpec(BatchScheduleSpecCq scheduleSpec) {
		this.scheduleSpec = scheduleSpec;
	}
	
	public BatchJobIdCq getBatchJobIdCq() {
		return batchJobIdCq;
	}
	
	public void setBatchJobIdCq(BatchJobIdCq batchJobIdCq) {
		this.batchJobIdCq = batchJobIdCq;
	}
	
	public BatchScheduleIdCq getPredecessorSchedueId() {
		return predecessorSchedueId;
	}
	
	public void setPredecessorSchedueId(BatchScheduleIdCq predecessorSchedueId) {
		this.predecessorSchedueId = predecessorSchedueId;
	}
	
	public Boolean getIsFailIfPredecessorFails() {
		return isFailIfPredecessorFails;
	}
	
	public void setIsFailIfPredecessorFails(Boolean isFailIfPredecessorFails) {
		this.isFailIfPredecessorFails = isFailIfPredecessorFails;
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

