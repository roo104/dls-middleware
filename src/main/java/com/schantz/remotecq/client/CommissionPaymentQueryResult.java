package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionPaymentQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("commissionPaymentCqCollection")
	private List<CommissionPaymentCq> commissionPaymentCqCollection = new ArrayList<CommissionPaymentCq>();
	
	public CommissionPaymentQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CommissionPaymentQueryResult addCommissionPaymentCqCollectionItem(CommissionPaymentCq commissionPaymentCqCollectionItem) {
		this.commissionPaymentCqCollection.add(commissionPaymentCqCollectionItem);
		return this;
	}
	
	public List<CommissionPaymentCq> getCommissionPaymentCqCollection() {
		return commissionPaymentCqCollection;
	}
	
	public void setCommissionPaymentCqCollection(List<CommissionPaymentCq> commissionPaymentCqCollection) {
		this.commissionPaymentCqCollection = commissionPaymentCqCollection;
	}
}

