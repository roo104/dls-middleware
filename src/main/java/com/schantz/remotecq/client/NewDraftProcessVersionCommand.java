package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class NewDraftProcessVersionCommand implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("cloneSource")
	private ProcessVersionIdCq cloneSource = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ProcessVersionIdCq getCloneSource() {
		return cloneSource;
	}
	
	public void setCloneSource(ProcessVersionIdCq cloneSource) {
		this.cloneSource = cloneSource;
	}
}

