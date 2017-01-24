package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TerminateHealthGroupCommand implements Serializable {
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("healthGroupVersionIdCq")
	private HealthGroupVersionIdCq healthGroupVersionIdCq = null;
	
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getVersionNote() {
		return versionNote;
	}
	
	public void setVersionNote(String versionNote) {
		this.versionNote = versionNote;
	}
	
	public HealthGroupVersionIdCq getHealthGroupVersionIdCq() {
		return healthGroupVersionIdCq;
	}
	
	public void setHealthGroupVersionIdCq(HealthGroupVersionIdCq healthGroupVersionIdCq) {
		this.healthGroupVersionIdCq = healthGroupVersionIdCq;
	}
}

