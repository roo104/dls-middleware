package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class HealthEvaluationPolicyDataCq implements Serializable {
	@JsonProperty("triggerDate")
	private LocalDate triggerDate = null;
	
	@JsonProperty("amountThatTriggered")
	private Double amountThatTriggered = null;
	
	@JsonProperty("triggerAmount")
	private Double triggerAmount = null;
	
	@JsonProperty("waitingPeriodNoOfPeriods")
	private Long waitingPeriodNoOfPeriods = null;
	
	@JsonProperty("waitingPeriodEndDate")
	private LocalDate waitingPeriodEndDate = null;
	
	@JsonProperty("periodLengthCq")
	private String periodLengthCq = null;
	
	@JsonProperty("healthFormIdCq")
	private HealthFormIdCq healthFormIdCq = null;
	
	
	public LocalDate getTriggerDate() {
		return triggerDate;
	}
	
	public void setTriggerDate(LocalDate triggerDate) {
		this.triggerDate = triggerDate;
	}
	
	public Double getAmountThatTriggered() {
		return amountThatTriggered;
	}
	
	public void setAmountThatTriggered(Double amountThatTriggered) {
		this.amountThatTriggered = amountThatTriggered;
	}
	
	public Double getTriggerAmount() {
		return triggerAmount;
	}
	
	public void setTriggerAmount(Double triggerAmount) {
		this.triggerAmount = triggerAmount;
	}
	
	public Long getWaitingPeriodNoOfPeriods() {
		return waitingPeriodNoOfPeriods;
	}
	
	public void setWaitingPeriodNoOfPeriods(Long waitingPeriodNoOfPeriods) {
		this.waitingPeriodNoOfPeriods = waitingPeriodNoOfPeriods;
	}
	
	public LocalDate getWaitingPeriodEndDate() {
		return waitingPeriodEndDate;
	}
	
	public void setWaitingPeriodEndDate(LocalDate waitingPeriodEndDate) {
		this.waitingPeriodEndDate = waitingPeriodEndDate;
	}
	
	public String getPeriodLengthCq() {
		return periodLengthCq;
	}
	
	public void setPeriodLengthCq(String periodLengthCq) {
		this.periodLengthCq = periodLengthCq;
	}
	
	public HealthFormIdCq getHealthFormIdCq() {
		return healthFormIdCq;
	}
	
	public void setHealthFormIdCq(HealthFormIdCq healthFormIdCq) {
		this.healthFormIdCq = healthFormIdCq;
	}
}

