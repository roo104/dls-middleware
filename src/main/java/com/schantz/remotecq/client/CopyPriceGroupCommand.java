package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CopyPriceGroupCommand implements Serializable {
	@JsonProperty("priceGroupName")
	private String priceGroupName = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("copyMe")
	private PriceGroupVersionIdCq copyMe = null;
	
	
	public String getPriceGroupName() {
		return priceGroupName;
	}
	
	public void setPriceGroupName(String priceGroupName) {
		this.priceGroupName = priceGroupName;
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
	
	public PriceGroupVersionIdCq getCopyMe() {
		return copyMe;
	}
	
	public void setCopyMe(PriceGroupVersionIdCq copyMe) {
		this.copyMe = copyMe;
	}
}

