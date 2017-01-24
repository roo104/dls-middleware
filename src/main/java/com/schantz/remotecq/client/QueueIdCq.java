package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class QueueIdCq implements Serializable {
	@JsonProperty("queueUid")
	private String queueUid = null;
	
	@JsonProperty("queueId")
	private String queueId = null;
	
	
	public String getQueueUid() {
		return queueUid;
	}
	
	public void setQueueUid(String queueUid) {
		this.queueUid = queueUid;
	}
	
	public String getQueueId() {
		return queueId;
	}
	
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}
}

