package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupPriceCalculationDataCq implements Serializable {
	@JsonProperty("priceGroupPriceMetaDataCq")
	private PriceGroupPriceMetaDataCq priceGroupPriceMetaDataCq = null;
	
	@JsonProperty("priceCalculationIdCq")
	private PriceCalculationIdCq priceCalculationIdCq = null;
	
	@JsonProperty("priceGroupPriceIdCq")
	private PriceGroupPriceIdCq priceGroupPriceIdCq = null;
	
	
	public PriceGroupPriceMetaDataCq getPriceGroupPriceMetaDataCq() {
		return priceGroupPriceMetaDataCq;
	}
	
	public void setPriceGroupPriceMetaDataCq(PriceGroupPriceMetaDataCq priceGroupPriceMetaDataCq) {
		this.priceGroupPriceMetaDataCq = priceGroupPriceMetaDataCq;
	}
	
	public PriceCalculationIdCq getPriceCalculationIdCq() {
		return priceCalculationIdCq;
	}
	
	public void setPriceCalculationIdCq(PriceCalculationIdCq priceCalculationIdCq) {
		this.priceCalculationIdCq = priceCalculationIdCq;
	}
	
	public PriceGroupPriceIdCq getPriceGroupPriceIdCq() {
		return priceGroupPriceIdCq;
	}
	
	public void setPriceGroupPriceIdCq(PriceGroupPriceIdCq priceGroupPriceIdCq) {
		this.priceGroupPriceIdCq = priceGroupPriceIdCq;
	}
}

