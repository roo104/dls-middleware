package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerViewGroup implements Serializable {
	@JsonProperty("priority")
	private Long priority = null;
	
	@JsonProperty("customerViewValueCollection")
	private List<CustomerViewValueObject> customerViewValueCollection = new ArrayList<CustomerViewValueObject>();
	
	@JsonProperty("customerViewEntryCollection")
	private List<CustomerViewEntry> customerViewEntryCollection = new ArrayList<CustomerViewEntry>();
	
	@JsonProperty("id")
	private CustomerViewGroupId id = null;
	
	
	public Long getPriority() {
		return priority;
	}
	
	public void setPriority(Long priority) {
		this.priority = priority;
	}
	
	public CustomerViewGroup addCustomerViewValueCollectionItem(CustomerViewValueObject customerViewValueCollectionItem) {
		this.customerViewValueCollection.add(customerViewValueCollectionItem);
		return this;
	}
	
	public List<CustomerViewValueObject> getCustomerViewValueCollection() {
		return customerViewValueCollection;
	}
	
	public void setCustomerViewValueCollection(List<CustomerViewValueObject> customerViewValueCollection) {
		this.customerViewValueCollection = customerViewValueCollection;
	}
	
	public CustomerViewGroup addCustomerViewEntryCollectionItem(CustomerViewEntry customerViewEntryCollectionItem) {
		this.customerViewEntryCollection.add(customerViewEntryCollectionItem);
		return this;
	}
	
	public List<CustomerViewEntry> getCustomerViewEntryCollection() {
		return customerViewEntryCollection;
	}
	
	public void setCustomerViewEntryCollection(List<CustomerViewEntry> customerViewEntryCollection) {
		this.customerViewEntryCollection = customerViewEntryCollection;
	}
	
	public CustomerViewGroupId getId() {
		return id;
	}
	
	public void setId(CustomerViewGroupId id) {
		this.id = id;
	}
}

