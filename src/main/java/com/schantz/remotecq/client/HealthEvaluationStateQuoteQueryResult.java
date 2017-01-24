package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class HealthEvaluationStateQuoteQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("currentHealthEvaluationsCollection")
	private List<HealthEvaluationNeededEntryCq> currentHealthEvaluationsCollection = new ArrayList<HealthEvaluationNeededEntryCq>();
	
	public HealthEvaluationStateQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public HealthEvaluationStateQuoteQueryResult addCurrentHealthEvaluationsCollectionItem(HealthEvaluationNeededEntryCq currentHealthEvaluationsCollectionItem) {
		this.currentHealthEvaluationsCollection.add(currentHealthEvaluationsCollectionItem);
		return this;
	}
	
	public List<HealthEvaluationNeededEntryCq> getCurrentHealthEvaluationsCollection() {
		return currentHealthEvaluationsCollection;
	}
	
	public void setCurrentHealthEvaluationsCollection(List<HealthEvaluationNeededEntryCq> currentHealthEvaluationsCollection) {
		this.currentHealthEvaluationsCollection = currentHealthEvaluationsCollection;
	}
}

