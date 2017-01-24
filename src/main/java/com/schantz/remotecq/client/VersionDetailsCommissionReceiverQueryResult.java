package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsCommissionReceiverQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("commissionReceiverVersionDetailsCq")
	private CommissionReceiverVersionDetailsCq commissionReceiverVersionDetailsCq = null;
	
	public VersionDetailsCommissionReceiverQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CommissionReceiverVersionDetailsCq getCommissionReceiverVersionDetailsCq() {
		return commissionReceiverVersionDetailsCq;
	}
	
	public void setCommissionReceiverVersionDetailsCq(CommissionReceiverVersionDetailsCq commissionReceiverVersionDetailsCq) {
		this.commissionReceiverVersionDetailsCq = commissionReceiverVersionDetailsCq;
	}
}

