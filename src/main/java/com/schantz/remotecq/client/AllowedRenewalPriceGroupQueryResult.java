package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AllowedRenewalPriceGroupQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("priceGroupRenewalCycleEntryCqCollection")
	private List<PriceGroupRenewalCycleEntryCq> priceGroupRenewalCycleEntryCqCollection = new ArrayList<PriceGroupRenewalCycleEntryCq>();
	
	public AllowedRenewalPriceGroupQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public AllowedRenewalPriceGroupQueryResult addPriceGroupRenewalCycleEntryCqCollectionItem(PriceGroupRenewalCycleEntryCq priceGroupRenewalCycleEntryCqCollectionItem) {
		this.priceGroupRenewalCycleEntryCqCollection.add(priceGroupRenewalCycleEntryCqCollectionItem);
		return this;
	}
	
	public List<PriceGroupRenewalCycleEntryCq> getPriceGroupRenewalCycleEntryCqCollection() {
		return priceGroupRenewalCycleEntryCqCollection;
	}
	
	public void setPriceGroupRenewalCycleEntryCqCollection(List<PriceGroupRenewalCycleEntryCq> priceGroupRenewalCycleEntryCqCollection) {
		this.priceGroupRenewalCycleEntryCqCollection = priceGroupRenewalCycleEntryCqCollection;
	}
}

