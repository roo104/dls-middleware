package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DefaultDimensionValuesCq implements Serializable {
	@JsonProperty("dimensionValueCqCollection")
	private List<DimensionValueCq> dimensionValueCqCollection = new ArrayList<DimensionValueCq>();
	
	public DefaultDimensionValuesCq addDimensionValueCqCollectionItem(DimensionValueCq dimensionValueCqCollectionItem) {
		this.dimensionValueCqCollection.add(dimensionValueCqCollectionItem);
		return this;
	}
	
	public List<DimensionValueCq> getDimensionValueCqCollection() {
		return dimensionValueCqCollection;
	}
	
	public void setDimensionValueCqCollection(List<DimensionValueCq> dimensionValueCqCollection) {
		this.dimensionValueCqCollection = dimensionValueCqCollection;
	}
}

