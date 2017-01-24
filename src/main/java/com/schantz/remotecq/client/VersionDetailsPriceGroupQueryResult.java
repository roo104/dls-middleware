package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsPriceGroupQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("priceGroupVersionCq")
	private PriceGroupVersionCq priceGroupVersionCq = null;
	
	public VersionDetailsPriceGroupQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PriceGroupVersionCq getPriceGroupVersionCq() {
		return priceGroupVersionCq;
	}
	
	public void setPriceGroupVersionCq(PriceGroupVersionCq priceGroupVersionCq) {
		this.priceGroupVersionCq = priceGroupVersionCq;
	}
}

