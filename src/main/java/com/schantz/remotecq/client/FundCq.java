package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class FundCq implements Serializable {
	@JsonProperty("fundId")
	private FundIdCq fundId = null;
	
	@JsonProperty("versionHistoryCollection")
	private List<FundVersionDetailsCq> versionHistoryCollection = new ArrayList<FundVersionDetailsCq>();
	
	
	public FundIdCq getFundId() {
		return fundId;
	}
	
	public void setFundId(FundIdCq fundId) {
		this.fundId = fundId;
	}
	
	public FundCq addVersionHistoryCollectionItem(FundVersionDetailsCq versionHistoryCollectionItem) {
		this.versionHistoryCollection.add(versionHistoryCollectionItem);
		return this;
	}
	
	public List<FundVersionDetailsCq> getVersionHistoryCollection() {
		return versionHistoryCollection;
	}
	
	public void setVersionHistoryCollection(List<FundVersionDetailsCq> versionHistoryCollection) {
		this.versionHistoryCollection = versionHistoryCollection;
	}
}

