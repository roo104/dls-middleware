package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CreateClaimGrantDisabilityCommand implements Serializable {
	@JsonProperty("occurrenceDate")
	private LocalDate occurrenceDate = null;
	
	@JsonProperty("reportedDate")
	private LocalDate reportedDate = null;
	
	@JsonProperty("claimVersionIdCq")
	private ClaimVersionIdCq claimVersionIdCq = null;
	
	@JsonProperty("claimProductTypeCauseIdCq")
	private ClaimProductTypeCauseIdCq claimProductTypeCauseIdCq = null;
	
	
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
	
	public ClaimVersionIdCq getClaimVersionIdCq() {
		return claimVersionIdCq;
	}
	
	public void setClaimVersionIdCq(ClaimVersionIdCq claimVersionIdCq) {
		this.claimVersionIdCq = claimVersionIdCq;
	}
	
	public ClaimProductTypeCauseIdCq getClaimProductTypeCauseIdCq() {
		return claimProductTypeCauseIdCq;
	}
	
	public void setClaimProductTypeCauseIdCq(ClaimProductTypeCauseIdCq claimProductTypeCauseIdCq) {
		this.claimProductTypeCauseIdCq = claimProductTypeCauseIdCq;
	}
}

