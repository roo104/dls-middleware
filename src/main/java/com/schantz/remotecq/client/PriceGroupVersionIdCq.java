package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupVersionIdCq implements Serializable {
	@JsonProperty("priceGroupVersionUid")
	private String priceGroupVersionUid = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("draft")
	private Boolean draft = false;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("cancelled")
	private Boolean cancelled = false;
	
	@JsonProperty("priceGroupIdCq")
	private PriceGroupIdCq priceGroupIdCq = null;
	
	@JsonProperty("isTerminated")
	private Boolean isTerminated = false;
	
	@JsonProperty("isAutomaticRenewal")
	private Boolean isAutomaticRenewal = false;
	
	
	public String getPriceGroupVersionUid() {
		return priceGroupVersionUid;
	}
	
	public void setPriceGroupVersionUid(String priceGroupVersionUid) {
		this.priceGroupVersionUid = priceGroupVersionUid;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public Boolean getDraft() {
		return draft;
	}
	
	public void setDraft(Boolean draft) {
		this.draft = draft;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public Boolean getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public PriceGroupIdCq getPriceGroupIdCq() {
		return priceGroupIdCq;
	}
	
	public void setPriceGroupIdCq(PriceGroupIdCq priceGroupIdCq) {
		this.priceGroupIdCq = priceGroupIdCq;
	}
	
	public Boolean getIsTerminated() {
		return isTerminated;
	}
	
	public void setIsTerminated(Boolean isTerminated) {
		this.isTerminated = isTerminated;
	}
	
	public Boolean getIsAutomaticRenewal() {
		return isAutomaticRenewal;
	}
	
	public void setIsAutomaticRenewal(Boolean isAutomaticRenewal) {
		this.isAutomaticRenewal = isAutomaticRenewal;
	}
}

