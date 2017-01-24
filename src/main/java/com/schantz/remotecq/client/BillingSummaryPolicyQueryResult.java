package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BillingSummaryPolicyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("billingSummaryCq")
	private BillingSummaryCq billingSummaryCq = null;
	
	public BillingSummaryPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BillingSummaryCq getBillingSummaryCq() {
		return billingSummaryCq;
	}
	
	public void setBillingSummaryCq(BillingSummaryCq billingSummaryCq) {
		this.billingSummaryCq = billingSummaryCq;
	}
}

