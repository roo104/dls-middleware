package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BasicClaimCriticalIllnessTypeQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("claimCriticalIllnessTypeCq")
	private ClaimCriticalIllnessTypeCq claimCriticalIllnessTypeCq = null;
	
	public BasicClaimCriticalIllnessTypeQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ClaimCriticalIllnessTypeCq getClaimCriticalIllnessTypeCq() {
		return claimCriticalIllnessTypeCq;
	}
	
	public void setClaimCriticalIllnessTypeCq(ClaimCriticalIllnessTypeCq claimCriticalIllnessTypeCq) {
		this.claimCriticalIllnessTypeCq = claimCriticalIllnessTypeCq;
	}
}

