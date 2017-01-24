package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerViewDiffQueryCustomerViewDiffQueryResult implements Serializable {
	@JsonProperty("viewAtDate")
	private LocalDate viewAtDate = null;
	
	@JsonProperty("quoteId")
	private QuoteIdCq quoteId = null;
	
	@JsonProperty("policyIdCollection")
	private List<PolicyIdCq> policyIdCollection = new ArrayList<PolicyIdCq>();
	
	@JsonProperty("customerViewPerspectiveGroupingType")
	private String customerViewPerspectiveGroupingType = null;
	
	@JsonProperty("customerViewPerspectiveType")
	private String customerViewPerspectiveType = null;
	
	
	public LocalDate getViewAtDate() {
		return viewAtDate;
	}
	
	public void setViewAtDate(LocalDate viewAtDate) {
		this.viewAtDate = viewAtDate;
	}
	
	public QuoteIdCq getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(QuoteIdCq quoteId) {
		this.quoteId = quoteId;
	}
	
	public CustomerViewDiffQueryCustomerViewDiffQueryResult addPolicyIdCollectionItem(PolicyIdCq policyIdCollectionItem) {
		this.policyIdCollection.add(policyIdCollectionItem);
		return this;
	}
	
	public List<PolicyIdCq> getPolicyIdCollection() {
		return policyIdCollection;
	}
	
	public void setPolicyIdCollection(List<PolicyIdCq> policyIdCollection) {
		this.policyIdCollection = policyIdCollection;
	}
	
	public String getCustomerViewPerspectiveGroupingType() {
		return customerViewPerspectiveGroupingType;
	}
	
	public void setCustomerViewPerspectiveGroupingType(String customerViewPerspectiveGroupingType) {
		this.customerViewPerspectiveGroupingType = customerViewPerspectiveGroupingType;
	}
	
	public String getCustomerViewPerspectiveType() {
		return customerViewPerspectiveType;
	}
	
	public void setCustomerViewPerspectiveType(String customerViewPerspectiveType) {
		this.customerViewPerspectiveType = customerViewPerspectiveType;
	}
}

