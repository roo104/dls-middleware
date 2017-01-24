package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveStatementCurPrevCq implements Serializable {
	@JsonProperty("id")
	private CqMessageKey id = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("reservePackageItemCqCollection")
	private List<ReservePackageItemCq> reservePackageItemCqCollection = new ArrayList<ReservePackageItemCq>();
	
	
	public CqMessageKey getId() {
		return id;
	}
	
	public void setId(CqMessageKey id) {
		this.id = id;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public ReserveStatementCurPrevCq addReservePackageItemCqCollectionItem(ReservePackageItemCq reservePackageItemCqCollectionItem) {
		this.reservePackageItemCqCollection.add(reservePackageItemCqCollectionItem);
		return this;
	}
	
	public List<ReservePackageItemCq> getReservePackageItemCqCollection() {
		return reservePackageItemCqCollection;
	}
	
	public void setReservePackageItemCqCollection(List<ReservePackageItemCq> reservePackageItemCqCollection) {
		this.reservePackageItemCqCollection = reservePackageItemCqCollection;
	}
}

