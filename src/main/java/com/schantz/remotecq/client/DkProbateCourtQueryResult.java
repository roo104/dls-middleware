package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DkProbateCourtQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("companyIdCqCollection")
	private List<CompanyIdCq> companyIdCqCollection = new ArrayList<CompanyIdCq>();
	
	public DkProbateCourtQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public DkProbateCourtQueryResult addCompanyIdCqCollectionItem(CompanyIdCq companyIdCqCollectionItem) {
		this.companyIdCqCollection.add(companyIdCqCollectionItem);
		return this;
	}
	
	public List<CompanyIdCq> getCompanyIdCqCollection() {
		return companyIdCqCollection;
	}
	
	public void setCompanyIdCqCollection(List<CompanyIdCq> companyIdCqCollection) {
		this.companyIdCqCollection = companyIdCqCollection;
	}
}

