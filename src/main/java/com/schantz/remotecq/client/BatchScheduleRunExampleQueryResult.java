package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleRunExampleQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("timesCollection")
	private List<OffsetDateTime> timesCollection = new ArrayList<OffsetDateTime>();
	
	public BatchScheduleRunExampleQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchScheduleRunExampleQueryResult addTimesCollectionItem(OffsetDateTime timesCollectionItem) {
		this.timesCollection.add(timesCollectionItem);
		return this;
	}
	
	public List<OffsetDateTime> getTimesCollection() {
		return timesCollection;
	}
	
	public void setTimesCollection(List<OffsetDateTime> timesCollection) {
		this.timesCollection = timesCollection;
	}
}

