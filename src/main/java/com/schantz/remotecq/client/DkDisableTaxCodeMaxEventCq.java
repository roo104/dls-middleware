package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DkDisableTaxCodeMaxEventCq implements Serializable {
	@JsonProperty("eventDate")
	private LocalDate eventDate = null;
	
	@JsonProperty("lifeEventIdCq")
	private String lifeEventIdCq = null;
	
	@JsonProperty("inclusionId")
	private EventInclusionIdCq inclusionId = null;
	
	@JsonProperty("validationOverrideCqCollection")
	private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();
	
	@JsonProperty("isDisableTaxCodeEightMax")
	private Boolean isDisableTaxCodeEightMax = false;
	
	@JsonProperty("isDisableTaxCodeThreeMax")
	private Boolean isDisableTaxCodeThreeMax = false;
	
	@JsonProperty("isDisableTaxCodeTwoMax")
	private Boolean isDisableTaxCodeTwoMax = false;
	
	
	public LocalDate getEventDate() {
		return eventDate;
	}
	
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	
	public String getLifeEventIdCq() {
		return lifeEventIdCq;
	}
	
	public void setLifeEventIdCq(String lifeEventIdCq) {
		this.lifeEventIdCq = lifeEventIdCq;
	}
	
	public EventInclusionIdCq getInclusionId() {
		return inclusionId;
	}
	
	public void setInclusionId(EventInclusionIdCq inclusionId) {
		this.inclusionId = inclusionId;
	}
	
	public DkDisableTaxCodeMaxEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
		this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
		return this;
	}
	
	public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
		return validationOverrideCqCollection;
	}
	
	public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
		this.validationOverrideCqCollection = validationOverrideCqCollection;
	}
	
	public Boolean getIsDisableTaxCodeEightMax() {
		return isDisableTaxCodeEightMax;
	}
	
	public void setIsDisableTaxCodeEightMax(Boolean isDisableTaxCodeEightMax) {
		this.isDisableTaxCodeEightMax = isDisableTaxCodeEightMax;
	}
	
	public Boolean getIsDisableTaxCodeThreeMax() {
		return isDisableTaxCodeThreeMax;
	}
	
	public void setIsDisableTaxCodeThreeMax(Boolean isDisableTaxCodeThreeMax) {
		this.isDisableTaxCodeThreeMax = isDisableTaxCodeThreeMax;
	}
	
	public Boolean getIsDisableTaxCodeTwoMax() {
		return isDisableTaxCodeTwoMax;
	}
	
	public void setIsDisableTaxCodeTwoMax(Boolean isDisableTaxCodeTwoMax) {
		this.isDisableTaxCodeTwoMax = isDisableTaxCodeTwoMax;
	}
}

