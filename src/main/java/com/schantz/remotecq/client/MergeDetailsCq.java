package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class MergeDetailsCq implements Serializable {
	@JsonProperty("mergeCq")
	private MergeCq mergeCq = null;
	
	@JsonProperty("sourceFundVersion")
	private FundVersionDetailsCq sourceFundVersion = null;
	
	@JsonProperty("tradeCommandDataCollection")
	private List<TradeBundleDataCq> tradeCommandDataCollection = new ArrayList<TradeBundleDataCq>();
	
	@JsonProperty("tradeFundDetailCollection")
	private List<TradeBundleFundDetailsCq> tradeFundDetailCollection = new ArrayList<TradeBundleFundDetailsCq>();
	
	
	public MergeCq getMergeCq() {
		return mergeCq;
	}
	
	public void setMergeCq(MergeCq mergeCq) {
		this.mergeCq = mergeCq;
	}
	
	public FundVersionDetailsCq getSourceFundVersion() {
		return sourceFundVersion;
	}
	
	public void setSourceFundVersion(FundVersionDetailsCq sourceFundVersion) {
		this.sourceFundVersion = sourceFundVersion;
	}
	
	public MergeDetailsCq addTradeCommandDataCollectionItem(TradeBundleDataCq tradeCommandDataCollectionItem) {
		this.tradeCommandDataCollection.add(tradeCommandDataCollectionItem);
		return this;
	}
	
	public List<TradeBundleDataCq> getTradeCommandDataCollection() {
		return tradeCommandDataCollection;
	}
	
	public void setTradeCommandDataCollection(List<TradeBundleDataCq> tradeCommandDataCollection) {
		this.tradeCommandDataCollection = tradeCommandDataCollection;
	}
	
	public MergeDetailsCq addTradeFundDetailCollectionItem(TradeBundleFundDetailsCq tradeFundDetailCollectionItem) {
		this.tradeFundDetailCollection.add(tradeFundDetailCollectionItem);
		return this;
	}
	
	public List<TradeBundleFundDetailsCq> getTradeFundDetailCollection() {
		return tradeFundDetailCollection;
	}
	
	public void setTradeFundDetailCollection(List<TradeBundleFundDetailsCq> tradeFundDetailCollection) {
		this.tradeFundDetailCollection = tradeFundDetailCollection;
	}
}

