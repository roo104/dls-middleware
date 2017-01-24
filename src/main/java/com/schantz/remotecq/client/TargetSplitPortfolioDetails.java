package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class TargetSplitPortfolioDetails implements Serializable {
	@JsonProperty("fundDateSplitCqCollection")
	private List<FundDateSplitCq> fundDateSplitCqCollection = new ArrayList<FundDateSplitCq>();
	
	@JsonProperty("portfolioRuleVersionInfoCq")
	private PortfolioRuleVersionInfoCq portfolioRuleVersionInfoCq = null;
	
	@JsonProperty("moneyAccountShareCq")
	private MoneyAccountShareCq moneyAccountShareCq = null;
	
	public TargetSplitPortfolioDetails addFundDateSplitCqCollectionItem(FundDateSplitCq fundDateSplitCqCollectionItem) {
		this.fundDateSplitCqCollection.add(fundDateSplitCqCollectionItem);
		return this;
	}
	
	public List<FundDateSplitCq> getFundDateSplitCqCollection() {
		return fundDateSplitCqCollection;
	}
	
	public void setFundDateSplitCqCollection(List<FundDateSplitCq> fundDateSplitCqCollection) {
		this.fundDateSplitCqCollection = fundDateSplitCqCollection;
	}
	
	public PortfolioRuleVersionInfoCq getPortfolioRuleVersionInfoCq() {
		return portfolioRuleVersionInfoCq;
	}
	
	public void setPortfolioRuleVersionInfoCq(PortfolioRuleVersionInfoCq portfolioRuleVersionInfoCq) {
		this.portfolioRuleVersionInfoCq = portfolioRuleVersionInfoCq;
	}
	
	public MoneyAccountShareCq getMoneyAccountShareCq() {
		return moneyAccountShareCq;
	}
	
	public void setMoneyAccountShareCq(MoneyAccountShareCq moneyAccountShareCq) {
		this.moneyAccountShareCq = moneyAccountShareCq;
	}
}

