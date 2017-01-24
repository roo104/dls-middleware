package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyCompanyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("companyPolicyEntryCollection")
	private List<CompanyPolicyEntry> companyPolicyEntryCollection = new ArrayList<CompanyPolicyEntry>();
	
	public PolicyCompanyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PolicyCompanyQueryResult addCompanyPolicyEntryCollectionItem(CompanyPolicyEntry companyPolicyEntryCollectionItem) {
		this.companyPolicyEntryCollection.add(companyPolicyEntryCollectionItem);
		return this;
	}
	
	public List<CompanyPolicyEntry> getCompanyPolicyEntryCollection() {
		return companyPolicyEntryCollection;
	}
	
	public void setCompanyPolicyEntryCollection(List<CompanyPolicyEntry> companyPolicyEntryCollection) {
		this.companyPolicyEntryCollection = companyPolicyEntryCollection;
	}
}

