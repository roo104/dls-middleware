package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveStatementCq implements Serializable {
	@JsonProperty("fromTransactionDate")
	private OffsetDateTime fromTransactionDate = null;
	
	@JsonProperty("toTransactionDate")
	private OffsetDateTime toTransactionDate = null;
	
	@JsonProperty("fromValueDate")
	private LocalDate fromValueDate = null;
	
	@JsonProperty("toValueDate")
	private LocalDate toValueDate = null;
	
	@JsonProperty("liablePal")
	private Double liablePal = null;
	
	@JsonProperty("yearlyCostAmount")
	private Double yearlyCostAmount = null;
	
	@JsonProperty("yearlyCostPct")
	private Double yearlyCostPct = null;
	
	@JsonProperty("reserveStatementGroupCqCollection")
	private List<ReserveStatementGroupCq> reserveStatementGroupCqCollection = new ArrayList<ReserveStatementGroupCq>();
	
	@JsonProperty("isUpdateSpecialCost")
	private Boolean isUpdateSpecialCost = false;
	
	
	public OffsetDateTime getFromTransactionDate() {
		return fromTransactionDate;
	}
	
	public void setFromTransactionDate(OffsetDateTime fromTransactionDate) {
		this.fromTransactionDate = fromTransactionDate;
	}
	
	public OffsetDateTime getToTransactionDate() {
		return toTransactionDate;
	}
	
	public void setToTransactionDate(OffsetDateTime toTransactionDate) {
		this.toTransactionDate = toTransactionDate;
	}
	
	public LocalDate getFromValueDate() {
		return fromValueDate;
	}
	
	public void setFromValueDate(LocalDate fromValueDate) {
		this.fromValueDate = fromValueDate;
	}
	
	public LocalDate getToValueDate() {
		return toValueDate;
	}
	
	public void setToValueDate(LocalDate toValueDate) {
		this.toValueDate = toValueDate;
	}
	
	public Double getLiablePal() {
		return liablePal;
	}
	
	public void setLiablePal(Double liablePal) {
		this.liablePal = liablePal;
	}
	
	public Double getYearlyCostAmount() {
		return yearlyCostAmount;
	}
	
	public void setYearlyCostAmount(Double yearlyCostAmount) {
		this.yearlyCostAmount = yearlyCostAmount;
	}
	
	public Double getYearlyCostPct() {
		return yearlyCostPct;
	}
	
	public void setYearlyCostPct(Double yearlyCostPct) {
		this.yearlyCostPct = yearlyCostPct;
	}
	
	public ReserveStatementCq addReserveStatementGroupCqCollectionItem(ReserveStatementGroupCq reserveStatementGroupCqCollectionItem) {
		this.reserveStatementGroupCqCollection.add(reserveStatementGroupCqCollectionItem);
		return this;
	}
	
	public List<ReserveStatementGroupCq> getReserveStatementGroupCqCollection() {
		return reserveStatementGroupCqCollection;
	}
	
	public void setReserveStatementGroupCqCollection(List<ReserveStatementGroupCq> reserveStatementGroupCqCollection) {
		this.reserveStatementGroupCqCollection = reserveStatementGroupCqCollection;
	}
	
	public Boolean getIsUpdateSpecialCost() {
		return isUpdateSpecialCost;
	}
	
	public void setIsUpdateSpecialCost(Boolean isUpdateSpecialCost) {
		this.isUpdateSpecialCost = isUpdateSpecialCost;
	}
}

