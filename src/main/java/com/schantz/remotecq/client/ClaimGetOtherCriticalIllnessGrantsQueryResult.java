package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGetOtherCriticalIllnessGrantsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("claimGetOtherCriticalIllnessGrantsQueryEntryCollection")
	private List<ClaimGetOtherCriticalIllnessGrantsQueryEntry> claimGetOtherCriticalIllnessGrantsQueryEntryCollection = new ArrayList<ClaimGetOtherCriticalIllnessGrantsQueryEntry>();
	
	public ClaimGetOtherCriticalIllnessGrantsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ClaimGetOtherCriticalIllnessGrantsQueryResult addClaimGetOtherCriticalIllnessGrantsQueryEntryCollectionItem(ClaimGetOtherCriticalIllnessGrantsQueryEntry claimGetOtherCriticalIllnessGrantsQueryEntryCollectionItem) {
		this.claimGetOtherCriticalIllnessGrantsQueryEntryCollection.add(claimGetOtherCriticalIllnessGrantsQueryEntryCollectionItem);
		return this;
	}
	
	public List<ClaimGetOtherCriticalIllnessGrantsQueryEntry> getClaimGetOtherCriticalIllnessGrantsQueryEntryCollection() {
		return claimGetOtherCriticalIllnessGrantsQueryEntryCollection;
	}
	
	public void setClaimGetOtherCriticalIllnessGrantsQueryEntryCollection(List<ClaimGetOtherCriticalIllnessGrantsQueryEntry> claimGetOtherCriticalIllnessGrantsQueryEntryCollection) {
		this.claimGetOtherCriticalIllnessGrantsQueryEntryCollection = claimGetOtherCriticalIllnessGrantsQueryEntryCollection;
	}
}

