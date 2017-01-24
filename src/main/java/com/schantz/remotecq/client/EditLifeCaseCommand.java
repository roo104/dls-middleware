package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EditLifeCaseCommand implements Serializable {
	@JsonProperty("lceCqCollection")
	private List<LceCq> lceCqCollection = new ArrayList<LceCq>();
	
	@JsonProperty("lifeCaseIdCq")
	private LifeCaseIdCq lifeCaseIdCq = null;
	
	public EditLifeCaseCommand addLceCqCollectionItem(LceCq lceCqCollectionItem) {
		this.lceCqCollection.add(lceCqCollectionItem);
		return this;
	}
	
	public List<LceCq> getLceCqCollection() {
		return lceCqCollection;
	}
	
	public void setLceCqCollection(List<LceCq> lceCqCollection) {
		this.lceCqCollection = lceCqCollection;
	}
	
	public LifeCaseIdCq getLifeCaseIdCq() {
		return lifeCaseIdCq;
	}
	
	public void setLifeCaseIdCq(LifeCaseIdCq lifeCaseIdCq) {
		this.lifeCaseIdCq = lifeCaseIdCq;
	}
}

