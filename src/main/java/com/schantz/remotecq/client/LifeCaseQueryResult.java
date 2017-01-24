package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class LifeCaseQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("lifeCaseCq")
	private LifeCaseCq lifeCaseCq = null;
	
	public LifeCaseQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public LifeCaseCq getLifeCaseCq() {
		return lifeCaseCq;
	}
	
	public void setLifeCaseCq(LifeCaseCq lifeCaseCq) {
		this.lifeCaseCq = lifeCaseCq;
	}
}

