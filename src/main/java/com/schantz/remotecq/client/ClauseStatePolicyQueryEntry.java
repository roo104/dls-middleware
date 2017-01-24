package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ClauseStatePolicyQueryEntry implements Serializable {
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("clauseCqCollection")
	private List<ClauseCq> clauseCqCollection = new ArrayList<ClauseCq>();
	
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
	}
	
	public ClauseStatePolicyQueryEntry addClauseCqCollectionItem(ClauseCq clauseCqCollectionItem) {
		this.clauseCqCollection.add(clauseCqCollectionItem);
		return this;
	}
	
	public List<ClauseCq> getClauseCqCollection() {
		return clauseCqCollection;
	}
	
	public void setClauseCqCollection(List<ClauseCq> clauseCqCollection) {
		this.clauseCqCollection = clauseCqCollection;
	}
}

