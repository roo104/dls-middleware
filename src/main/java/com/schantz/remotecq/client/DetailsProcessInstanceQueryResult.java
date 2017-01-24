package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DetailsProcessInstanceQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("processInstanceCq")
	private ProcessInstanceCq processInstanceCq = null;
	
	public DetailsProcessInstanceQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ProcessInstanceCq getProcessInstanceCq() {
		return processInstanceCq;
	}
	
	public void setProcessInstanceCq(ProcessInstanceCq processInstanceCq) {
		this.processInstanceCq = processInstanceCq;
	}
}

