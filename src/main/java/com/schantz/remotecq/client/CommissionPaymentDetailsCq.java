package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionPaymentDetailsCq implements Serializable {
	@JsonProperty("distributionPct")
	private Double distributionPct = null;
	
	@JsonProperty("ratePercentage")
	private Double ratePercentage = null;
	
	@JsonProperty("rateAmount")
	private Double rateAmount = null;
	
	@JsonProperty("sale")
	private Double sale = null;
	
	@JsonProperty("refundPct")
	private Double refundPct = null;
	
	@JsonProperty("refundExpirationDate")
	private LocalDate refundExpirationDate = null;
	
	@JsonProperty("commissionRoleTypeCq")
	private String commissionRoleTypeCq = null;
	
	@JsonProperty("commissionRateTypeCq")
	private String commissionRateTypeCq = null;
	
	@JsonProperty("commissionTypeCq")
	private String commissionTypeCq = null;
	
	@JsonProperty("isNoCommission")
	private Boolean isNoCommission = false;
	
	
	public Double getDistributionPct() {
		return distributionPct;
	}
	
	public void setDistributionPct(Double distributionPct) {
		this.distributionPct = distributionPct;
	}
	
	public Double getRatePercentage() {
		return ratePercentage;
	}
	
	public void setRatePercentage(Double ratePercentage) {
		this.ratePercentage = ratePercentage;
	}
	
	public Double getRateAmount() {
		return rateAmount;
	}
	
	public void setRateAmount(Double rateAmount) {
		this.rateAmount = rateAmount;
	}
	
	public Double getSale() {
		return sale;
	}
	
	public void setSale(Double sale) {
		this.sale = sale;
	}
	
	public Double getRefundPct() {
		return refundPct;
	}
	
	public void setRefundPct(Double refundPct) {
		this.refundPct = refundPct;
	}
	
	public LocalDate getRefundExpirationDate() {
		return refundExpirationDate;
	}
	
	public void setRefundExpirationDate(LocalDate refundExpirationDate) {
		this.refundExpirationDate = refundExpirationDate;
	}
	
	public String getCommissionRoleTypeCq() {
		return commissionRoleTypeCq;
	}
	
	public void setCommissionRoleTypeCq(String commissionRoleTypeCq) {
		this.commissionRoleTypeCq = commissionRoleTypeCq;
	}
	
	public String getCommissionRateTypeCq() {
		return commissionRateTypeCq;
	}
	
	public void setCommissionRateTypeCq(String commissionRateTypeCq) {
		this.commissionRateTypeCq = commissionRateTypeCq;
	}
	
	public String getCommissionTypeCq() {
		return commissionTypeCq;
	}
	
	public void setCommissionTypeCq(String commissionTypeCq) {
		this.commissionTypeCq = commissionTypeCq;
	}
	
	public Boolean getIsNoCommission() {
		return isNoCommission;
	}
	
	public void setIsNoCommission(Boolean isNoCommission) {
		this.isNoCommission = isNoCommission;
	}
}

