package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantCq implements Serializable {
	@JsonProperty("currentVersionHistoryCollection")
	private List<ClaimGrantVersionInfoCq> currentVersionHistoryCollection = new ArrayList<ClaimGrantVersionInfoCq>();
	
	@JsonProperty("claimGrantIdCq")
	private ClaimGrantIdCq claimGrantIdCq = null;
	
	public ClaimGrantCq addCurrentVersionHistoryCollectionItem(ClaimGrantVersionInfoCq currentVersionHistoryCollectionItem) {
		this.currentVersionHistoryCollection.add(currentVersionHistoryCollectionItem);
		return this;
	}
	
	public List<ClaimGrantVersionInfoCq> getCurrentVersionHistoryCollection() {
		return currentVersionHistoryCollection;
	}
	
	public void setCurrentVersionHistoryCollection(List<ClaimGrantVersionInfoCq> currentVersionHistoryCollection) {
		this.currentVersionHistoryCollection = currentVersionHistoryCollection;
	}
	
	public ClaimGrantIdCq getClaimGrantIdCq() {
		return claimGrantIdCq;
	}
	
	public void setClaimGrantIdCq(ClaimGrantIdCq claimGrantIdCq) {
		this.claimGrantIdCq = claimGrantIdCq;
	}
}

