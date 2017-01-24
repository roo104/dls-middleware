package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class TermScopeCq implements Serializable {
	@JsonProperty("lifeCoverTypeCqCollection")
	private List<LifeCoverTypeCq> lifeCoverTypeCqCollection = new ArrayList<LifeCoverTypeCq>();
	
	public TermScopeCq addLifeCoverTypeCqCollectionItem(LifeCoverTypeCq lifeCoverTypeCqCollectionItem) {
		this.lifeCoverTypeCqCollection.add(lifeCoverTypeCqCollectionItem);
		return this;
	}
	
	public List<LifeCoverTypeCq> getLifeCoverTypeCqCollection() {
		return lifeCoverTypeCqCollection;
	}
	
	public void setLifeCoverTypeCqCollection(List<LifeCoverTypeCq> lifeCoverTypeCqCollection) {
		this.lifeCoverTypeCqCollection = lifeCoverTypeCqCollection;
	}
}

