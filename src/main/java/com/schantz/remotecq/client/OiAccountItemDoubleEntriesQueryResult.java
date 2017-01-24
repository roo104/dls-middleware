package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class OiAccountItemDoubleEntriesQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("oiAccountItemDoubleEntryCqCollection")
	private List<OiAccountItemDoubleEntryCq> oiAccountItemDoubleEntryCqCollection = new ArrayList<OiAccountItemDoubleEntryCq>();
	
	public OiAccountItemDoubleEntriesQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public OiAccountItemDoubleEntriesQueryResult addOiAccountItemDoubleEntryCqCollectionItem(OiAccountItemDoubleEntryCq oiAccountItemDoubleEntryCqCollectionItem) {
		this.oiAccountItemDoubleEntryCqCollection.add(oiAccountItemDoubleEntryCqCollectionItem);
		return this;
	}
	
	public List<OiAccountItemDoubleEntryCq> getOiAccountItemDoubleEntryCqCollection() {
		return oiAccountItemDoubleEntryCqCollection;
	}
	
	public void setOiAccountItemDoubleEntryCqCollection(List<OiAccountItemDoubleEntryCq> oiAccountItemDoubleEntryCqCollection) {
		this.oiAccountItemDoubleEntryCqCollection = oiAccountItemDoubleEntryCqCollection;
	}
}

