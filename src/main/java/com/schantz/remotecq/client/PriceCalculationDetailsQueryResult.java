package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PriceCalculationDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("priceCalculationCqCollection")
	private List<PriceCalculationCq> priceCalculationCqCollection = new ArrayList<PriceCalculationCq>();
	
	public PriceCalculationDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PriceCalculationDetailsQueryResult addPriceCalculationCqCollectionItem(PriceCalculationCq priceCalculationCqCollectionItem) {
		this.priceCalculationCqCollection.add(priceCalculationCqCollectionItem);
		return this;
	}
	
	public List<PriceCalculationCq> getPriceCalculationCqCollection() {
		return priceCalculationCqCollection;
	}
	
	public void setPriceCalculationCqCollection(List<PriceCalculationCq> priceCalculationCqCollection) {
		this.priceCalculationCqCollection = priceCalculationCqCollection;
	}
}

