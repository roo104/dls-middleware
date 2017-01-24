package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerViewPerspectivesQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("customerViewPerspectiveTypeCollection")
	private List<String> customerViewPerspectiveTypeCollection = new ArrayList<String>();
	
	public CustomerViewPerspectivesQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CustomerViewPerspectivesQueryResult addCustomerViewPerspectiveTypeCollectionItem(String customerViewPerspectiveTypeCollectionItem) {
		this.customerViewPerspectiveTypeCollection.add(customerViewPerspectiveTypeCollectionItem);
		return this;
	}
	
	public List<String> getCustomerViewPerspectiveTypeCollection() {
		return customerViewPerspectiveTypeCollection;
	}
	
	public void setCustomerViewPerspectiveTypeCollection(List<String> customerViewPerspectiveTypeCollection) {
		this.customerViewPerspectiveTypeCollection = customerViewPerspectiveTypeCollection;
	}
}

