package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class LifeCoverTypeSearchEntry implements Serializable {
	@JsonProperty("lifeCoverTypeIdCq")
	private LifeCoverTypeIdCq lifeCoverTypeIdCq = null;
	
	
	public LifeCoverTypeIdCq getLifeCoverTypeIdCq() {
		return lifeCoverTypeIdCq;
	}
	
	public void setLifeCoverTypeIdCq(LifeCoverTypeIdCq lifeCoverTypeIdCq) {
		this.lifeCoverTypeIdCq = lifeCoverTypeIdCq;
	}
}

