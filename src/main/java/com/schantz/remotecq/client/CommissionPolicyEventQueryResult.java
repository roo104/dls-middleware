package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionPolicyEventQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("eventCq")
	private CommissionPolicyEventCq eventCq = null;
	
	@JsonProperty("commissionAgreementRoleCqCollection")
	private List<CommissionAgreementRoleCq> commissionAgreementRoleCqCollection = new ArrayList<CommissionAgreementRoleCq>();
	
	public CommissionPolicyEventQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CommissionPolicyEventCq getEventCq() {
		return eventCq;
	}
	
	public void setEventCq(CommissionPolicyEventCq eventCq) {
		this.eventCq = eventCq;
	}
	
	public CommissionPolicyEventQueryResult addCommissionAgreementRoleCqCollectionItem(CommissionAgreementRoleCq commissionAgreementRoleCqCollectionItem) {
		this.commissionAgreementRoleCqCollection.add(commissionAgreementRoleCqCollectionItem);
		return this;
	}
	
	public List<CommissionAgreementRoleCq> getCommissionAgreementRoleCqCollection() {
		return commissionAgreementRoleCqCollection;
	}
	
	public void setCommissionAgreementRoleCqCollection(List<CommissionAgreementRoleCq> commissionAgreementRoleCqCollection) {
		this.commissionAgreementRoleCqCollection = commissionAgreementRoleCqCollection;
	}
}

