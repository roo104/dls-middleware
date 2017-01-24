package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DkMaxTaxPersonResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("year")
	private Long year = null;
	
	@JsonProperty("dkLifePolicyMaxTaxResultCollection")
	private List<DkLifePolicyMaxTaxResult> dkLifePolicyMaxTaxResultCollection = new ArrayList<DkLifePolicyMaxTaxResult>();
	
	@JsonProperty("dkExternalMaxTaxResultCollection")
	private List<DkExternalMaxTaxResult> dkExternalMaxTaxResultCollection = new ArrayList<DkExternalMaxTaxResult>();
	
	@JsonProperty("personIdCq")
	private PersonIdCq personIdCq = null;
	
	public DkMaxTaxPersonResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public Long getYear() {
		return year;
	}
	
	public void setYear(Long year) {
		this.year = year;
	}
	
	public DkMaxTaxPersonResult addDkLifePolicyMaxTaxResultCollectionItem(DkLifePolicyMaxTaxResult dkLifePolicyMaxTaxResultCollectionItem) {
		this.dkLifePolicyMaxTaxResultCollection.add(dkLifePolicyMaxTaxResultCollectionItem);
		return this;
	}
	
	public List<DkLifePolicyMaxTaxResult> getDkLifePolicyMaxTaxResultCollection() {
		return dkLifePolicyMaxTaxResultCollection;
	}
	
	public void setDkLifePolicyMaxTaxResultCollection(List<DkLifePolicyMaxTaxResult> dkLifePolicyMaxTaxResultCollection) {
		this.dkLifePolicyMaxTaxResultCollection = dkLifePolicyMaxTaxResultCollection;
	}
	
	public DkMaxTaxPersonResult addDkExternalMaxTaxResultCollectionItem(DkExternalMaxTaxResult dkExternalMaxTaxResultCollectionItem) {
		this.dkExternalMaxTaxResultCollection.add(dkExternalMaxTaxResultCollectionItem);
		return this;
	}
	
	public List<DkExternalMaxTaxResult> getDkExternalMaxTaxResultCollection() {
		return dkExternalMaxTaxResultCollection;
	}
	
	public void setDkExternalMaxTaxResultCollection(List<DkExternalMaxTaxResult> dkExternalMaxTaxResultCollection) {
		this.dkExternalMaxTaxResultCollection = dkExternalMaxTaxResultCollection;
	}
	
	public PersonIdCq getPersonIdCq() {
		return personIdCq;
	}
	
	public void setPersonIdCq(PersonIdCq personIdCq) {
		this.personIdCq = personIdCq;
	}
}

