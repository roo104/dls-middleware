package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobErrorTicketDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("data")
	private BatchJobErrorTicketDataCq data = null;
	
	public BatchJobErrorTicketDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchJobErrorTicketDataCq getData() {
		return data;
	}
	
	public void setData(BatchJobErrorTicketDataCq data) {
		this.data = data;
	}
}

