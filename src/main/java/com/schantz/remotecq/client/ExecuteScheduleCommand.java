package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ExecuteScheduleCommand implements Serializable {
	@JsonProperty("batchScheduleIdCq")
	private BatchScheduleIdCq batchScheduleIdCq = null;
	
	@JsonProperty("batchScheduleUidCqCollection")
	private List<String> batchScheduleUidCqCollection = new ArrayList<String>();
	
	
	public BatchScheduleIdCq getBatchScheduleIdCq() {
		return batchScheduleIdCq;
	}
	
	public void setBatchScheduleIdCq(BatchScheduleIdCq batchScheduleIdCq) {
		this.batchScheduleIdCq = batchScheduleIdCq;
	}
	
	public ExecuteScheduleCommand addBatchScheduleUidCqCollectionItem(String batchScheduleUidCqCollectionItem) {
		this.batchScheduleUidCqCollection.add(batchScheduleUidCqCollectionItem);
		return this;
	}
	
	public List<String> getBatchScheduleUidCqCollection() {
		return batchScheduleUidCqCollection;
	}
	
	public void setBatchScheduleUidCqCollection(List<String> batchScheduleUidCqCollection) {
		this.batchScheduleUidCqCollection = batchScheduleUidCqCollection;
	}
}

