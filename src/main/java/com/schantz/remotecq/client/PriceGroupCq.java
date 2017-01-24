package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupCq implements Serializable {
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("priceGroupIdCq")
	private PriceGroupIdCq priceGroupIdCq = null;
	
	@JsonProperty("currentVersionHistoryCollection")
	private List<PriceGroupVersionInfoCq> currentVersionHistoryCollection = new ArrayList<PriceGroupVersionInfoCq>();
	
	@JsonProperty("lockedToCollection")
	private List<AgreementIdCq> lockedToCollection = new ArrayList<AgreementIdCq>();
	
	
	public OffsetDateTime getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(OffsetDateTime createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public PriceGroupIdCq getPriceGroupIdCq() {
		return priceGroupIdCq;
	}
	
	public void setPriceGroupIdCq(PriceGroupIdCq priceGroupIdCq) {
		this.priceGroupIdCq = priceGroupIdCq;
	}
	
	public PriceGroupCq addCurrentVersionHistoryCollectionItem(PriceGroupVersionInfoCq currentVersionHistoryCollectionItem) {
		this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
		return this;
	}
	
	public List<PriceGroupVersionInfoCq> getCurrentVersionHistoryCollection() {
		return currentVersionHistoryCollection;
	}
	
	public void setCurrentVersionHistoryCollection(List<PriceGroupVersionInfoCq> currentVersionHistoryCollection) {
		this.currentVersionHistoryCollection = currentVersionHistoryCollection;
	}
	
	public PriceGroupCq addLockedToCollectionItem(AgreementIdCq lockedToCollectionItem) {
		this.lockedToCollection.add(lockedToCollectionItem);
		return this;
	}
	
	public List<AgreementIdCq> getLockedToCollection() {
		return lockedToCollection;
	}
	
	public void setLockedToCollection(List<AgreementIdCq> lockedToCollection) {
		this.lockedToCollection = lockedToCollection;
	}
}

