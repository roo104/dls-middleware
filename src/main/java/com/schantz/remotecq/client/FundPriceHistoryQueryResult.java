package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class FundPriceHistoryQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("entryCollection")
	private List<FundPriceCq> entryCollection = new ArrayList<FundPriceCq>();
	
	@JsonProperty("sortOrderCq")
	private String sortOrderCq = null;
	
	@JsonProperty("pagingInfoCq")
	private PagingInfoCq pagingInfoCq = null;
	
	@JsonProperty("fundPriceCqCollection")
	private List<FundPriceCq> fundPriceCqCollection = new ArrayList<FundPriceCq>();
	
	public FundPriceHistoryQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public FundPriceHistoryQueryResult addEntryCollectionItem(FundPriceCq entryCollectionItem) {
		this.entryCollection.add(entryCollectionItem);
		return this;
	}
	
	public List<FundPriceCq> getEntryCollection() {
		return entryCollection;
	}
	
	public void setEntryCollection(List<FundPriceCq> entryCollection) {
		this.entryCollection = entryCollection;
	}
	
	public String getSortOrderCq() {
		return sortOrderCq;
	}
	
	public void setSortOrderCq(String sortOrderCq) {
		this.sortOrderCq = sortOrderCq;
	}
	
	public PagingInfoCq getPagingInfoCq() {
		return pagingInfoCq;
	}
	
	public void setPagingInfoCq(PagingInfoCq pagingInfoCq) {
		this.pagingInfoCq = pagingInfoCq;
	}
	
	public FundPriceHistoryQueryResult addFundPriceCqCollectionItem(FundPriceCq fundPriceCqCollectionItem) {
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

