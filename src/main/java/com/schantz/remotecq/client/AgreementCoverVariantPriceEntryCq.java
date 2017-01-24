package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementCoverVariantPriceEntryCq implements Serializable {
	@JsonProperty("stepGrossPrice")
	private Double stepGrossPrice = null;
	
	@JsonProperty("stepNetPrice")
	private Double stepNetPrice = null;
	
	@JsonProperty("stepDiscount")
	private Double stepDiscount = null;
	
	@JsonProperty("pricePrivilgeCqCollection")
	private List<PricePrivilgeCq> pricePrivilgeCqCollection = new ArrayList<PricePrivilgeCq>();
	
	@JsonProperty("priceGroupVersionIdCq")
	private PriceGroupVersionIdCq priceGroupVersionIdCq = null;
	
	@JsonProperty("amountFrameStepCq")
	private AmountFrameStepCq amountFrameStepCq = null;
	
	@JsonProperty("priceGroupPriceCq")
	private PriceGroupPriceCq priceGroupPriceCq = null;
	
	
	public Double getStepGrossPrice() {
		return stepGrossPrice;
	}
	
	public void setStepGrossPrice(Double stepGrossPrice) {
		this.stepGrossPrice = stepGrossPrice;
	}
	
	public Double getStepNetPrice() {
		return stepNetPrice;
	}
	
	public void setStepNetPrice(Double stepNetPrice) {
		this.stepNetPrice = stepNetPrice;
	}
	
	public Double getStepDiscount() {
		return stepDiscount;
	}
	
	public void setStepDiscount(Double stepDiscount) {
		this.stepDiscount = stepDiscount;
	}
	
	public AgreementCoverVariantPriceEntryCq addPricePrivilgeCqCollectionItem(PricePrivilgeCq pricePrivilgeCqCollectionItem) {
		this.pricePrivilgeCqCollection.add(pricePrivilgeCqCollectionItem);
		return this;
	}
	
	public List<PricePrivilgeCq> getPricePrivilgeCqCollection() {
		return pricePrivilgeCqCollection;
	}
	
	public void setPricePrivilgeCqCollection(List<PricePrivilgeCq> pricePrivilgeCqCollection) {
		this.pricePrivilgeCqCollection = pricePrivilgeCqCollection;
	}
	
	public PriceGroupVersionIdCq getPriceGroupVersionIdCq() {
		return priceGroupVersionIdCq;
	}
	
	public void setPriceGroupVersionIdCq(PriceGroupVersionIdCq priceGroupVersionIdCq) {
		this.priceGroupVersionIdCq = priceGroupVersionIdCq;
	}
	
	public AmountFrameStepCq getAmountFrameStepCq() {
		return amountFrameStepCq;
	}
	
	public void setAmountFrameStepCq(AmountFrameStepCq amountFrameStepCq) {
		this.amountFrameStepCq = amountFrameStepCq;
	}
	
	public PriceGroupPriceCq getPriceGroupPriceCq() {
		return priceGroupPriceCq;
	}
	
	public void setPriceGroupPriceCq(PriceGroupPriceCq priceGroupPriceCq) {
		this.priceGroupPriceCq = priceGroupPriceCq;
	}
}

