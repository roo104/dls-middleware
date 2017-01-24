package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class PriceAgreementQueryPriceAgreementQueryResult implements Serializable {
	@JsonProperty("agreementVersionId")
	private AgreementVersionIdCq agreementVersionId = null;
	
	@JsonProperty("viewAt")
	private LocalDate viewAt = null;
	
	@JsonProperty("priceAgreementFilterCq")
	private PriceAgreementFilterCq priceAgreementFilterCq = null;
	
	
	public AgreementVersionIdCq getAgreementVersionId() {
		return agreementVersionId;
	}
	
	public void setAgreementVersionId(AgreementVersionIdCq agreementVersionId) {
		this.agreementVersionId = agreementVersionId;
	}
	
	public LocalDate getViewAt() {
		return viewAt;
	}
	
	public void setViewAt(LocalDate viewAt) {
		this.viewAt = viewAt;
	}
	
	public PriceAgreementFilterCq getPriceAgreementFilterCq() {
		return priceAgreementFilterCq;
	}
	
	public void setPriceAgreementFilterCq(PriceAgreementFilterCq priceAgreementFilterCq) {
		this.priceAgreementFilterCq = priceAgreementFilterCq;
	}
}

