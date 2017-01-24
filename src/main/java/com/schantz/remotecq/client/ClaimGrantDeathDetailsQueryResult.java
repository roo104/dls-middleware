package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantDeathDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("claimGrantDeathDetailCollection")
	private List<ClaimGrantDeathDetail> claimGrantDeathDetailCollection = new ArrayList<ClaimGrantDeathDetail>();
	
	public ClaimGrantDeathDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ClaimGrantDeathDetailsQueryResult addClaimGrantDeathDetailCollectionItem(ClaimGrantDeathDetail claimGrantDeathDetailCollectionItem) {
		this.claimGrantDeathDetailCollection.add(claimGrantDeathDetailCollectionItem);
		return this;
	}
	
	public List<ClaimGrantDeathDetail> getClaimGrantDeathDetailCollection() {
		return claimGrantDeathDetailCollection;
	}
	
	public void setClaimGrantDeathDetailCollection(List<ClaimGrantDeathDetail> claimGrantDeathDetailCollection) {
		this.claimGrantDeathDetailCollection = claimGrantDeathDetailCollection;
	}
}

