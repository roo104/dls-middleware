package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeTargetSplitPolicyQuoteCommand implements Serializable {
	@JsonProperty("quoteId")
	private QuoteIdCq quoteId = null;
	
	@JsonProperty("switchDate")
	private LocalDate switchDate = null;
	
	@JsonProperty("coverId")
	private PolicyCoverIdCq coverId = null;
	
	@JsonProperty("packageId")
	private PolicyPackageIdCq packageId = null;
	
	@JsonProperty("moneyAccountShareCq")
	private MoneyAccountShareCq moneyAccountShareCq = null;
	
	@JsonProperty("fundDateSplitCqCollection")
	private List<FundDateSplitCq> fundDateSplitCqCollection = new ArrayList<FundDateSplitCq>();
	
	@JsonProperty("riskProfileFunctionCq")
	private String riskProfileFunctionCq = null;
	
	@JsonProperty("isDoRebalance")
	private Boolean isDoRebalance = false;
	
	@JsonProperty("isEmptyMoneyAccount")
	private Boolean isEmptyMoneyAccount = false;
	
	
	public QuoteIdCq getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(QuoteIdCq quoteId) {
		this.quoteId = quoteId;
	}
	
	public LocalDate getSwitchDate() {
		return switchDate;
	}
	
	public void setSwitchDate(LocalDate switchDate) {
		this.switchDate = switchDate;
	}
	
	public PolicyCoverIdCq getCoverId() {
		return coverId;
	}
	
	public void setCoverId(PolicyCoverIdCq coverId) {
		this.coverId = coverId;
	}
	
	public PolicyPackageIdCq getPackageId() {
		return packageId;
	}
	
	public void setPackageId(PolicyPackageIdCq packageId) {
		this.packageId = packageId;
	}
	
	public MoneyAccountShareCq getMoneyAccountShareCq() {
		return moneyAccountShareCq;
	}
	
	public void setMoneyAccountShareCq(MoneyAccountShareCq moneyAccountShareCq) {
		this.moneyAccountShareCq = moneyAccountShareCq;
	}
	
	public ChangeTargetSplitPolicyQuoteCommand addFundDateSplitCqCollectionItem(FundDateSplitCq fundDateSplitCqCollectionItem) {
		this.fundDateSplitCqCollection.add(fundDateSplitCqCollectionItem);
		return this;
	}
	
	public List<FundDateSplitCq> getFundDateSplitCqCollection() {
		return fundDateSplitCqCollection;
	}
	
	public void setFundDateSplitCqCollection(List<FundDateSplitCq> fundDateSplitCqCollection) {
		this.fundDateSplitCqCollection = fundDateSplitCqCollection;
	}
	
	public String getRiskProfileFunctionCq() {
		return riskProfileFunctionCq;
	}
	
	public void setRiskProfileFunctionCq(String riskProfileFunctionCq) {
		this.riskProfileFunctionCq = riskProfileFunctionCq;
	}
	
	public Boolean getIsDoRebalance() {
		return isDoRebalance;
	}
	
	public void setIsDoRebalance(Boolean isDoRebalance) {
		this.isDoRebalance = isDoRebalance;
	}
	
	public Boolean getIsEmptyMoneyAccount() {
		return isEmptyMoneyAccount;
	}
	
	public void setIsEmptyMoneyAccount(Boolean isEmptyMoneyAccount) {
		this.isEmptyMoneyAccount = isEmptyMoneyAccount;
	}
}

