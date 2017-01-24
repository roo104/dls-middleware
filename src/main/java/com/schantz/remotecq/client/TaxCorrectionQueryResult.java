package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class TaxCorrectionQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("taxCorrectionMonthlyCollection")
	private List<TaxCorrectionMonthly> taxCorrectionMonthlyCollection = new ArrayList<TaxCorrectionMonthly>();
	
	public TaxCorrectionQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public TaxCorrectionQueryResult addTaxCorrectionMonthlyCollectionItem(TaxCorrectionMonthly taxCorrectionMonthlyCollectionItem) {
		this.taxCorrectionMonthlyCollection.add(taxCorrectionMonthlyCollectionItem);
		return this;
	}
	
	public List<TaxCorrectionMonthly> getTaxCorrectionMonthlyCollection() {
		return taxCorrectionMonthlyCollection;
	}
	
	public void setTaxCorrectionMonthlyCollection(List<TaxCorrectionMonthly> taxCorrectionMonthlyCollection) {
		this.taxCorrectionMonthlyCollection = taxCorrectionMonthlyCollection;
	}
}

