package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TradeChargeFrameCq implements Serializable {
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
}

