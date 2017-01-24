package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class OiAccountItemSearchQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("entryCollection")
	private List<OiAccountItemSearchEntry> entryCollection = new ArrayList<OiAccountItemSearchEntry>();
	
	@JsonProperty("sortOrderCq")
	private String sortOrderCq = null;
	
	@JsonProperty("pagingInfoCq")
	private PagingInfoCq pagingInfoCq = null;
	
	@JsonProperty("oiAccountInfoCq")
	private OiAccountInfoCq oiAccountInfoCq = null;
	
	public OiAccountItemSearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public OiAccountItemSearchQueryResult addEntryCollectionItem(OiAccountItemSearchEntry entryCollectionItem) {
		this.entryCollection.add(entryCollectionItem);
		return this;
	}
	
	public List<OiAccountItemSearchEntry> getEntryCollection() {
		return entryCollection;
	}
	
	public void setEntryCollection(List<OiAccountItemSearchEntry> entryCollection) {
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
	
	public OiAccountInfoCq getOiAccountInfoCq() {
		return oiAccountInfoCq;
	}
	
	public void setOiAccountInfoCq(OiAccountInfoCq oiAccountInfoCq) {
		this.oiAccountInfoCq = oiAccountInfoCq;
	}
}

