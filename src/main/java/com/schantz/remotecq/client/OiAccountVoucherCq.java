package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class OiAccountVoucherCq implements Serializable {
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("valueDate")
	private LocalDate valueDate = null;
	
	@JsonProperty("isCancellation")
	private Boolean isCancellation = false;
	
	@JsonProperty("voucherIdCq")
	private VoucherIdCq voucherIdCq = null;
	
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public LocalDate getValueDate() {
		return valueDate;
	}
	
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	
	public Boolean getIsCancellation() {
		return isCancellation;
	}
	
	public void setIsCancellation(Boolean isCancellation) {
		this.isCancellation = isCancellation;
	}
	
	public VoucherIdCq getVoucherIdCq() {
		return voucherIdCq;
	}
	
	public void setVoucherIdCq(VoucherIdCq voucherIdCq) {
		this.voucherIdCq = voucherIdCq;
	}
}

