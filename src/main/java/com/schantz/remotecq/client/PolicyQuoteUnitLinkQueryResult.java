package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyQuoteUnitLinkQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("isUnitLink")
	private Boolean isUnitLink = false;
	
	public PolicyQuoteUnitLinkQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public Boolean getIsUnitLink() {
		return isUnitLink;
	}
	
	public void setIsUnitLink(Boolean isUnitLink) {
		this.isUnitLink = isUnitLink;
	}
}

