package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("batchScheduleIdCq")
	private BatchScheduleIdCq batchScheduleIdCq = null;
	
	@JsonProperty("detailsData")
	private BatchScheduleDataCq detailsData = null;
	
	public BatchScheduleDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchScheduleIdCq getBatchScheduleIdCq() {
		return batchScheduleIdCq;
	}
	
	public void setBatchScheduleIdCq(BatchScheduleIdCq batchScheduleIdCq) {
		this.batchScheduleIdCq = batchScheduleIdCq;
	}
	
	public BatchScheduleDataCq getDetailsData() {
		return detailsData;
	}
	
	public void setDetailsData(BatchScheduleDataCq detailsData) {
		this.detailsData = detailsData;
	}
}

