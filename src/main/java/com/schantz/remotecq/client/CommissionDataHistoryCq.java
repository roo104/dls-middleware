package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionDataHistoryCq implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("endDate")
	private LocalDate endDate = null;
	
	@JsonProperty("commissionRoleTypeCq")
	private String commissionRoleTypeCq = null;
	
	@JsonProperty("commissionReceiverIdCq")
	private CommissionReceiverIdCq commissionReceiverIdCq = null;
	
	
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
	
	public String getCommissionRoleTypeCq() {
		return commissionRoleTypeCq;
	}
	
	public void setCommissionRoleTypeCq(String commissionRoleTypeCq) {
		this.commissionRoleTypeCq = commissionRoleTypeCq;
	}
	
	public CommissionReceiverIdCq getCommissionReceiverIdCq() {
		return commissionReceiverIdCq;
	}
	
	public void setCommissionReceiverIdCq(CommissionReceiverIdCq commissionReceiverIdCq) {
		this.commissionReceiverIdCq = commissionReceiverIdCq;
	}
}

