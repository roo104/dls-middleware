package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class FundRuleSelectionCq implements Serializable {
	@JsonProperty("value")
	private Long value = null;
	
	@JsonProperty("fundRuleFrameCqCollection")
	private List<FundRuleFrameCq> fundRuleFrameCqCollection = new ArrayList<FundRuleFrameCq>();
	
	@JsonProperty("moneyAccountPctFrameCq")
	private FundRuleFrameCq moneyAccountPctFrameCq = null;
	
	
	public Long getValue() {
		return value;
	}
	
	public void setValue(Long value) {
		this.value = value;
	}
	
	public FundRuleSelectionCq addFundRuleFrameCqCollectionItem(FundRuleFrameCq fundRuleFrameCqCollectionItem) {
		this.fundRuleFrameCqCollection.add(fundRuleFrameCqCollectionItem);
		return this;
	}
	
	public List<FundRuleFrameCq> getFundRuleFrameCqCollection() {
		return fundRuleFrameCqCollection;
	}
	
	public void setFundRuleFrameCqCollection(List<FundRuleFrameCq> fundRuleFrameCqCollection) {
		this.fundRuleFrameCqCollection = fundRuleFrameCqCollection;
	}
	
	public FundRuleFrameCq getMoneyAccountPctFrameCq() {
		return moneyAccountPctFrameCq;
	}
	
	public void setMoneyAccountPctFrameCq(FundRuleFrameCq moneyAccountPctFrameCq) {
		this.moneyAccountPctFrameCq = moneyAccountPctFrameCq;
	}
}

