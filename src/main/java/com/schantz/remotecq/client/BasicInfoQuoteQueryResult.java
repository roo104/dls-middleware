package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BasicInfoQuoteQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("quoteCq")
	private QuoteCq quoteCq = null;
	
	public BasicInfoQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public QuoteCq getQuoteCq() {
		return quoteCq;
	}
	
	public void setQuoteCq(QuoteCq quoteCq) {
		this.quoteCq = quoteCq;
	}
}

