package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AdvanceStateQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("advanceStateCqCollection")
	private List<AdvanceStateCq> advanceStateCqCollection = new ArrayList<AdvanceStateCq>();
	
	public AdvanceStateQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public AdvanceStateQueryResult addAdvanceStateCqCollectionItem(AdvanceStateCq advanceStateCqCollectionItem) {
		this.advanceStateCqCollection.add(advanceStateCqCollectionItem);
		return this;
	}
	
	public List<AdvanceStateCq> getAdvanceStateCqCollection() {
		return advanceStateCqCollection;
	}
	
	public void setAdvanceStateCqCollection(List<AdvanceStateCq> advanceStateCqCollection) {
		this.advanceStateCqCollection = advanceStateCqCollection;
	}
}

