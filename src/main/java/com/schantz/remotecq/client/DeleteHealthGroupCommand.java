package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DeleteHealthGroupCommand implements Serializable {
	@JsonProperty("healthGroupIdCq")
	private HealthGroupIdCq healthGroupIdCq = null;
	
	
	public HealthGroupIdCq getHealthGroupIdCq() {
		return healthGroupIdCq;
	}
	
	public void setHealthGroupIdCq(HealthGroupIdCq healthGroupIdCq) {
		this.healthGroupIdCq = healthGroupIdCq;
	}
}

