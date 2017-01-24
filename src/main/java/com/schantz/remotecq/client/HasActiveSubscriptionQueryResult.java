package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class HasActiveSubscriptionQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("preferredTaxCardType")
	private String preferredTaxCardType = null;
	
	@JsonProperty("isHasActiveSubscription")
	private Boolean isHasActiveSubscription = false;
	
	public HasActiveSubscriptionQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public String getPreferredTaxCardType() {
		return preferredTaxCardType;
	}
	
	public void setPreferredTaxCardType(String preferredTaxCardType) {
		this.preferredTaxCardType = preferredTaxCardType;
	}
	
	public Boolean getIsHasActiveSubscription() {
		return isHasActiveSubscription;
	}
	
	public void setIsHasActiveSubscription(Boolean isHasActiveSubscription) {
		this.isHasActiveSubscription = isHasActiveSubscription;
	}
}

