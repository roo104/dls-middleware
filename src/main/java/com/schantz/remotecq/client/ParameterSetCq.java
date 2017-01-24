package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ParameterSetCq implements Serializable {
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("subSetCollection")
	private List<ParameterSetCq> subSetCollection = new ArrayList<ParameterSetCq>();
	
	@JsonProperty("id")
	private ParameterSetIdCq id = null;
	
	@JsonProperty("type")
	private ParameterSetTypeCq type = null;
	
	@JsonProperty("parameterSeriesSetCqCollection")
	private List<ParameterSeriesSetCq> parameterSeriesSetCqCollection = new ArrayList<ParameterSeriesSetCq>();
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ParameterSetCq addSubSetCollectionItem(ParameterSetCq subSetCollectionItem) {
		this.subSetCollection.add(subSetCollectionItem);
		return this;
	}
	
	public List<ParameterSetCq> getSubSetCollection() {
		return subSetCollection;
	}
	
	public void setSubSetCollection(List<ParameterSetCq> subSetCollection) {
		this.subSetCollection = subSetCollection;
	}
	
	public ParameterSetIdCq getId() {
		return id;
	}
	
	public void setId(ParameterSetIdCq id) {
		this.id = id;
	}
	
	public ParameterSetTypeCq getType() {
		return type;
	}
	
	public void setType(ParameterSetTypeCq type) {
		this.type = type;
	}
	
	public ParameterSetCq addParameterSeriesSetCqCollectionItem(ParameterSeriesSetCq parameterSeriesSetCqCollectionItem) {
		this.parameterSeriesSetCqCollection.add(parameterSeriesSetCqCollectionItem);
		return this;
	}
	
	public List<ParameterSeriesSetCq> getParameterSeriesSetCqCollection() {
		return parameterSeriesSetCqCollection;
	}
	
	public void setParameterSeriesSetCqCollection(List<ParameterSeriesSetCq> parameterSeriesSetCqCollection) {
		this.parameterSeriesSetCqCollection = parameterSeriesSetCqCollection;
	}
}

