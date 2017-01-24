package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PauseQueueCommand implements Serializable {
	@JsonProperty("queueIdCq")
	private QueueIdCq queueIdCq = null;
	
	
	public QueueIdCq getQueueIdCq() {
		return queueIdCq;
	}
	
	public void setQueueIdCq(QueueIdCq queueIdCq) {
		this.queueIdCq = queueIdCq;
	}
}

