package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CreateClaimGrantCriticalIllnessCommand implements Serializable {
	@JsonProperty("occurrenceDate")
	private LocalDate occurrenceDate = null;
	
	@JsonProperty("reportedDate")
	private LocalDate reportedDate = null;
	
	@JsonProperty("claimCriticalIllnessTypeIdCq")
	private ClaimCriticalIllnessTypeIdCq claimCriticalIllnessTypeIdCq = null;
	
	@JsonProperty("claimVersionIdCq")
	private ClaimVersionIdCq claimVersionIdCq = null;
	
	
	public LocalDate getOccurrenceDate() {
		return occurrenceDate;
	}
	
	public void setOccurrenceDate(LocalDate occurrenceDate) {
		this.occurrenceDate = occurrenceDate;
	}
	
	public LocalDate getReportedDate() {
		return reportedDate;
	}
	
	public void setReportedDate(LocalDate reportedDate) {
		this.reportedDate = reportedDate;
	}
	
	public ClaimCriticalIllnessTypeIdCq getClaimCriticalIllnessTypeIdCq() {
		return claimCriticalIllnessTypeIdCq;
	}
	
	public void setClaimCriticalIllnessTypeIdCq(ClaimCriticalIllnessTypeIdCq claimCriticalIllnessTypeIdCq) {
		this.claimCriticalIllnessTypeIdCq = claimCriticalIllnessTypeIdCq;
	}
	
	public ClaimVersionIdCq getClaimVersionIdCq() {
		return claimVersionIdCq;
	}
	
	public void setClaimVersionIdCq(ClaimVersionIdCq claimVersionIdCq) {
		this.claimVersionIdCq = claimVersionIdCq;
	}
}

