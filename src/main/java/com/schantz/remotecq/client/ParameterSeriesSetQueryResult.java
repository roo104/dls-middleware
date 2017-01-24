package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ParameterSeriesSetQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("parameterSeriesCqCollection")
	private List<ParameterSeriesCq> parameterSeriesCqCollection = new ArrayList<ParameterSeriesCq>();
	
	public ParameterSeriesSetQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ParameterSeriesSetQueryResult addParameterSeriesCqCollectionItem(ParameterSeriesCq parameterSeriesCqCollectionItem) {
		this.parameterSeriesCqCollection.add(parameterSeriesCqCollectionItem);
		return this;
	}
	
	public List<ParameterSeriesCq> getParameterSeriesCqCollection() {
		return parameterSeriesCqCollection;
	}
	
	public void setParameterSeriesCqCollection(List<ParameterSeriesCq> parameterSeriesCqCollection) {
		this.parameterSeriesCqCollection = parameterSeriesCqCollection;
	}
}

