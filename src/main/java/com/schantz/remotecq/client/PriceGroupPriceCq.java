package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PriceGroupPriceCq implements Serializable {
	@JsonProperty("priceCq")
	private PriceCq priceCq = null;
	
	@JsonProperty("priceGroupPriceIdCq")
	private PriceGroupPriceIdCq priceGroupPriceIdCq = null;
	
	@JsonProperty("priceCalculationSpecCq")
	private PriceCalculationSpecCq priceCalculationSpecCq = null;
	
	@JsonProperty("priceCalculationIdCq")
	private PriceCalculationIdCq priceCalculationIdCq = null;
	
	@JsonProperty("scopeCq")
	private ScopeCq scopeCq = null;
	
	
	public PriceCq getPriceCq() {
		return priceCq;
	}
	
	public void setPriceCq(PriceCq priceCq) {
		this.priceCq = priceCq;
	}
	
	public PriceGroupPriceIdCq getPriceGroupPriceIdCq() {
		return priceGroupPriceIdCq;
	}
	
	public void setPriceGroupPriceIdCq(PriceGroupPriceIdCq priceGroupPriceIdCq) {
		this.priceGroupPriceIdCq = priceGroupPriceIdCq;
	}
	
	public PriceCalculationSpecCq getPriceCalculationSpecCq() {
		return priceCalculationSpecCq;
	}
	
	public void setPriceCalculationSpecCq(PriceCalculationSpecCq priceCalculationSpecCq) {
		this.priceCalculationSpecCq = priceCalculationSpecCq;
	}
	
	public PriceCalculationIdCq getPriceCalculationIdCq() {
		return priceCalculationIdCq;
	}
	
	public void setPriceCalculationIdCq(PriceCalculationIdCq priceCalculationIdCq) {
		this.priceCalculationIdCq = priceCalculationIdCq;
	}
	
	public ScopeCq getScopeCq() {
		return scopeCq;
	}
	
	public void setScopeCq(ScopeCq scopeCq) {
		this.scopeCq = scopeCq;
	}
}

