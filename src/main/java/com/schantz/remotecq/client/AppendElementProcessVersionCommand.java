package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class AppendElementProcessVersionCommand implements Serializable {
	@JsonProperty("appendTo")
	private ConfigWfc2IdCq appendTo = null;
	
	@JsonProperty("appendElementDelta")
	private AppendElementDelta appendElementDelta = null;
	
	
	public ConfigWfc2IdCq getAppendTo() {
		return appendTo;
	}
	
	public void setAppendTo(ConfigWfc2IdCq appendTo) {
		this.appendTo = appendTo;
	}
	
	public AppendElementDelta getAppendElementDelta() {
		return appendElementDelta;
	}
	
	public void setAppendElementDelta(AppendElementDelta appendElementDelta) {
		this.appendElementDelta = appendElementDelta;
	}
}

