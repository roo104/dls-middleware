package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyPersonQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("personPolicyEntryCollection")
	private List<PersonPolicyEntry> personPolicyEntryCollection = new ArrayList<PersonPolicyEntry>();
	
	public PolicyPersonQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PolicyPersonQueryResult addPersonPolicyEntryCollectionItem(PersonPolicyEntry personPolicyEntryCollectionItem) {
		this.personPolicyEntryCollection.add(personPolicyEntryCollectionItem);
		return this;
	}
	
	public List<PersonPolicyEntry> getPersonPolicyEntryCollection() {
		return personPolicyEntryCollection;
	}
	
	public void setPersonPolicyEntryCollection(List<PersonPolicyEntry> personPolicyEntryCollection) {
		this.personPolicyEntryCollection = personPolicyEntryCollection;
	}
}

