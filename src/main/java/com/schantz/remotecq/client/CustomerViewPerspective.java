package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerViewPerspective implements Serializable {
	@JsonProperty("categoryCollection")
	private List<CustomerViewCategoryObject> categoryCollection = new ArrayList<CustomerViewCategoryObject>();
	
	@JsonProperty("triggerCollection")
	private List<String> triggerCollection = new ArrayList<String>();
	
	@JsonProperty("type")
	private String type = null;
	
	@JsonProperty("customerViewPerspectiveGroupingType")
	private String customerViewPerspectiveGroupingType = null;
	
	@JsonProperty("isShowFinishedCovers")
	private Boolean isShowFinishedCovers = false;
	
	@JsonProperty("isShowAdditionalCovers")
	private Boolean isShowAdditionalCovers = false;
	
	public CustomerViewPerspective addCategoryCollectionItem(CustomerViewCategoryObject categoryCollectionItem) {
		this.categoryCollection.add(categoryCollectionItem);
		return this;
	}
	
	public List<CustomerViewCategoryObject> getCategoryCollection() {
		return categoryCollection;
	}
	
	public void setCategoryCollection(List<CustomerViewCategoryObject> categoryCollection) {
		this.categoryCollection = categoryCollection;
	}
	
	public CustomerViewPerspective addTriggerCollectionItem(String triggerCollectionItem) {
		this.triggerCollection.add(triggerCollectionItem);
		return this;
	}
	
	public List<String> getTriggerCollection() {
		return triggerCollection;
	}
	
	public void setTriggerCollection(List<String> triggerCollection) {
		this.triggerCollection = triggerCollection;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCustomerViewPerspectiveGroupingType() {
		return customerViewPerspectiveGroupingType;
	}
	
	public void setCustomerViewPerspectiveGroupingType(String customerViewPerspectiveGroupingType) {
		this.customerViewPerspectiveGroupingType = customerViewPerspectiveGroupingType;
	}
	
	public Boolean getIsShowFinishedCovers() {
		return isShowFinishedCovers;
	}
	
	public void setIsShowFinishedCovers(Boolean isShowFinishedCovers) {
		this.isShowFinishedCovers = isShowFinishedCovers;
	}
	
	public Boolean getIsShowAdditionalCovers() {
		return isShowAdditionalCovers;
	}
	
	public void setIsShowAdditionalCovers(Boolean isShowAdditionalCovers) {
		this.isShowAdditionalCovers = isShowAdditionalCovers;
	}
}

