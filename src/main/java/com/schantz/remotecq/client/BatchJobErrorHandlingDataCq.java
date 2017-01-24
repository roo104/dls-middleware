package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchJobErrorHandlingDataCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("note")
	private String note = null;
	
	@JsonProperty("severity")
	private String severity = null;
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getSeverity() {
		return severity;
	}
	
	public void setSeverity(String severity) {
		this.severity = severity;
	}
}

