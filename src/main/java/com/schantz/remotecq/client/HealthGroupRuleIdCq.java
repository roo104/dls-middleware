package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class HealthGroupRuleIdCq implements Serializable {
	@JsonProperty("healthGroupRuleUid")
	private String healthGroupRuleUid = null;
	
	@JsonProperty("healthGroupVersionIdCq")
	private HealthGroupVersionIdCq healthGroupVersionIdCq = null;
	
	
	public String getHealthGroupRuleUid() {
		return healthGroupRuleUid;
	}
	
	public void setHealthGroupRuleUid(String healthGroupRuleUid) {
		this.healthGroupRuleUid = healthGroupRuleUid;
	}
	
	public HealthGroupVersionIdCq getHealthGroupVersionIdCq() {
		return healthGroupVersionIdCq;
	}
	
	public void setHealthGroupVersionIdCq(HealthGroupVersionIdCq healthGroupVersionIdCq) {
		this.healthGroupVersionIdCq = healthGroupVersionIdCq;
	}
}

