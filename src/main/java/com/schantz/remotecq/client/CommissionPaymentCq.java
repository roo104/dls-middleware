package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionPaymentCq implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("externalReference")
	private String externalReference = null;
	
	@JsonProperty("eventDate")
	private LocalDate eventDate = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("commissionPaymentidCq")
	private CommissionPaymentidCq commissionPaymentidCq = null;
	
	@JsonProperty("commissionPaymentDetailsCq")
	private CommissionPaymentDetailsCq commissionPaymentDetailsCq = null;
	
	@JsonProperty("compensationOf")
	private CommissionPaymentidCq compensationOf = null;
	
	@JsonProperty("cancelles")
	private CommissionPaymentidCq cancelles = null;
	
	@JsonProperty("refundOf")
	private CommissionPaymentidCq refundOf = null;
	
	@JsonProperty("commissionReceiverIdCq")
	private CommissionReceiverIdCq commissionReceiverIdCq = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("isHandledExternal")
	private Boolean isHandledExternal = false;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getExternalReference() {
		return externalReference;
	}
	
	public void setExternalReference(String externalReference) {
		this.externalReference = externalReference;
	}
	
	public LocalDate getEventDate() {
		return eventDate;
	}
	
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public CommissionPaymentidCq getCommissionPaymentidCq() {
		return commissionPaymentidCq;
	}
	
	public void setCommissionPaymentidCq(CommissionPaymentidCq commissionPaymentidCq) {
		this.commissionPaymentidCq = commissionPaymentidCq;
	}
	
	public CommissionPaymentDetailsCq getCommissionPaymentDetailsCq() {
		return commissionPaymentDetailsCq;
	}
	
	public void setCommissionPaymentDetailsCq(CommissionPaymentDetailsCq commissionPaymentDetailsCq) {
		this.commissionPaymentDetailsCq = commissionPaymentDetailsCq;
	}
	
	public CommissionPaymentidCq getCompensationOf() {
		return compensationOf;
	}
	
	public void setCompensationOf(CommissionPaymentidCq compensationOf) {
		this.compensationOf = compensationOf;
	}
	
	public CommissionPaymentidCq getCancelles() {
		return cancelles;
	}
	
	public void setCancelles(CommissionPaymentidCq cancelles) {
		this.cancelles = cancelles;
	}
	
	public CommissionPaymentidCq getRefundOf() {
		return refundOf;
	}
	
	public void setRefundOf(CommissionPaymentidCq refundOf) {
		this.refundOf = refundOf;
	}
	
	public CommissionReceiverIdCq getCommissionReceiverIdCq() {
		return commissionReceiverIdCq;
	}
	
	public void setCommissionReceiverIdCq(CommissionReceiverIdCq commissionReceiverIdCq) {
		this.commissionReceiverIdCq = commissionReceiverIdCq;
	}
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
	}
	
	public Boolean getIsHandledExternal() {
		return isHandledExternal;
	}
	
	public void setIsHandledExternal(Boolean isHandledExternal) {
		this.isHandledExternal = isHandledExternal;
	}
}

