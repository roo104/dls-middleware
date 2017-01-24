package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class PortfolioRuleFrameCq implements Serializable {
	@JsonProperty("portfolioRuleFrameVersionCqCollection")
	private List<PortfolioRuleFrameVersionCq> portfolioRuleFrameVersionCqCollection = new ArrayList<PortfolioRuleFrameVersionCq>();
	
	@JsonProperty("portfolioRuleFrameInfoCq")
	private PortfolioRuleFrameInfoCq portfolioRuleFrameInfoCq = null;
	
	@JsonProperty("tradeChargeFrameCqCollection")
	private List<TradeChargeFrameCq> tradeChargeFrameCqCollection = new ArrayList<TradeChargeFrameCq>();
	
	public PortfolioRuleFrameCq addPortfolioRuleFrameVersionCqCollectionItem(PortfolioRuleFrameVersionCq portfolioRuleFrameVersionCqCollectionItem) {
		this.portfolioRuleFrameVersionCqCollection.add(portfolioRuleFrameVersionCqCollectionItem);
		return this;
	}
	
	public List<PortfolioRuleFrameVersionCq> getPortfolioRuleFrameVersionCqCollection() {
		return portfolioRuleFrameVersionCqCollection;
	}
	
	public void setPortfolioRuleFrameVersionCqCollection(List<PortfolioRuleFrameVersionCq> portfolioRuleFrameVersionCqCollection) {
		this.portfolioRuleFrameVersionCqCollection = portfolioRuleFrameVersionCqCollection;
	}
	
	public PortfolioRuleFrameInfoCq getPortfolioRuleFrameInfoCq() {
		return portfolioRuleFrameInfoCq;
	}
	
	public void setPortfolioRuleFrameInfoCq(PortfolioRuleFrameInfoCq portfolioRuleFrameInfoCq) {
		this.portfolioRuleFrameInfoCq = portfolioRuleFrameInfoCq;
	}
	
	public PortfolioRuleFrameCq addTradeChargeFrameCqCollectionItem(TradeChargeFrameCq tradeChargeFrameCqCollectionItem) {
		this.tradeChargeFrameCqCollection.add(tradeChargeFrameCqCollectionItem);
		return this;
	}
	
	public List<TradeChargeFrameCq> getTradeChargeFrameCqCollection() {
		return tradeChargeFrameCqCollection;
	}
	
	public void setTradeChargeFrameCqCollection(List<TradeChargeFrameCq> tradeChargeFrameCqCollection) {
		this.tradeChargeFrameCqCollection = tradeChargeFrameCqCollection;
	}
}

