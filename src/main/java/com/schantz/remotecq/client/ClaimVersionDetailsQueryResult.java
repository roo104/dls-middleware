package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimVersionDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("claimVersionCq")
	private ClaimVersionCq claimVersionCq = null;
	
	public ClaimVersionDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ClaimVersionCq getClaimVersionCq() {
		return claimVersionCq;
	}
	
	public void setClaimVersionCq(ClaimVersionCq claimVersionCq) {
		this.claimVersionCq = claimVersionCq;
	}
}

