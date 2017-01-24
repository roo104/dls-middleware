package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveStatementYearlyBatchQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("reserveStatementBatchDataCollection")
	private List<ReserveStatementBatchData> reserveStatementBatchDataCollection = new ArrayList<ReserveStatementBatchData>();
	
	public ReserveStatementYearlyBatchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ReserveStatementYearlyBatchQueryResult addReserveStatementBatchDataCollectionItem(ReserveStatementBatchData reserveStatementBatchDataCollectionItem) {
		this.reserveStatementBatchDataCollection.add(reserveStatementBatchDataCollectionItem);
		return this;
	}
	
	public List<ReserveStatementBatchData> getReserveStatementBatchDataCollection() {
		return reserveStatementBatchDataCollection;
	}
	
	public void setReserveStatementBatchDataCollection(List<ReserveStatementBatchData> reserveStatementBatchDataCollection) {
		this.reserveStatementBatchDataCollection = reserveStatementBatchDataCollection;
	}
}

