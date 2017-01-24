package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class DkMaxTaxPersonQueryDkMaxTaxPersonResult implements Serializable {
	@JsonProperty("viewAtDate")
	private LocalDate viewAtDate = null;
	
	@JsonProperty("personId")
	private PersonIdCq personId = null;
	
	@JsonProperty("year")
	private Long year = null;
	
	
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
	
	public Long getYear() {
		return year;
	}
	
	public void setYear(Long year) {
		this.year = year;
	}
}

