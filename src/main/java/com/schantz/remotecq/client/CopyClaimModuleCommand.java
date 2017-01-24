package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CopyClaimModuleCommand implements Serializable {
	@JsonProperty("claimModuleName")
	private String claimModuleName = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("copyMe")
	private ClaimModuleVersionIdCq copyMe = null;
	
	
	public String getClaimModuleName() {
		return claimModuleName;
	}
	
	public void setClaimModuleName(String claimModuleName) {
		this.claimModuleName = claimModuleName;
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
	
	public ClaimModuleVersionIdCq getCopyMe() {
		return copyMe;
	}
	
	public void setCopyMe(ClaimModuleVersionIdCq copyMe) {
		this.copyMe = copyMe;
	}
}

