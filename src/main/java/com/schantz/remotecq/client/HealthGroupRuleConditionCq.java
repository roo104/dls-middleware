package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class HealthGroupRuleConditionCq implements Serializable {
	@JsonProperty("onlyFromCollection")
	private List<String> onlyFromCollection = new ArrayList<String>();
	
	@JsonProperty("notFromCollection")
	private List<String> notFromCollection = new ArrayList<String>();
	
	@JsonProperty("healthGroupRuleConditionFilterCq")
	private HealthGroupRuleConditionFilterCq healthGroupRuleConditionFilterCq = null;
	
	@JsonProperty("ruleConditionTypeEnumCq")
	private String ruleConditionTypeEnumCq = null;
	
	public HealthGroupRuleConditionCq addOnlyFromCollectionItem(String onlyFromCollectionItem) {
		this.onlyFromCollection.add(onlyFromCollectionItem);
		return this;
	}
	
	public List<String> getOnlyFromCollection() {
		return onlyFromCollection;
	}
	
	public void setOnlyFromCollection(List<String> onlyFromCollection) {
		this.onlyFromCollection = onlyFromCollection;
	}
	
	public HealthGroupRuleConditionCq addNotFromCollectionItem(String notFromCollectionItem) {
		this.notFromCollection.add(notFromCollectionItem);
		return this;
	}
	
	public List<String> getNotFromCollection() {
		return notFromCollection;
	}
	
	public void setNotFromCollection(List<String> notFromCollection) {
		this.notFromCollection = notFromCollection;
	}
	
	public HealthGroupRuleConditionFilterCq getHealthGroupRuleConditionFilterCq() {
		return healthGroupRuleConditionFilterCq;
	}
	
	public void setHealthGroupRuleConditionFilterCq(HealthGroupRuleConditionFilterCq healthGroupRuleConditionFilterCq) {
		this.healthGroupRuleConditionFilterCq = healthGroupRuleConditionFilterCq;
	}
	
	public String getRuleConditionTypeEnumCq() {
		return ruleConditionTypeEnumCq;
	}
	
	public void setRuleConditionTypeEnumCq(String ruleConditionTypeEnumCq) {
		this.ruleConditionTypeEnumCq = ruleConditionTypeEnumCq;
	}
}

