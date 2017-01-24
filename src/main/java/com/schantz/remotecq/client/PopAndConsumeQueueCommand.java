package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PopAndConsumeQueueCommand implements Serializable {
	@JsonProperty("queueIdCq")
	private QueueIdCq queueIdCq = null;
	
	@JsonProperty("maxPopCount")
	private Long maxPopCount = null;
	
	@JsonProperty("isMultithreaded")
	private Boolean isMultithreaded = false;
	
	
	public QueueIdCq getQueueIdCq() {
		return queueIdCq;
	}
	
	public void setQueueIdCq(QueueIdCq queueIdCq) {
		this.queueIdCq = queueIdCq;
	}
	
	public Long getMaxPopCount() {
		return maxPopCount;
	}
	
	public void setMaxPopCount(Long maxPopCount) {
		this.maxPopCount = maxPopCount;
	}
	
	public Boolean getIsMultithreaded() {
		return isMultithreaded;
	}
	
	public void setIsMultithreaded(Boolean isMultithreaded) {
		this.isMultithreaded = isMultithreaded;
	}
}

