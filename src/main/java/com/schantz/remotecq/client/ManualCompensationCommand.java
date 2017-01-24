package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ManualCompensationCommand implements Serializable {
	@JsonProperty("portfolioId")
	private PortfolioIdCq portfolioId = null;
	
	@JsonProperty("transactionTime")
	private OffsetDateTime transactionTime = null;
	
	@JsonProperty("amount")
	private Double amount = null;
	
	@JsonProperty("portfolioUnitsCqCollection")
	private List<PortfolioUnitsCq> portfolioUnitsCqCollection = new ArrayList<PortfolioUnitsCq>();
	
	@JsonProperty("quotePortfolioId")
	private PortfolioIdCq quotePortfolioId = null;
	
	
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
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public ManualCompensationCommand addPortfolioUnitsCqCollectionItem(PortfolioUnitsCq portfolioUnitsCqCollectionItem) {
		this.portfolioUnitsCqCollection.add(portfolioUnitsCqCollectionItem);
		return this;
	}
	
	public List<PortfolioUnitsCq> getPortfolioUnitsCqCollection() {
		return portfolioUnitsCqCollection;
	}
	
	public void setPortfolioUnitsCqCollection(List<PortfolioUnitsCq> portfolioUnitsCqCollection) {
		this.portfolioUnitsCqCollection = portfolioUnitsCqCollection;
	}
	
	public PortfolioIdCq getQuotePortfolioId() {
		return quotePortfolioId;
	}
	
	public void setQuotePortfolioId(PortfolioIdCq quotePortfolioId) {
		this.quotePortfolioId = quotePortfolioId;
	}
}

