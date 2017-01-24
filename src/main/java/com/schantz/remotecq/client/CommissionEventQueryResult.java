package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private CommissionEventCq eventCq = null;
	
	@JsonProperty("isEventCommissionPossible")
	private Boolean isEventCommissionPossible = false;
	
	public CommissionEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CommissionEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(CommissionEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public Boolean getIsEventCommissionPossible() {
		return isEventCommissionPossible;
	}
	
	public void setIsEventCommissionPossible(Boolean isEventCommissionPossible) {
		this.isEventCommissionPossible = isEventCommissionPossible;
	}
}

