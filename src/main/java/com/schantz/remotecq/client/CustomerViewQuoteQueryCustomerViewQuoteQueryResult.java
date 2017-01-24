package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CustomerViewQuoteQueryCustomerViewQuoteQueryResult implements Serializable {
	@JsonProperty("viewAtDate")
	private LocalDate viewAtDate = null;
	
	@JsonProperty("quoteId")
	private QuoteIdCq quoteId = null;
	
	@JsonProperty("inclusionId")
	private EventInclusionIdCq inclusionId = null;
	
	@JsonProperty("customerViewPerspectiveType")
	private String customerViewPerspectiveType = null;
	
	@JsonProperty("isBeforeEvent")
	private Boolean isBeforeEvent = false;
	
	@JsonProperty("isUseSubDivisions")
	private Boolean isUseSubDivisions = false;
	
	
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
	
	public EventInclusionIdCq getInclusionId() {
		return inclusionId;
	}
	
	public void setInclusionId(EventInclusionIdCq inclusionId) {
		this.inclusionId = inclusionId;
	}
	
	public String getCustomerViewPerspectiveType() {
		return customerViewPerspectiveType;
	}
	
	public void setCustomerViewPerspectiveType(String customerViewPerspectiveType) {
		this.customerViewPerspectiveType = customerViewPerspectiveType;
	}
	
	public Boolean getIsBeforeEvent() {
		return isBeforeEvent;
	}
	
	public void setIsBeforeEvent(Boolean isBeforeEvent) {
		this.isBeforeEvent = isBeforeEvent;
	}
	
	public Boolean getIsUseSubDivisions() {
		return isUseSubDivisions;
	}
	
	public void setIsUseSubDivisions(Boolean isUseSubDivisions) {
		this.isUseSubDivisions = isUseSubDivisions;
	}
}

