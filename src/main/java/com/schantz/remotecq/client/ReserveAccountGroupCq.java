package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveAccountGroupCq implements Serializable {
	@JsonProperty("reserveAccountEntryCqCollection")
	private List<ReserveAccountEntryCq> reserveAccountEntryCqCollection = new ArrayList<ReserveAccountEntryCq>();
	
	@JsonProperty("packageId")
	private PolicyPackageIdCq packageId = null;
	
	public ReserveAccountGroupCq addReserveAccountEntryCqCollectionItem(ReserveAccountEntryCq reserveAccountEntryCqCollectionItem) {
		this.reserveAccountEntryCqCollection.add(reserveAccountEntryCqCollectionItem);
		return this;
	}
	
	public List<ReserveAccountEntryCq> getReserveAccountEntryCqCollection() {
		return reserveAccountEntryCqCollection;
	}
	
	public void setReserveAccountEntryCqCollection(List<ReserveAccountEntryCq> reserveAccountEntryCqCollection) {
		this.reserveAccountEntryCqCollection = reserveAccountEntryCqCollection;
	}
	
	public PolicyPackageIdCq getPackageId() {
		return packageId;
	}
	
	public void setPackageId(PolicyPackageIdCq packageId) {
		this.packageId = packageId;
	}
}

