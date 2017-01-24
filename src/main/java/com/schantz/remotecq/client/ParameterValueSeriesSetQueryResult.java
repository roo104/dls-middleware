package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ParameterValueSeriesSetQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("parameterValueCqCollection")
	private List<ParameterValueCq> parameterValueCqCollection = new ArrayList<ParameterValueCq>();
	
	public ParameterValueSeriesSetQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ParameterValueSeriesSetQueryResult addParameterValueCqCollectionItem(ParameterValueCq parameterValueCqCollectionItem) {
		this.parameterValueCqCollection.add(parameterValueCqCollectionItem);
		return this;
	}
	
	public List<ParameterValueCq> getParameterValueCqCollection() {
		return parameterValueCqCollection;
	}
	
	public void setParameterValueCqCollection(List<ParameterValueCq> parameterValueCqCollection) {
		this.parameterValueCqCollection = parameterValueCqCollection;
	}
}

