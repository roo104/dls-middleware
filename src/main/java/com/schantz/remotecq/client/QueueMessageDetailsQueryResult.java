package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class QueueMessageDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("queueMessageCq")
	private QueueMessageCq queueMessageCq = null;
	
	public QueueMessageDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public QueueMessageCq getQueueMessageCq() {
		return queueMessageCq;
	}
	
	public void setQueueMessageCq(QueueMessageCq queueMessageCq) {
		this.queueMessageCq = queueMessageCq;
	}
}

