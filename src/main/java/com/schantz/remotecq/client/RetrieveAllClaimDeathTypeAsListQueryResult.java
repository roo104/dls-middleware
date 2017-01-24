package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RetrieveAllClaimDeathTypeAsListQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("claimProductTypeCauseCqCollection")
	private List<ClaimProductTypeCauseCq> claimProductTypeCauseCqCollection = new ArrayList<ClaimProductTypeCauseCq>();
	
	public RetrieveAllClaimDeathTypeAsListQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RetrieveAllClaimDeathTypeAsListQueryResult addClaimProductTypeCauseCqCollectionItem(ClaimProductTypeCauseCq claimProductTypeCauseCqCollectionItem) {
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

