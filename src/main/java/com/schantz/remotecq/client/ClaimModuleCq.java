package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimModuleCq implements Serializable {
	@JsonProperty("claimModuleName")
	private String claimModuleName = null;
	
	@JsonProperty("claimModuleIdCq")
	private ClaimModuleIdCq claimModuleIdCq = null;
	
	@JsonProperty("currentVersionHistoryCollection")
	private List<ClaimModuleVersionInfoCq> currentVersionHistoryCollection = new ArrayList<ClaimModuleVersionInfoCq>();
	
	@JsonProperty("claimModuleTypeCq")
	private String claimModuleTypeCq = null;
	
	@JsonProperty("lockedToCollection")
	private List<AgreementIdCq> lockedToCollection = new ArrayList<AgreementIdCq>();
	
	
	public String getClaimModuleName() {
		return claimModuleName;
	}
	
	public void setClaimModuleName(String claimModuleName) {
		this.claimModuleName = claimModuleName;
	}
	
	public ClaimModuleIdCq getClaimModuleIdCq() {
		return claimModuleIdCq;
	}
	
	public void setClaimModuleIdCq(ClaimModuleIdCq claimModuleIdCq) {
		this.claimModuleIdCq = claimModuleIdCq;
	}
	
	public ClaimModuleCq addCurrentVersionHistoryCollectionItem(ClaimModuleVersionInfoCq currentVersionHistoryCollectionItem) {
		this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
		return this;
	}
	
	public List<ClaimModuleVersionInfoCq> getCurrentVersionHistoryCollection() {
		return currentVersionHistoryCollection;
	}
	
	public void setCurrentVersionHistoryCollection(List<ClaimModuleVersionInfoCq> currentVersionHistoryCollection) {
		this.currentVersionHistoryCollection = currentVersionHistoryCollection;
	}
	
	public String getClaimModuleTypeCq() {
		return claimModuleTypeCq;
	}
	
	public void setClaimModuleTypeCq(String claimModuleTypeCq) {
		this.claimModuleTypeCq = claimModuleTypeCq;
	}
	
	public ClaimModuleCq addLockedToCollectionItem(AgreementIdCq lockedToCollectionItem) {
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

