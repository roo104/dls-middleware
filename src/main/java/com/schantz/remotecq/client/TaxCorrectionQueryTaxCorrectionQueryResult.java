package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class TaxCorrectionQueryTaxCorrectionQueryResult implements Serializable {
	@JsonProperty("legalPartyId")
	private LegalPartyIdCq legalPartyId = null;
	
	@JsonProperty("oiAccountTypeCq")
	private String oiAccountTypeCq = null;
	
	@JsonProperty("taxCorrectionMonthlyCollection")
	private List<TaxCorrectionMonthly> taxCorrectionMonthlyCollection = new ArrayList<TaxCorrectionMonthly>();
	
	
	public LegalPartyIdCq getLegalPartyId() {
		return legalPartyId;
	}
	
	public void setLegalPartyId(LegalPartyIdCq legalPartyId) {
		this.legalPartyId = legalPartyId;
	}
	
	public String getOiAccountTypeCq() {
		return oiAccountTypeCq;
	}
	
	public void setOiAccountTypeCq(String oiAccountTypeCq) {
		this.oiAccountTypeCq = oiAccountTypeCq;
	}
	
	public TaxCorrectionQueryTaxCorrectionQueryResult addTaxCorrectionMonthlyCollectionItem(TaxCorrectionMonthly taxCorrectionMonthlyCollectionItem) {
		this.taxCorrectionMonthlyCollection.add(taxCorrectionMonthlyCollectionItem);
		return this;
	}
	
	public List<TaxCorrectionMonthly> getTaxCorrectionMonthlyCollection() {
		return taxCorrectionMonthlyCollection;
	}
	
	public void setTaxCorrectionMonthlyCollection(List<TaxCorrectionMonthly> taxCorrectionMonthlyCollection) {
		this.taxCorrectionMonthlyCollection = taxCorrectionMonthlyCollection;
	}
}

