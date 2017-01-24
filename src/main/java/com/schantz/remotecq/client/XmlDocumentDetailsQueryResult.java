package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class XmlDocumentDetailsQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("xmlRaw")
	private String xmlRaw = null;
	
	@JsonProperty("xmlFormatted")
	private String xmlFormatted = null;
	
	public XmlDocumentDetailsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public String getXmlRaw() {
		return xmlRaw;
	}
	
	public void setXmlRaw(String xmlRaw) {
		this.xmlRaw = xmlRaw;
	}
	
	public String getXmlFormatted() {
		return xmlFormatted;
	}
	
	public void setXmlFormatted(String xmlFormatted) {
		this.xmlFormatted = xmlFormatted;
	}
}

