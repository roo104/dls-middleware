package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ParameterSeriesQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("parameterSeriesCq")
	private ParameterSeriesCq parameterSeriesCq = null;
	
	public ParameterSeriesQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ParameterSeriesCq getParameterSeriesCq() {
		return parameterSeriesCq;
	}
	
	public void setParameterSeriesCq(ParameterSeriesCq parameterSeriesCq) {
		this.parameterSeriesCq = parameterSeriesCq;
	}
}

