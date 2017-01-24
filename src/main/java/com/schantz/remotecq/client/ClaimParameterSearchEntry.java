package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimParameterSearchEntry implements Serializable {
	@JsonProperty("valueName")
	private String valueName = null;
	
	@JsonProperty("parameterType")
	private String parameterType = null;
	
	@JsonProperty("claimParameterIdCq")
	private ClaimParameterIdCq claimParameterIdCq = null;
	
	@JsonProperty("productTypeCollection")
	private List<String> productTypeCollection = new ArrayList<String>();
	
	
	public String getValueName() {
		return valueName;
	}
	
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	
	public String getParameterType() {
		return parameterType;
	}
	
	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	
	public ClaimParameterIdCq getClaimParameterIdCq() {
		return claimParameterIdCq;
	}
	
	public void setClaimParameterIdCq(ClaimParameterIdCq claimParameterIdCq) {
		this.claimParameterIdCq = claimParameterIdCq;
	}
	
	public ClaimParameterSearchEntry addProductTypeCollectionItem(String productTypeCollectionItem) {
		this.productTypeCollection.add(productTypeCollectionItem);
		return this;
	}
	
	public List<String> getProductTypeCollection() {
		return productTypeCollection;
	}
	
	public void setProductTypeCollection(List<String> productTypeCollection) {
		this.productTypeCollection = productTypeCollection;
	}
}

