package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PortfolioTradeChargeFrameCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("createUser")
	private String createUser = null;
	
	@JsonProperty("createTime")
	private OffsetDateTime createTime = null;
	
	@JsonProperty("cancelled")
	private Boolean cancelled = false;
	
	@JsonProperty("tradeChargeFrameIdCq")
	private TradeChargeFrameIdCq tradeChargeFrameIdCq = null;
	
	@JsonProperty("unitLinkedOwnerIdCq")
	private UnitLinkedOwnerIdCq unitLinkedOwnerIdCq = null;
	
	@JsonProperty("tradeCommandTypeCqCollection")
	private List<String> tradeCommandTypeCqCollection = new ArrayList<String>();
	
	@JsonProperty("tradeChargeFrameVersionCqCollection")
	private List<TradeChargeFrameVersionCq> tradeChargeFrameVersionCqCollection = new ArrayList<TradeChargeFrameVersionCq>();
	
	@JsonProperty("viewAtTradeChargeFrameVersion")
	private TradeChargeFrameVersionCq viewAtTradeChargeFrameVersion = null;
	
	
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
	
	public Boolean getCancelled() {
		return cancelled;
	}
	
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	public TradeChargeFrameIdCq getTradeChargeFrameIdCq() {
		return tradeChargeFrameIdCq;
	}
	
	public void setTradeChargeFrameIdCq(TradeChargeFrameIdCq tradeChargeFrameIdCq) {
		this.tradeChargeFrameIdCq = tradeChargeFrameIdCq;
	}
	
	public UnitLinkedOwnerIdCq getUnitLinkedOwnerIdCq() {
		return unitLinkedOwnerIdCq;
	}
	
	public void setUnitLinkedOwnerIdCq(UnitLinkedOwnerIdCq unitLinkedOwnerIdCq) {
		this.unitLinkedOwnerIdCq = unitLinkedOwnerIdCq;
	}
	
	public PortfolioTradeChargeFrameCq addTradeCommandTypeCqCollectionItem(String tradeCommandTypeCqCollectionItem) {
		this.tradeCommandTypeCqCollection.add(tradeCommandTypeCqCollectionItem);
		return this;
	}
	
	public List<String> getTradeCommandTypeCqCollection() {
		return tradeCommandTypeCqCollection;
	}
	
	public void setTradeCommandTypeCqCollection(List<String> tradeCommandTypeCqCollection) {
		this.tradeCommandTypeCqCollection = tradeCommandTypeCqCollection;
	}
	
	public PortfolioTradeChargeFrameCq addTradeChargeFrameVersionCqCollectionItem(TradeChargeFrameVersionCq tradeChargeFrameVersionCqCollectionItem) {
		this.tradeChargeFrameVersionCqCollection.add(tradeChargeFrameVersionCqCollectionItem);
		return this;
	}
	
	public List<TradeChargeFrameVersionCq> getTradeChargeFrameVersionCqCollection() {
		return tradeChargeFrameVersionCqCollection;
	}
	
	public void setTradeChargeFrameVersionCqCollection(List<TradeChargeFrameVersionCq> tradeChargeFrameVersionCqCollection) {
		this.tradeChargeFrameVersionCqCollection = tradeChargeFrameVersionCqCollection;
	}
	
	public TradeChargeFrameVersionCq getViewAtTradeChargeFrameVersion() {
		return viewAtTradeChargeFrameVersion;
	}
	
	public void setViewAtTradeChargeFrameVersion(TradeChargeFrameVersionCq viewAtTradeChargeFrameVersion) {
		this.viewAtTradeChargeFrameVersion = viewAtTradeChargeFrameVersion;
	}
}

