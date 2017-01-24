package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeYearlyStatementAgreementCommand implements Serializable {
	@JsonProperty("yearlyStatementCq")
	private YearlyStatementCq yearlyStatementCq = null;
	
	@JsonProperty("agreementIdCq")
	private AgreementIdCq agreementIdCq = null;
	
	
	public YearlyStatementCq getYearlyStatementCq() {
		return yearlyStatementCq;
	}
	
	public void setYearlyStatementCq(YearlyStatementCq yearlyStatementCq) {
		this.yearlyStatementCq = yearlyStatementCq;
	}
	
	public AgreementIdCq getAgreementIdCq() {
		return agreementIdCq;
	}
	
	public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
		this.agreementIdCq = agreementIdCq;
	}
}

