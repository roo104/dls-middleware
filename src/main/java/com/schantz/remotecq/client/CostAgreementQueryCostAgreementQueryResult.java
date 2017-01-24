package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class CostAgreementQueryCostAgreementQueryResult implements Serializable {
	@JsonProperty("viewAtDate")
	private LocalDate viewAtDate = null;
	
	@JsonProperty("agreementVersionIdCq")
	private AgreementVersionIdCq agreementVersionIdCq = null;
	
	@JsonProperty("moneyOrderCq")
	private String moneyOrderCq = null;
	
	
	public LocalDate getViewAtDate() {
		return viewAtDate;
	}
	
	public void setViewAtDate(LocalDate viewAtDate) {
		this.viewAtDate = viewAtDate;
	}
	
	public AgreementVersionIdCq getAgreementVersionIdCq() {
		return agreementVersionIdCq;
	}
	
	public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
		this.agreementVersionIdCq = agreementVersionIdCq;
	}
	
	public String getMoneyOrderCq() {
		return moneyOrderCq;
	}
	
	public void setMoneyOrderCq(String moneyOrderCq) {
		this.moneyOrderCq = moneyOrderCq;
	}
}

