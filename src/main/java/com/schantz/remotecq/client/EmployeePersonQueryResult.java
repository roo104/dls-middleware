package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EmployeePersonQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("personEmployeeEntryCollection")
	private List<PersonEmployeeEntry> personEmployeeEntryCollection = new ArrayList<PersonEmployeeEntry>();
	
	public EmployeePersonQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public EmployeePersonQueryResult addPersonEmployeeEntryCollectionItem(PersonEmployeeEntry personEmployeeEntryCollectionItem) {
		this.personEmployeeEntryCollection.add(personEmployeeEntryCollectionItem);
		return this;
	}
	
	public List<PersonEmployeeEntry> getPersonEmployeeEntryCollection() {
		return personEmployeeEntryCollection;
	}
	
	public void setPersonEmployeeEntryCollection(List<PersonEmployeeEntry> personEmployeeEntryCollection) {
		this.personEmployeeEntryCollection = personEmployeeEntryCollection;
	}
}

