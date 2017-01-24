package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DimensionValueCq implements Serializable {
	@JsonProperty("dimensionValueId")
	private String dimensionValueId = null;
	
	@JsonProperty("dimensionValueName")
	private EntityNameCq dimensionValueName = null;
	
	@JsonProperty("dimension")
	private AgreementDimensionCq dimension = null;
	
	
	public String getDimensionValueId() {
		return dimensionValueId;
	}
	
	public void setDimensionValueId(String dimensionValueId) {
		this.dimensionValueId = dimensionValueId;
	}
	
	public EntityNameCq getDimensionValueName() {
		return dimensionValueName;
	}
	
	public void setDimensionValueName(EntityNameCq dimensionValueName) {
		this.dimensionValueName = dimensionValueName;
	}
	
	public AgreementDimensionCq getDimension() {
		return dimension;
	}
	
	public void setDimension(AgreementDimensionCq dimension) {
		this.dimension = dimension;
	}
}

