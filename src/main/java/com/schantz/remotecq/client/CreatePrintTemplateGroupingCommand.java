package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class CreatePrintTemplateGroupingCommand implements Serializable {
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("parent")
	private PrintTemplateGroupingIdCq parent = null;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PrintTemplateGroupingIdCq getParent() {
		return parent;
	}
	
	public void setParent(PrintTemplateGroupingIdCq parent) {
		this.parent = parent;
	}
}

