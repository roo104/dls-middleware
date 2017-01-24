package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class SimulateHistoricPortfolioChangesCommand implements Serializable {
	@JsonProperty("portfolioId")
	private PortfolioIdCq portfolioId = null;
	
	@JsonProperty("transactionTime")
	private OffsetDateTime transactionTime = null;
	
	@JsonProperty("historicRuleFrameChangeCqCollection")
	private List<HistoricRuleFrameChangeCq> historicRuleFrameChangeCqCollection = new ArrayList<HistoricRuleFrameChangeCq>();
	
	@JsonProperty("historicSplitChangeCqCollection")
	private List<HistoricSplitChangeCq> historicSplitChangeCqCollection = new ArrayList<HistoricSplitChangeCq>();
	
	
	public PortfolioIdCq getPortfolioId() {
		return portfolioId;
	}
	
	public void setPortfolioId(PortfolioIdCq portfolioId) {
		this.portfolioId = portfolioId;
	}
	
	public OffsetDateTime getTransactionTime() {
		return transactionTime;
	}
	
	public void setTransactionTime(OffsetDateTime transactionTime) {
		this.transactionTime = transactionTime;
	}
	
	public SimulateHistoricPortfolioChangesCommand addHistoricRuleFrameChangeCqCollectionItem(HistoricRuleFrameChangeCq historicRuleFrameChangeCqCollectionItem) {
		this.historicRuleFrameChangeCqCollection.add(historicRuleFrameChangeCqCollectionItem);
		return this;
	}
	
	public List<HistoricRuleFrameChangeCq> getHistoricRuleFrameChangeCqCollection() {
		return historicRuleFrameChangeCqCollection;
	}
	
	public void setHistoricRuleFrameChangeCqCollection(List<HistoricRuleFrameChangeCq> historicRuleFrameChangeCqCollection) {
		this.historicRuleFrameChangeCqCollection = historicRuleFrameChangeCqCollection;
	}
	
	public SimulateHistoricPortfolioChangesCommand addHistoricSplitChangeCqCollectionItem(HistoricSplitChangeCq historicSplitChangeCqCollectionItem) {
		this.historicSplitChangeCqCollection.add(historicSplitChangeCqCollectionItem);
		return this;
	}
	
	public List<HistoricSplitChangeCq> getHistoricSplitChangeCqCollection() {
		return historicSplitChangeCqCollection;
	}
	
	public void setHistoricSplitChangeCqCollection(List<HistoricSplitChangeCq> historicSplitChangeCqCollection) {
		this.historicSplitChangeCqCollection = historicSplitChangeCqCollection;
	}
}

