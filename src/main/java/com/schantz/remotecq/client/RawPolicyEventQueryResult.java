package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RawPolicyEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private RawPolicyEventCq eventCq = null;
	
	public RawPolicyEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RawPolicyEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(RawPolicyEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

