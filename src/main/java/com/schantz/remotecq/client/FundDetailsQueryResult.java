package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class FundDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("fundDetailsCq")
	private FundDetailsCq fundDetailsCq = null;
	
	public FundDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public FundDetailsCq getFundDetailsCq() {
		return fundDetailsCq;
	}
	
	public void setFundDetailsCq(FundDetailsCq fundDetailsCq) {
		this.fundDetailsCq = fundDetailsCq;
	}
}

