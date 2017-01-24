package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveStatementGroupCq implements Serializable {
	@JsonProperty("primoReserve")
	private Double primoReserve = null;
	
	@JsonProperty("ultimoReserve")
	private Double ultimoReserve = null;
	
	@JsonProperty("reservePackageItemCqCollection")
	private List<ReservePackageItemCq> reservePackageItemCqCollection = new ArrayList<ReservePackageItemCq>();
	
	@JsonProperty("reserveStatementCurPrevCqCollection")
	private List<ReserveStatementCurPrevCq> reserveStatementCurPrevCqCollection = new ArrayList<ReserveStatementCurPrevCq>();
	
	@JsonProperty("moneyOrderCq")
	private String moneyOrderCq = null;
	
	
	public Double getPrimoReserve() {
		return primoReserve;
	}
	
	public void setPrimoReserve(Double primoReserve) {
		this.primoReserve = primoReserve;
	}
	
	public Double getUltimoReserve() {
		return ultimoReserve;
	}
	
	public void setUltimoReserve(Double ultimoReserve) {
		this.ultimoReserve = ultimoReserve;
	}
	
	public ReserveStatementGroupCq addReservePackageItemCqCollectionItem(ReservePackageItemCq reservePackageItemCqCollectionItem) {
		this.reservePackageItemCqCollection.add(reservePackageItemCqCollectionItem);
		return this;
	}
	
	public List<ReservePackageItemCq> getReservePackageItemCqCollection() {
		return reservePackageItemCqCollection;
	}
	
	public void setReservePackageItemCqCollection(List<ReservePackageItemCq> reservePackageItemCqCollection) {
		this.reservePackageItemCqCollection = reservePackageItemCqCollection;
	}
	
	public ReserveStatementGroupCq addReserveStatementCurPrevCqCollectionItem(ReserveStatementCurPrevCq reserveStatementCurPrevCqCollectionItem) {
		this.reserveStatementCurPrevCqCollection.add(reserveStatementCurPrevCqCollectionItem);
		return this;
	}
	
	public List<ReserveStatementCurPrevCq> getReserveStatementCurPrevCqCollection() {
		return reserveStatementCurPrevCqCollection;
	}
	
	public void setReserveStatementCurPrevCqCollection(List<ReserveStatementCurPrevCq> reserveStatementCurPrevCqCollection) {
		this.reserveStatementCurPrevCqCollection = reserveStatementCurPrevCqCollection;
	}
	
	public String getMoneyOrderCq() {
		return moneyOrderCq;
	}
	
	public void setMoneyOrderCq(String moneyOrderCq) {
		this.moneyOrderCq = moneyOrderCq;
	}
}

