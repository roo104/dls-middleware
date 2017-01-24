package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AgreementDimensionCq implements Serializable {
	@JsonProperty("dimensionId")
	private String dimensionId = null;
	
	@JsonProperty("dimValuesCollection")
	private List<DimensionValueCq> dimValuesCollection = new ArrayList<DimensionValueCq>();
	
	@JsonProperty("dimensionName")
	private EntityNameCq dimensionName = null;
	
	
	public String getDimensionId() {
		return dimensionId;
	}
	
	public void setDimensionId(String dimensionId) {
		this.dimensionId = dimensionId;
	}
	
	public AgreementDimensionCq addDimValuesCollectionItem(DimensionValueCq dimValuesCollectionItem) {
		this.dimValuesCollection.add(dimValuesCollectionItem);
		return this;
	}
	
	public List<DimensionValueCq> getDimValuesCollection() {
		return dimValuesCollection;
	}
	
	public void setDimValuesCollection(List<DimensionValueCq> dimValuesCollection) {
		this.dimValuesCollection = dimValuesCollection;
	}
	
	public EntityNameCq getDimensionName() {
		return dimensionName;
	}
	
	public void setDimensionName(EntityNameCq dimensionName) {
		this.dimensionName = dimensionName;
	}
}

