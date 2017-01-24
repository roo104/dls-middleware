package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PriceCalculationCq implements Serializable {
	@JsonProperty("orderTime")
	private OffsetDateTime orderTime = null;
	
	@JsonProperty("startTime")
	private OffsetDateTime startTime = null;
	
	@JsonProperty("doneTime")
	private OffsetDateTime doneTime = null;
	
	@JsonProperty("priceCalculationIdCq")
	private PriceCalculationIdCq priceCalculationIdCq = null;
	
	@JsonProperty("priceCalculationOrderStatusCq")
	private String priceCalculationOrderStatusCq = null;
	
	@JsonProperty("priceGroupPriceCalculationDataCqCollection")
	private List<PriceGroupPriceCalculationDataCq> priceGroupPriceCalculationDataCqCollection = new ArrayList<PriceGroupPriceCalculationDataCq>();
	
	
	public OffsetDateTime getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(OffsetDateTime orderTime) {
		this.orderTime = orderTime;
	}
	
	public OffsetDateTime getStartTime() {
		return startTime;
	}
	
	public void setStartTime(OffsetDateTime startTime) {
		this.startTime = startTime;
	}
	
	public OffsetDateTime getDoneTime() {
		return doneTime;
	}
	
	public void setDoneTime(OffsetDateTime doneTime) {
		this.doneTime = doneTime;
	}
	
	public PriceCalculationIdCq getPriceCalculationIdCq() {
		return priceCalculationIdCq;
	}
	
	public void setPriceCalculationIdCq(PriceCalculationIdCq priceCalculationIdCq) {
		this.priceCalculationIdCq = priceCalculationIdCq;
	}
	
	public String getPriceCalculationOrderStatusCq() {
		return priceCalculationOrderStatusCq;
	}
	
	public void setPriceCalculationOrderStatusCq(String priceCalculationOrderStatusCq) {
		this.priceCalculationOrderStatusCq = priceCalculationOrderStatusCq;
	}
	
	public PriceCalculationCq addPriceGroupPriceCalculationDataCqCollectionItem(PriceGroupPriceCalculationDataCq priceGroupPriceCalculationDataCqCollectionItem) {
		this.priceGroupPriceCalculationDataCqCollection.add(priceGroupPriceCalculationDataCqCollectionItem);
		return this;
	}
	
	public List<PriceGroupPriceCalculationDataCq> getPriceGroupPriceCalculationDataCqCollection() {
		return priceGroupPriceCalculationDataCqCollection;
	}
	
	public void setPriceGroupPriceCalculationDataCqCollection(List<PriceGroupPriceCalculationDataCq> priceGroupPriceCalculationDataCqCollection) {
		this.priceGroupPriceCalculationDataCqCollection = priceGroupPriceCalculationDataCqCollection;
	}
}

