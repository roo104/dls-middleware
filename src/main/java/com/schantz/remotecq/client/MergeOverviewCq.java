package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class MergeOverviewCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("mergeDate")
	private LocalDate mergeDate = null;
	
	@JsonProperty("targetFund")
	private FundIdCq targetFund = null;
	
	@JsonProperty("sourceFundVersion")
	private FundVersionIdCq sourceFundVersion = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getMergeDate() {
		return mergeDate;
	}
	
	public void setMergeDate(LocalDate mergeDate) {
		this.mergeDate = mergeDate;
	}
	
	public FundIdCq getTargetFund() {
		return targetFund;
	}
	
	public void setTargetFund(FundIdCq targetFund) {
		this.targetFund = targetFund;
	}
	
	public FundVersionIdCq getSourceFundVersion() {
		return sourceFundVersion;
	}
	
	public void setSourceFundVersion(FundVersionIdCq sourceFundVersion) {
		this.sourceFundVersion = sourceFundVersion;
	}
}

