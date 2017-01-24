package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PremiumHolidayEventCq implements Serializable {
	@JsonProperty("eventDate")
	private LocalDate eventDate = null;
	
	@JsonProperty("lifeEventIdCq")
	private String lifeEventIdCq = null;
	
	@JsonProperty("inclusionId")
	private EventInclusionIdCq inclusionId = null;
	
	@JsonProperty("validationOverrideCqCollection")
	private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("noOfMonths")
	private Long noOfMonths = null;
	
	@JsonProperty("actualNoOfMonths")
	private Long actualNoOfMonths = null;
	
	@JsonProperty("premiumHolidayTypeCq")
	private String premiumHolidayTypeCq = null;
	
	
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
	
	public PremiumHolidayEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
		this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
		return this;
	}
	
	public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
		return validationOverrideCqCollection;
	}
	
	public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
		this.validationOverrideCqCollection = validationOverrideCqCollection;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public Long getNoOfMonths() {
		return noOfMonths;
	}
	
	public void setNoOfMonths(Long noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	
	public Long getActualNoOfMonths() {
		return actualNoOfMonths;
	}
	
	public void setActualNoOfMonths(Long actualNoOfMonths) {
		this.actualNoOfMonths = actualNoOfMonths;
	}
	
	public String getPremiumHolidayTypeCq() {
		return premiumHolidayTypeCq;
	}
	
	public void setPremiumHolidayTypeCq(String premiumHolidayTypeCq) {
		this.premiumHolidayTypeCq = premiumHolidayTypeCq;
	}
}

