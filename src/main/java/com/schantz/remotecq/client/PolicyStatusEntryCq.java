package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PolicyStatusEntryCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("noOfMonths")
	private Long noOfMonths = null;
	
	@JsonProperty("lifePolicyStatusCq")
	private String lifePolicyStatusCq = null;
	
	
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
	
	public Long getNoOfMonths() {
		return noOfMonths;
	}
	
	public void setNoOfMonths(Long noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	
	public String getLifePolicyStatusCq() {
		return lifePolicyStatusCq;
	}
	
	public void setLifePolicyStatusCq(String lifePolicyStatusCq) {
		this.lifePolicyStatusCq = lifePolicyStatusCq;
	}
}

