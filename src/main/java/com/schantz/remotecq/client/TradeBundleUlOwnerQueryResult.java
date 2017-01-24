package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class TradeBundleUlOwnerQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("tradeBundleCqCollection")
	private List<TradeBundleCq> tradeBundleCqCollection = new ArrayList<TradeBundleCq>();
	
	public TradeBundleUlOwnerQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public TradeBundleUlOwnerQueryResult addTradeBundleCqCollectionItem(TradeBundleCq tradeBundleCqCollectionItem) {
		this.tradeBundleCqCollection.add(tradeBundleCqCollectionItem);
		return this;
	}
	
	public List<TradeBundleCq> getTradeBundleCqCollection() {
		return tradeBundleCqCollection;
	}
	
	public void setTradeBundleCqCollection(List<TradeBundleCq> tradeBundleCqCollection) {
		this.tradeBundleCqCollection = tradeBundleCqCollection;
	}
}

