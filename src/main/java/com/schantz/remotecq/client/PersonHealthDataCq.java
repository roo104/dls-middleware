package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PersonHealthDataCq implements Serializable {
	@JsonProperty("eventDate")
	private LocalDate eventDate = null;
	
	@JsonProperty("registrationDate")
	private LocalDate registrationDate = null;
	
	@JsonProperty("mortalityLevel")
	private Long mortalityLevel = null;
	
	@JsonProperty("morbidityLevel")
	private Long morbidityLevel = null;
	
	@JsonProperty("waitingPeriodNoOfPeriods")
	private Long waitingPeriodNoOfPeriods = null;
	
	@JsonProperty("healthFormIdCq")
	private HealthFormIdCq healthFormIdCq = null;
	
	@JsonProperty("waitingPeriodLength")
	private String waitingPeriodLength = null;
	
	@JsonProperty("healthRegistrationId")
	private HealthRegistrationIdCq healthRegistrationId = null;
	
	@JsonProperty("isAccepted")
	private Boolean isAccepted = false;
	
	@JsonProperty("isDraft")
	private Boolean isDraft = false;
	
	@JsonProperty("isReceived")
	private Boolean isReceived = false;
	
	
	public LocalDate getEventDate() {
		return eventDate;
	}
	
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public Long getMortalityLevel() {
		return mortalityLevel;
	}
	
	public void setMortalityLevel(Long mortalityLevel) {
		this.mortalityLevel = mortalityLevel;
	}
	
	public Long getMorbidityLevel() {
		return morbidityLevel;
	}
	
	public void setMorbidityLevel(Long morbidityLevel) {
		this.morbidityLevel = morbidityLevel;
	}
	
	public Long getWaitingPeriodNoOfPeriods() {
		return waitingPeriodNoOfPeriods;
	}
	
	public void setWaitingPeriodNoOfPeriods(Long waitingPeriodNoOfPeriods) {
		this.waitingPeriodNoOfPeriods = waitingPeriodNoOfPeriods;
	}
	
	public HealthFormIdCq getHealthFormIdCq() {
		return healthFormIdCq;
	}
	
	public void setHealthFormIdCq(HealthFormIdCq healthFormIdCq) {
		this.healthFormIdCq = healthFormIdCq;
	}
	
	public String getWaitingPeriodLength() {
		return waitingPeriodLength;
	}
	
	public void setWaitingPeriodLength(String waitingPeriodLength) {
		this.waitingPeriodLength = waitingPeriodLength;
	}
	
	public HealthRegistrationIdCq getHealthRegistrationId() {
		return healthRegistrationId;
	}
	
	public void setHealthRegistrationId(HealthRegistrationIdCq healthRegistrationId) {
		this.healthRegistrationId = healthRegistrationId;
	}
	
	public Boolean getIsAccepted() {
		return isAccepted;
	}
	
	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	
	public Boolean getIsDraft() {
		return isDraft;
	}
	
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
	
	public Boolean getIsReceived() {
		return isReceived;
	}
	
	public void setIsReceived(Boolean isReceived) {
		this.isReceived = isReceived;
	}
}

