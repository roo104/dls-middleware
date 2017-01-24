package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TerminatePriceGroupCommand implements Serializable {
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("versionNote")
	private String versionNote = null;
	
	@JsonProperty("priceGroupVersionIdCq")
	private PriceGroupVersionIdCq priceGroupVersionIdCq = null;
	
	
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
	
	public PriceGroupVersionIdCq getPriceGroupVersionIdCq() {
		return priceGroupVersionIdCq;
	}
	
	public void setPriceGroupVersionIdCq(PriceGroupVersionIdCq priceGroupVersionIdCq) {
		this.priceGroupVersionIdCq = priceGroupVersionIdCq;
	}
}

