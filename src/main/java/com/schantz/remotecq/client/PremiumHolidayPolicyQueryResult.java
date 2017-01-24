package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PremiumHolidayPolicyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("premiumHolidayEventCqCollection")
	private List<PremiumHolidayEventCq> premiumHolidayEventCqCollection = new ArrayList<PremiumHolidayEventCq>();
	
	public PremiumHolidayPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PremiumHolidayPolicyQueryResult addPremiumHolidayEventCqCollectionItem(PremiumHolidayEventCq premiumHolidayEventCqCollectionItem) {
		this.premiumHolidayEventCqCollection.add(premiumHolidayEventCqCollectionItem);
		return this;
	}
	
	public List<PremiumHolidayEventCq> getPremiumHolidayEventCqCollection() {
		return premiumHolidayEventCqCollection;
	}
	
	public void setPremiumHolidayEventCqCollection(List<PremiumHolidayEventCq> premiumHolidayEventCqCollection) {
		this.premiumHolidayEventCqCollection = premiumHolidayEventCqCollection;
	}
}

