package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class QueueSearchQueryEntry implements Serializable {
	@JsonProperty("consumerId")
	private String consumerId = null;
	
	@JsonProperty("queuedCount")
	private Long queuedCount = null;
	
	@JsonProperty("queueExecutorStatsCq")
	private QueueExecutorStatsCq queueExecutorStatsCq = null;
	
	@JsonProperty("queueIdCq")
	private QueueIdCq queueIdCq = null;
	
	@JsonProperty("isPaused")
	private Boolean isPaused = false;
	
	
	public String getConsumerId() {
		return consumerId;
	}
	
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	
	public Long getQueuedCount() {
		return queuedCount;
	}
	
	public void setQueuedCount(Long queuedCount) {
		this.queuedCount = queuedCount;
	}
	
	public QueueExecutorStatsCq getQueueExecutorStatsCq() {
		return queueExecutorStatsCq;
	}
	
	public void setQueueExecutorStatsCq(QueueExecutorStatsCq queueExecutorStatsCq) {
		this.queueExecutorStatsCq = queueExecutorStatsCq;
	}
	
	public QueueIdCq getQueueIdCq() {
		return queueIdCq;
	}
	
	public void setQueueIdCq(QueueIdCq queueIdCq) {
		this.queueIdCq = queueIdCq;
	}
	
	public Boolean getIsPaused() {
		return isPaused;
	}
	
	public void setIsPaused(Boolean isPaused) {
		this.isPaused = isPaused;
	}
}

