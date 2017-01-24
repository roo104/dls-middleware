package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimCaseProductTypeSearchQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("entryCollection")
	private List<ClaimCaseProductTypeSearchEntry> entryCollection = new ArrayList<ClaimCaseProductTypeSearchEntry>();
	
	@JsonProperty("sortOrderCq")
	private String sortOrderCq = null;
	
	@JsonProperty("pagingInfoCq")
	private PagingInfoCq pagingInfoCq = null;
	
	@JsonProperty("claimProductTypeSelectionFrameCq")
	private ClaimProductTypeSelectionFrameCq claimProductTypeSelectionFrameCq = null;
	
	@JsonProperty("lifeCaseStateSelectionFrameCq")
	private LifeCaseStateSelectionFrameCq lifeCaseStateSelectionFrameCq = null;
	
	public ClaimCaseProductTypeSearchQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ClaimCaseProductTypeSearchQueryResult addEntryCollectionItem(ClaimCaseProductTypeSearchEntry entryCollectionItem) {
		this.entryCollection.add(entryCollectionItem);
		return this;
	}
	
	public List<ClaimCaseProductTypeSearchEntry> getEntryCollection() {
		return entryCollection;
	}
	
	public void setEntryCollection(List<ClaimCaseProductTypeSearchEntry> entryCollection) {
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
	
	public ClaimProductTypeSelectionFrameCq getClaimProductTypeSelectionFrameCq() {
		return claimProductTypeSelectionFrameCq;
	}
	
	public void setClaimProductTypeSelectionFrameCq(ClaimProductTypeSelectionFrameCq claimProductTypeSelectionFrameCq) {
		this.claimProductTypeSelectionFrameCq = claimProductTypeSelectionFrameCq;
	}
	
	public LifeCaseStateSelectionFrameCq getLifeCaseStateSelectionFrameCq() {
		return lifeCaseStateSelectionFrameCq;
	}
	
	public void setLifeCaseStateSelectionFrameCq(LifeCaseStateSelectionFrameCq lifeCaseStateSelectionFrameCq) {
		this.lifeCaseStateSelectionFrameCq = lifeCaseStateSelectionFrameCq;
	}
}

