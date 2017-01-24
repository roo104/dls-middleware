package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PersonHealthRegistrationQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("personHealthDataCqCollection")
	private List<PersonHealthDataCq> personHealthDataCqCollection = new ArrayList<PersonHealthDataCq>();
	
	public PersonHealthRegistrationQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public PersonHealthRegistrationQueryResult addPersonHealthDataCqCollectionItem(PersonHealthDataCq personHealthDataCqCollectionItem) {
		this.personHealthDataCqCollection.add(personHealthDataCqCollectionItem);
		return this;
	}
	
	public List<PersonHealthDataCq> getPersonHealthDataCqCollection() {
		return personHealthDataCqCollection;
	}
	
	public void setPersonHealthDataCqCollection(List<PersonHealthDataCq> personHealthDataCqCollection) {
		this.personHealthDataCqCollection = personHealthDataCqCollection;
	}
}

