package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class SimulationQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("compensationInfoCq")
	private CompensationInfoCq compensationInfoCq = null;
	
	@JsonProperty("afterCompensationBalance")
	private PortfolioBalanceCq afterCompensationBalance = null;
	
	@JsonProperty("beforeCompensationBalance")
	private PortfolioBalanceCq beforeCompensationBalance = null;
	
	public SimulationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CompensationInfoCq getCompensationInfoCq() {
		return compensationInfoCq;
	}
	
	public void setCompensationInfoCq(CompensationInfoCq compensationInfoCq) {
		this.compensationInfoCq = compensationInfoCq;
	}
	
	public PortfolioBalanceCq getAfterCompensationBalance() {
		return afterCompensationBalance;
	}
	
	public void setAfterCompensationBalance(PortfolioBalanceCq afterCompensationBalance) {
		this.afterCompensationBalance = afterCompensationBalance;
	}
	
	public PortfolioBalanceCq getBeforeCompensationBalance() {
		return beforeCompensationBalance;
	}
	
	public void setBeforeCompensationBalance(PortfolioBalanceCq beforeCompensationBalance) {
		this.beforeCompensationBalance = beforeCompensationBalance;
	}
}

