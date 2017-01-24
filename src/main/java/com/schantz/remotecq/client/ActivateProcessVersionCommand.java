package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ActivateProcessVersionCommand implements Serializable {
	@JsonProperty("activateMe")
	private ProcessVersionIdCq activateMe = null;
	
	
	public ProcessVersionIdCq getActivateMe() {
		return activateMe;
	}
	
	public void setActivateMe(ProcessVersionIdCq activateMe) {
		this.activateMe = activateMe;
	}
}

