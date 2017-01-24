package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PriceCalculationDetailsQueryPriceCalculationDetailsQueryResult implements Serializable {
	@JsonProperty("calculationIdCollection")
	private List<PriceCalculationIdCq> calculationIdCollection = new ArrayList<PriceCalculationIdCq>();
	
	public PriceCalculationDetailsQueryPriceCalculationDetailsQueryResult addCalculationIdCollectionItem(PriceCalculationIdCq calculationIdCollectionItem) {
		this.calculationIdCollection.add(calculationIdCollectionItem);
		return this;
	}
	
	public List<PriceCalculationIdCq> getCalculationIdCollection() {
		return calculationIdCollection;
	}
	
	public void setCalculationIdCollection(List<PriceCalculationIdCq> calculationIdCollection) {
		this.calculationIdCollection = calculationIdCollection;
	}
}

