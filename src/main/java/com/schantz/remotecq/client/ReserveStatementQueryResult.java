package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveStatementQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("reserveStatementCq")
	private ReserveStatementCq reserveStatementCq = null;
	
	public ReserveStatementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ReserveStatementCq getReserveStatementCq() {
		return reserveStatementCq;
	}
	
	public void setReserveStatementCq(ReserveStatementCq reserveStatementCq) {
		this.reserveStatementCq = reserveStatementCq;
	}
}

