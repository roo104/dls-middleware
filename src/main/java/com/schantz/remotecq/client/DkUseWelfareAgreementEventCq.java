package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DkUseWelfareAgreementEventCq implements Serializable {
	@JsonProperty("eventDate")
	private LocalDate eventDate = null;
	
	@JsonProperty("lifeEventIdCq")
	private String lifeEventIdCq = null;
	
	@JsonProperty("inclusionId")
	private EventInclusionIdCq inclusionId = null;
	
	@JsonProperty("validationOverrideCqCollection")
	private List<ValidationOverrideCq> validationOverrideCqCollection = new ArrayList<ValidationOverrideCq>();
	
	@JsonProperty("earliestRetirementAge")
	private AgeCq earliestRetirementAge = null;
	
	@JsonProperty("isUseWelfareAgreement")
	private Boolean isUseWelfareAgreement = false;
	
	@JsonProperty("isWelfareAgreementDecided")
	private Boolean isWelfareAgreementDecided = false;
	
	
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
	
	public DkUseWelfareAgreementEventCq addValidationOverrideCqCollectionItem(ValidationOverrideCq validationOverrideCqCollectionItem) {
		this.validationOverrideCqCollection.add(validationOverrideCqCollectionItem);
		return this;
	}
	
	public List<ValidationOverrideCq> getValidationOverrideCqCollection() {
		return validationOverrideCqCollection;
	}
	
	public void setValidationOverrideCqCollection(List<ValidationOverrideCq> validationOverrideCqCollection) {
		this.validationOverrideCqCollection = validationOverrideCqCollection;
	}
	
	public AgeCq getEarliestRetirementAge() {
		return earliestRetirementAge;
	}
	
	public void setEarliestRetirementAge(AgeCq earliestRetirementAge) {
		this.earliestRetirementAge = earliestRetirementAge;
	}
	
	public Boolean getIsUseWelfareAgreement() {
		return isUseWelfareAgreement;
	}
	
	public void setIsUseWelfareAgreement(Boolean isUseWelfareAgreement) {
		this.isUseWelfareAgreement = isUseWelfareAgreement;
	}
	
	public Boolean getIsWelfareAgreementDecided() {
		return isWelfareAgreementDecided;
	}
	
	public void setIsWelfareAgreementDecided(Boolean isWelfareAgreementDecided) {
		this.isWelfareAgreementDecided = isWelfareAgreementDecided;
	}
}

