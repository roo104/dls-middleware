package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AccountSummaryEntryCq implements Serializable {
	@JsonProperty("totalAmount")
	private Double totalAmount = null;
	
	@JsonProperty("voucherType")
	private String voucherType = null;
	
	@JsonProperty("accountItemEntryCqCollection")
	private List<AccountItemEntryCq> accountItemEntryCqCollection = new ArrayList<AccountItemEntryCq>();
	
	@JsonProperty("voucherSubType")
	private OiAccountVoucherSubTypeCq voucherSubType = null;
	
	
	public Double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getVoucherType() {
		return voucherType;
	}
	
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	
	public AccountSummaryEntryCq addAccountItemEntryCqCollectionItem(AccountItemEntryCq accountItemEntryCqCollectionItem) {
		this.accountItemEntryCqCollection.add(accountItemEntryCqCollectionItem);
		return this;
	}
	
	public List<AccountItemEntryCq> getAccountItemEntryCqCollection() {
		return accountItemEntryCqCollection;
	}
	
	public void setAccountItemEntryCqCollection(List<AccountItemEntryCq> accountItemEntryCqCollection) {
		this.accountItemEntryCqCollection = accountItemEntryCqCollection;
	}
	
	public OiAccountVoucherSubTypeCq getVoucherSubType() {
		return voucherSubType;
	}
	
	public void setVoucherSubType(OiAccountVoucherSubTypeCq voucherSubType) {
		this.voucherSubType = voucherSubType;
	}
}

