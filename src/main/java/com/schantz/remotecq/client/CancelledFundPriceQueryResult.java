package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CancelledFundPriceQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("fundPriceCqCollection")
	private List<FundPriceCq> fundPriceCqCollection = new ArrayList<FundPriceCq>();
	
	public CancelledFundPriceQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CancelledFundPriceQueryResult addFundPriceCqCollectionItem(FundPriceCq fundPriceCqCollectionItem) {
		this.fundPriceCqCollection.add(fundPriceCqCollectionItem);
		return this;
	}
	
	public List<FundPriceCq> getFundPriceCqCollection() {
		return fundPriceCqCollection;
	}
	
	public void setFundPriceCqCollection(List<FundPriceCq> fundPriceCqCollection) {
		this.fundPriceCqCollection = fundPriceCqCollection;
	}
}

