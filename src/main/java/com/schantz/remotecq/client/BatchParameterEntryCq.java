package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class BatchParameterEntryCq implements Serializable {
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("value")
	private String value = null;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}

