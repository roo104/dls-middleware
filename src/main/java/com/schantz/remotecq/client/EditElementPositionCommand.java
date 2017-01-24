package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EditElementPositionCommand implements Serializable {
	@JsonProperty("elementPositionCqCollection")
	private List<ElementPositionCq> elementPositionCqCollection = new ArrayList<ElementPositionCq>();
	
	public EditElementPositionCommand addElementPositionCqCollectionItem(ElementPositionCq elementPositionCqCollectionItem) {
		this.elementPositionCqCollection.add(elementPositionCqCollectionItem);
		return this;
	}
	
	public List<ElementPositionCq> getElementPositionCqCollection() {
		return elementPositionCqCollection;
	}
	
	public void setElementPositionCqCollection(List<ElementPositionCq> elementPositionCqCollection) {
		this.elementPositionCqCollection = elementPositionCqCollection;
	}
}

