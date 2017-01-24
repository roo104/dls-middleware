package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CounsellingCostEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private CounsellingCostEventCq eventCq = null;
	
	public CounsellingCostEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CounsellingCostEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(CounsellingCostEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

