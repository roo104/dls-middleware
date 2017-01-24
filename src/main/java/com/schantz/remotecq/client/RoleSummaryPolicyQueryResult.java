package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class RoleSummaryPolicyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("legalPartyRoleCqCollection")
	private List<LegalPartyRoleCq> legalPartyRoleCqCollection = new ArrayList<LegalPartyRoleCq>();
	
	public RoleSummaryPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public RoleSummaryPolicyQueryResult addLegalPartyRoleCqCollectionItem(LegalPartyRoleCq legalPartyRoleCqCollectionItem) {
		this.legalPartyRoleCqCollection.add(legalPartyRoleCqCollectionItem);
		return this;
	}
	
	public List<LegalPartyRoleCq> getLegalPartyRoleCqCollection() {
		return legalPartyRoleCqCollection;
	}
	
	public void setLegalPartyRoleCqCollection(List<LegalPartyRoleCq> legalPartyRoleCqCollection) {
		this.legalPartyRoleCqCollection = legalPartyRoleCqCollection;
	}
}

