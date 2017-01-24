package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsRiskBonusGroupQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("riskBonusGroupVersionCq")
	private RiskBonusGroupVersionCq riskBonusGroupVersionCq = null;
	
	public VersionDetailsRiskBonusGroupQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RiskBonusGroupVersionCq getRiskBonusGroupVersionCq() {
		return riskBonusGroupVersionCq;
	}
	
	public void setRiskBonusGroupVersionCq(RiskBonusGroupVersionCq riskBonusGroupVersionCq) {
		this.riskBonusGroupVersionCq = riskBonusGroupVersionCq;
	}
}

