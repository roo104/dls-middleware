package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class HealthGroupRuleConsequenceCq implements Serializable {
	@JsonProperty("healthEvaluationRuleActionTypeCq")
	private String healthEvaluationRuleActionTypeCq = null;
	
	@JsonProperty("healthGroupRuleConsequenceTypeEnumCq")
	private String healthGroupRuleConsequenceTypeEnumCq = null;
	
	
	public String getHealthEvaluationRuleActionTypeCq() {
		return healthEvaluationRuleActionTypeCq;
	}
	
	public void setHealthEvaluationRuleActionTypeCq(String healthEvaluationRuleActionTypeCq) {
		this.healthEvaluationRuleActionTypeCq = healthEvaluationRuleActionTypeCq;
	}
	
	public String getHealthGroupRuleConsequenceTypeEnumCq() {
		return healthGroupRuleConsequenceTypeEnumCq;
	}
	
	public void setHealthGroupRuleConsequenceTypeEnumCq(String healthGroupRuleConsequenceTypeEnumCq) {
		this.healthGroupRuleConsequenceTypeEnumCq = healthGroupRuleConsequenceTypeEnumCq;
	}
}

