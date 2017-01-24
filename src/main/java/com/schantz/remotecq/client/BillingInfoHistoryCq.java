package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class BillingInfoHistoryCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("primaryBillingMonth")
	private String primaryBillingMonth = null;
	
	@JsonProperty("periodLengthCq")
	private String periodLengthCq = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getPrimaryBillingMonth() {
		return primaryBillingMonth;
	}
	
	public void setPrimaryBillingMonth(String primaryBillingMonth) {
		this.primaryBillingMonth = primaryBillingMonth;
	}
	
	public String getPeriodLengthCq() {
		return periodLengthCq;
	}
	
	public void setPeriodLengthCq(String periodLengthCq) {
		this.periodLengthCq = periodLengthCq;
	}
}

