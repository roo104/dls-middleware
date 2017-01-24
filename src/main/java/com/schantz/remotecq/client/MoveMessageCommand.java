package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class MoveMessageCommand implements Serializable {
	@JsonProperty("destination")
	private QueueIdCq destination = null;
	
	@JsonProperty("queueMessageIdCqCollection")
	private List<QueueMessageIdCq> queueMessageIdCqCollection = new ArrayList<QueueMessageIdCq>();
	
	
	public QueueIdCq getDestination() {
		return destination;
	}
	
	public void setDestination(QueueIdCq destination) {
		this.destination = destination;
	}
	
	public MoveMessageCommand addQueueMessageIdCqCollectionItem(QueueMessageIdCq queueMessageIdCqCollectionItem) {
		this.queueMessageIdCqCollection.add(queueMessageIdCqCollectionItem);
		return this;
	}
	
	public List<QueueMessageIdCq> getQueueMessageIdCqCollection() {
		return queueMessageIdCqCollection;
	}
	
	public void setQueueMessageIdCqCollection(List<QueueMessageIdCq> queueMessageIdCqCollection) {
		this.queueMessageIdCqCollection = queueMessageIdCqCollection;
	}
}

