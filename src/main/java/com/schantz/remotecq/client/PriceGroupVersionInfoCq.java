package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupVersionInfoCq implements Serializable {
	@JsonProperty("cancelTime")
	private OffsetDateTime cancelTime = null;
	
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("priceGroupVersionIdCq")
	private PriceGroupVersionIdCq priceGroupVersionIdCq = null;
	
	@JsonProperty("notDoneCalculationsCollection")
	private List<PriceCalculationIdCq> notDoneCalculationsCollection = new ArrayList<PriceCalculationIdCq>();
	
	@JsonProperty("isDraft")
	private Boolean isDraft = false;
	
	
	public OffsetDateTime getCancelTime() {
		return cancelTime;
	}
	
	public void setCancelTime(OffsetDateTime cancelTime) {
		this.cancelTime = cancelTime;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public PriceGroupVersionIdCq getPriceGroupVersionIdCq() {
		return priceGroupVersionIdCq;
	}
	
	public void setPriceGroupVersionIdCq(PriceGroupVersionIdCq priceGroupVersionIdCq) {
		this.priceGroupVersionIdCq = priceGroupVersionIdCq;
	}
	
	public PriceGroupVersionInfoCq addNotDoneCalculationsCollectionItem(PriceCalculationIdCq notDoneCalculationsCollectionItem) {
		this.notDoneCalculationsCollection.add(notDoneCalculationsCollectionItem);
		return this;
	}
	
	public List<PriceCalculationIdCq> getNotDoneCalculationsCollection() {
		return notDoneCalculationsCollection;
	}
	
	public void setNotDoneCalculationsCollection(List<PriceCalculationIdCq> notDoneCalculationsCollection) {
		this.notDoneCalculationsCollection = notDoneCalculationsCollection;
	}
	
	public Boolean getIsDraft() {
		return isDraft;
	}
	
	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}
}

