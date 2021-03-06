package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsHealthGroupQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("healthGroupVersionCq")
	private HealthGroupVersionCq healthGroupVersionCq = null;
	
	public VersionDetailsHealthGroupQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public HealthGroupVersionCq getHealthGroupVersionCq() {
		return healthGroupVersionCq;
	}
	
	public void setHealthGroupVersionCq(HealthGroupVersionCq healthGroupVersionCq) {
		this.healthGroupVersionCq = healthGroupVersionCq;
	}
}

