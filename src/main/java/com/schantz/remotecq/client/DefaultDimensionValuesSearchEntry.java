package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DefaultDimensionValuesSearchEntry implements Serializable {
	@JsonProperty("dimensionValueCq")
	private DimensionValueCq dimensionValueCq = null;
	
	
	public DimensionValueCq getDimensionValueCq() {
		return dimensionValueCq;
	}
	
	public void setDimensionValueCq(DimensionValueCq dimensionValueCq) {
		this.dimensionValueCq = dimensionValueCq;
	}
}

