package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CopyHealthGroupCommand implements Serializable {
	@JsonProperty("healtGroupName")
	private String healtGroupName = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("copyMe")
	private HealthGroupVersionIdCq copyMe = null;
	
	
	public String getHealtGroupName() {
		return healtGroupName;
	}
	
	public void setHealtGroupName(String healtGroupName) {
		this.healtGroupName = healtGroupName;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getVersionNote() {
		return versionNote;
	}
	
	public void setVersionNote(String versionNote) {
		this.versionNote = versionNote;
	}
	
	public HealthGroupVersionIdCq getCopyMe() {
		return copyMe;
	}
	
	public void setCopyMe(HealthGroupVersionIdCq copyMe) {
		this.copyMe = copyMe;
	}
}

