package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AdvanceCoverTriggerSearchEntry implements Serializable {
	@JsonProperty("advanceCoverTriggerIdCq")
	private AdvanceCoverTriggerIdCq advanceCoverTriggerIdCq = null;
	
	
	public AdvanceCoverTriggerIdCq getAdvanceCoverTriggerIdCq() {
		return advanceCoverTriggerIdCq;
	}
	
	public void setAdvanceCoverTriggerIdCq(AdvanceCoverTriggerIdCq advanceCoverTriggerIdCq) {
		this.advanceCoverTriggerIdCq = advanceCoverTriggerIdCq;
	}
}

