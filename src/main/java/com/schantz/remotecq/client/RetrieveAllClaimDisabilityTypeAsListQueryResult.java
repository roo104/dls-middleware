package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RetrieveAllClaimDisabilityTypeAsListQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("claimProductTypeCauseCqCollection")
	private List<ClaimProductTypeCauseCq> claimProductTypeCauseCqCollection = new ArrayList<ClaimProductTypeCauseCq>();
	
	public RetrieveAllClaimDisabilityTypeAsListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RetrieveAllClaimDisabilityTypeAsListQueryResult addClaimProductTypeCauseCqCollectionItem(ClaimProductTypeCauseCq claimProductTypeCauseCqCollectionItem) {
		this.claimProductTypeCauseCqCollection.add(claimProductTypeCauseCqCollectionItem);
		return this;
	}
	
	public List<ClaimProductTypeCauseCq> getClaimProductTypeCauseCqCollection() {
		return claimProductTypeCauseCqCollection;
	}
	
	public void setClaimProductTypeCauseCqCollection(List<ClaimProductTypeCauseCq> claimProductTypeCauseCqCollection) {
		this.claimProductTypeCauseCqCollection = claimProductTypeCauseCqCollection;
	}
}

