package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyPersonQueryPolicyPersonQueryResult implements Serializable {
	@JsonProperty("viewAtDate")
	private LocalDate viewAtDate = null;
	
	@JsonProperty("personId")
	private PersonIdCq personId = null;
	
	@JsonProperty("includeQuotes")
	private Boolean includeQuotes = false;
	
	
	public LocalDate getViewAtDate() {
		return viewAtDate;
	}
	
	public void setViewAtDate(LocalDate viewAtDate) {
		this.viewAtDate = viewAtDate;
	}
	
	public PersonIdCq getPersonId() {
		return personId;
	}
	
	public void setPersonId(PersonIdCq personId) {
		this.personId = personId;
	}
	
	public Boolean getIncludeQuotes() {
		return includeQuotes;
	}
	
	public void setIncludeQuotes(Boolean includeQuotes) {
		this.includeQuotes = includeQuotes;
	}
}

