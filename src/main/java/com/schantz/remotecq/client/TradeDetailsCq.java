package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class TradeDetailsCq implements Serializable {
	@JsonProperty("tradeUid")
	private String tradeUid = null;
	
	@JsonProperty("fixedCharge")
	private Double fixedCharge = null;
	
	@JsonProperty("pctCharge")
	private Double pctCharge = null;
	
	@JsonProperty("tradeTransactionDataCqCollection")
	private List<TradeTransactionDataCq> tradeTransactionDataCqCollection = new ArrayList<TradeTransactionDataCq>();
	
	@JsonProperty("tradeInputDataCqCollection")
	private List<TradeInputDataCq> tradeInputDataCqCollection = new ArrayList<TradeInputDataCq>();
	
	@JsonProperty("tradeStatusCq")
	private String tradeStatusCq = null;
	
	
	public String getTradeUid() {
		return tradeUid;
	}
	
	public void setTradeUid(String tradeUid) {
		this.tradeUid = tradeUid;
	}
	
	public Double getFixedCharge() {
		return fixedCharge;
	}
	
	public void setFixedCharge(Double fixedCharge) {
		this.fixedCharge = fixedCharge;
	}
	
	public Double getPctCharge() {
		return pctCharge;
	}
	
	public void setPctCharge(Double pctCharge) {
		this.pctCharge = pctCharge;
	}
	
	public TradeDetailsCq addTradeTransactionDataCqCollectionItem(TradeTransactionDataCq tradeTransactionDataCqCollectionItem) {
		this.tradeTransactionDataCqCollection.add(tradeTransactionDataCqCollectionItem);
		return this;
	}
	
	public List<TradeTransactionDataCq> getTradeTransactionDataCqCollection() {
		return tradeTransactionDataCqCollection;
	}
	
	public void setTradeTransactionDataCqCollection(List<TradeTransactionDataCq> tradeTransactionDataCqCollection) {
		this.tradeTransactionDataCqCollection = tradeTransactionDataCqCollection;
	}
	
	public TradeDetailsCq addTradeInputDataCqCollectionItem(TradeInputDataCq tradeInputDataCqCollectionItem) {
		this.tradeInputDataCqCollection.add(tradeInputDataCqCollectionItem);
		return this;
	}
	
	public List<TradeInputDataCq> getTradeInputDataCqCollection() {
		return tradeInputDataCqCollection;
	}
	
	public void setTradeInputDataCqCollection(List<TradeInputDataCq> tradeInputDataCqCollection) {
		this.tradeInputDataCqCollection = tradeInputDataCqCollection;
	}
	
	public String getTradeStatusCq() {
		return tradeStatusCq;
	}
	
	public void setTradeStatusCq(String tradeStatusCq) {
		this.tradeStatusCq = tradeStatusCq;
	}
}

