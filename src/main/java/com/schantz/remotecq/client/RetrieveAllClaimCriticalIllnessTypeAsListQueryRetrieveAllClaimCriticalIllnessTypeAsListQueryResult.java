package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class RetrieveAllClaimCriticalIllnessTypeAsListQueryRetrieveAllClaimCriticalIllnessTypeAsListQueryResult implements Serializable {
	@JsonProperty("occurrenceDate")
	private LocalDate occurrenceDate = null;
	
	@JsonProperty("personIdCq")
	private PersonIdCq personIdCq = null;
	
	
	public LocalDate getOccurrenceDate() {
		return occurrenceDate;
	}
	
	public void setOccurrenceDate(LocalDate occurrenceDate) {
		this.occurrenceDate = occurrenceDate;
	}
	
	public PersonIdCq getPersonIdCq() {
		return personIdCq;
	}
	
	public void setPersonIdCq(PersonIdCq personIdCq) {
		this.personIdCq = personIdCq;
	}
}

