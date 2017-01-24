package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerViewQuoteQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("customerViewDataCollection")
	private List<CustomerViewData> customerViewDataCollection = new ArrayList<CustomerViewData>();
	
	public CustomerViewQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public CustomerViewQuoteQueryResult addCustomerViewDataCollectionItem(CustomerViewData customerViewDataCollectionItem) {
		this.customerViewDataCollection.add(customerViewDataCollectionItem);
		return this;
	}
	
	public List<CustomerViewData> getCustomerViewDataCollection() {
		return customerViewDataCollection;
	}
	
	public void setCustomerViewDataCollection(List<CustomerViewData> customerViewDataCollection) {
		this.customerViewDataCollection = customerViewDataCollection;
	}
}

