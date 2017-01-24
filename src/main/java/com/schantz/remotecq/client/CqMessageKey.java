package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CqMessageKey implements Serializable {
	@JsonProperty("key")
	private String key = null;
	
	@JsonProperty("defaultText")
	private String defaultText = null;
	
	@JsonProperty("messageArguments")
	private List<CqSerializable> messageArguments = new ArrayList<CqSerializable>();
	
	@JsonProperty("messageArgumentsClazzNames")
	private List<String> messageArgumentsClazzNames = new ArrayList<String>();
	
	@JsonProperty("text")
	private String text = null;
	
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getDefaultText() {
		return defaultText;
	}
	
	public void setDefaultText(String defaultText) {
		this.defaultText = defaultText;
	}
	
	public CqMessageKey addMessageArgumentsItem(CqSerializable messageArgumentsItem) {
		this.messageArguments.add(messageArgumentsItem);
		return this;
	}
	
	public List<CqSerializable> getMessageArguments() {
		return messageArguments;
	}
	
	public void setMessageArguments(List<CqSerializable> messageArguments) {
		this.messageArguments = messageArguments;
	}
	
	public CqMessageKey addMessageArgumentsClazzNamesItem(String messageArgumentsClazzNamesItem) {
		this.messageArgumentsClazzNames.add(messageArgumentsClazzNamesItem);
		return this;
	}
	
	public List<String> getMessageArgumentsClazzNames() {
		return messageArgumentsClazzNames;
	}
	
	public void setMessageArgumentsClazzNames(List<String> messageArgumentsClazzNames) {
		this.messageArgumentsClazzNames = messageArgumentsClazzNames;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}

