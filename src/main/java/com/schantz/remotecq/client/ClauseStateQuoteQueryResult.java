package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClauseStateQuoteQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("clauseEntryCqCollection")
	private List<ClauseEntryCq> clauseEntryCqCollection = new ArrayList<ClauseEntryCq>();
	
	public ClauseStateQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ClauseStateQuoteQueryResult addClauseEntryCqCollectionItem(ClauseEntryCq clauseEntryCqCollectionItem) {
		this.clauseEntryCqCollection.add(clauseEntryCqCollectionItem);
		return this;
	}
	
	public List<ClauseEntryCq> getClauseEntryCqCollection() {
		return clauseEntryCqCollection;
	}
	
	public void setClauseEntryCqCollection(List<ClauseEntryCq> clauseEntryCqCollection) {
		this.clauseEntryCqCollection = clauseEntryCqCollection;
	}
}

