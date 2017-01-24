package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CreateClaimParameterCommand implements Serializable {
	@JsonProperty("value")
	private String value = null;
	
	@JsonProperty("claimParameterTypeCq")
	private String claimParameterTypeCq = null;
	
	@JsonProperty("claimProductTypeCqCollection")
	private List<String> claimProductTypeCqCollection = new ArrayList<String>();
	
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getClaimParameterTypeCq() {
		return claimParameterTypeCq;
	}
	
	public void setClaimParameterTypeCq(String claimParameterTypeCq) {
		this.claimParameterTypeCq = claimParameterTypeCq;
	}
	
	public CreateClaimParameterCommand addClaimProductTypeCqCollectionItem(String claimProductTypeCqCollectionItem) {
		this.claimProductTypeCqCollection.add(claimProductTypeCqCollectionItem);
		return this;
	}
	
	public List<String> getClaimProductTypeCqCollection() {
		return claimProductTypeCqCollection;
	}
	
	public void setClaimProductTypeCqCollection(List<String> claimProductTypeCqCollection) {
		this.claimProductTypeCqCollection = claimProductTypeCqCollection;
	}
}

