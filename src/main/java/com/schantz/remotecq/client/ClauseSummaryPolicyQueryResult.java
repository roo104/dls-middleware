package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClauseSummaryPolicyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("clauseEntryCqCollection")
	private List<ClauseEntryCq> clauseEntryCqCollection = new ArrayList<ClauseEntryCq>();
	
	@JsonProperty("historicClauseEntryCqCollection")
	private List<ClauseEntryCq> historicClauseEntryCqCollection = new ArrayList<ClauseEntryCq>();
	
	public ClauseSummaryPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ClauseSummaryPolicyQueryResult addClauseEntryCqCollectionItem(ClauseEntryCq clauseEntryCqCollectionItem) {
		this.clauseEntryCqCollection.add(clauseEntryCqCollectionItem);
		return this;
	}
	
	public List<ClauseEntryCq> getClauseEntryCqCollection() {
		return clauseEntryCqCollection;
	}
	
	public void setClauseEntryCqCollection(List<ClauseEntryCq> clauseEntryCqCollection) {
		this.clauseEntryCqCollection = clauseEntryCqCollection;
	}
	
	public ClauseSummaryPolicyQueryResult addHistoricClauseEntryCqCollectionItem(ClauseEntryCq historicClauseEntryCqCollectionItem) {
		this.historicClauseEntryCqCollection.add(historicClauseEntryCqCollectionItem);
		return this;
	}
	
	public List<ClauseEntryCq> getHistoricClauseEntryCqCollection() {
		return historicClauseEntryCqCollection;
	}
	
	public void setHistoricClauseEntryCqCollection(List<ClauseEntryCq> historicClauseEntryCqCollection) {
		this.historicClauseEntryCqCollection = historicClauseEntryCqCollection;
	}
}

