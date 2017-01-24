package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class HealthEvaluationNeededEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private HealthEvaluationNeededEventCq eventCq = null;
	
	public HealthEvaluationNeededEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public HealthEvaluationNeededEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(HealthEvaluationNeededEventCq eventCq) {
		this.eventCq = eventCq;
	}
}

