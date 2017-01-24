package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobActivityDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("data")
	private BatchJobActivityRequestDataCq data = null;
	
	public BatchJobActivityDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchJobActivityRequestDataCq getData() {
		return data;
	}
	
	public void setData(BatchJobActivityRequestDataCq data) {
		this.data = data;
	}
}

