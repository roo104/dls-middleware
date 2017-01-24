package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class MoneyAccountPortfolioQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("oiAccountInfoCq")
	private OiAccountInfoCq oiAccountInfoCq = null;
	
	public MoneyAccountPortfolioQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public OiAccountInfoCq getOiAccountInfoCq() {
		return oiAccountInfoCq;
	}
	
	public void setOiAccountInfoCq(OiAccountInfoCq oiAccountInfoCq) {
		this.oiAccountInfoCq = oiAccountInfoCq;
	}
}

