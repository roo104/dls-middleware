package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class FundTotalValueQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("fundTotalValueCq")
	private FundTotalValueCq fundTotalValueCq = null;
	
	public FundTotalValueQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public FundTotalValueCq getFundTotalValueCq() {
		return fundTotalValueCq;
	}
	
	public void setFundTotalValueCq(FundTotalValueCq fundTotalValueCq) {
		this.fundTotalValueCq = fundTotalValueCq;
	}
}

