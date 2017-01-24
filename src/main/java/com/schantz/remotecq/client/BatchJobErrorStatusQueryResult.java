package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobErrorStatusQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("errorStatusCountsCollection")
	private List<BatchJobErrorStatusCountsCq> errorStatusCountsCollection = new ArrayList<BatchJobErrorStatusCountsCq>();
	
	public BatchJobErrorStatusQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchJobErrorStatusQueryResult addErrorStatusCountsCollectionItem(BatchJobErrorStatusCountsCq errorStatusCountsCollectionItem) {
		this.errorStatusCountsCollection.add(errorStatusCountsCollectionItem);
		return this;
	}
	
	public List<BatchJobErrorStatusCountsCq> getErrorStatusCountsCollection() {
		return errorStatusCountsCollection;
	}
	
	public void setErrorStatusCountsCollection(List<BatchJobErrorStatusCountsCq> errorStatusCountsCollection) {
		this.errorStatusCountsCollection = errorStatusCountsCollection;
	}
}

