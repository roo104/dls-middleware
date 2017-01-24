package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class PriceCalculationSpecCq implements Serializable {
	@JsonProperty("benefitSize")
	private Double benefitSize = null;
	
	@JsonProperty("priceCalculationTypeCq")
	private String priceCalculationTypeCq = null;
	
	@JsonProperty("priceCalculationDataBaseSpecCq")
	private PriceCalculationDataBaseSpecCq priceCalculationDataBaseSpecCq = null;
	
	@JsonProperty("priceCalculationDataBaseTypeCq")
	private String priceCalculationDataBaseTypeCq = null;
	
	@JsonProperty("assetTypeCq")
	private String assetTypeCq = null;
	
	@JsonProperty("dataFilterCq")
	private DataFilterCq dataFilterCq = null;
	
	
	public Double getBenefitSize() {
		return benefitSize;
	}
	
	public void setBenefitSize(Double benefitSize) {
		this.benefitSize = benefitSize;
	}
	
	public String getPriceCalculationTypeCq() {
		return priceCalculationTypeCq;
	}
	
	public void setPriceCalculationTypeCq(String priceCalculationTypeCq) {
		this.priceCalculationTypeCq = priceCalculationTypeCq;
	}
	
	public PriceCalculationDataBaseSpecCq getPriceCalculationDataBaseSpecCq() {
		return priceCalculationDataBaseSpecCq;
	}
	
	public void setPriceCalculationDataBaseSpecCq(PriceCalculationDataBaseSpecCq priceCalculationDataBaseSpecCq) {
		this.priceCalculationDataBaseSpecCq = priceCalculationDataBaseSpecCq;
	}
	
	public String getPriceCalculationDataBaseTypeCq() {
		return priceCalculationDataBaseTypeCq;
	}
	
	public void setPriceCalculationDataBaseTypeCq(String priceCalculationDataBaseTypeCq) {
		this.priceCalculationDataBaseTypeCq = priceCalculationDataBaseTypeCq;
	}
	
	public String getAssetTypeCq() {
		return assetTypeCq;
	}
	
	public void setAssetTypeCq(String assetTypeCq) {
		this.assetTypeCq = assetTypeCq;
	}
	
	public DataFilterCq getDataFilterCq() {
		return dataFilterCq;
	}
	
	public void setDataFilterCq(DataFilterCq dataFilterCq) {
		this.dataFilterCq = dataFilterCq;
	}
}

