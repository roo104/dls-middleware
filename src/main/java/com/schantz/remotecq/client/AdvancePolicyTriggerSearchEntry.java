package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AdvancePolicyTriggerSearchEntry implements Serializable {
	@JsonProperty("advancePolicyTriggerIdCq")
	private AdvancePolicyTriggerIdCq advancePolicyTriggerIdCq = null;
	
	
	public AdvancePolicyTriggerIdCq getAdvancePolicyTriggerIdCq() {
		return advancePolicyTriggerIdCq;
	}
	
	public void setAdvancePolicyTriggerIdCq(AdvancePolicyTriggerIdCq advancePolicyTriggerIdCq) {
		this.advancePolicyTriggerIdCq = advancePolicyTriggerIdCq;
	}
}

