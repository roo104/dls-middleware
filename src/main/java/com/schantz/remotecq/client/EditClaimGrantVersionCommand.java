package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EditClaimGrantVersionCommand implements Serializable {
	@JsonProperty("claimGrantVersionIdCq")
	private ClaimGrantVersionIdCq claimGrantVersionIdCq = null;
	
	@JsonProperty("claimGrantEditCollection")
	private List<ClaimGrantEdit> claimGrantEditCollection = new ArrayList<ClaimGrantEdit>();
	
	
	public ClaimGrantVersionIdCq getClaimGrantVersionIdCq() {
		return claimGrantVersionIdCq;
	}
	
	public void setClaimGrantVersionIdCq(ClaimGrantVersionIdCq claimGrantVersionIdCq) {
		this.claimGrantVersionIdCq = claimGrantVersionIdCq;
	}
	
	public EditClaimGrantVersionCommand addClaimGrantEditCollectionItem(ClaimGrantEdit claimGrantEditCollectionItem) {
		this.claimGrantEditCollection.add(claimGrantEditCollectionItem);
		return this;
	}
	
	public List<ClaimGrantEdit> getClaimGrantEditCollection() {
		return claimGrantEditCollection;
	}
	
	public void setClaimGrantEditCollection(List<ClaimGrantEdit> claimGrantEditCollection) {
		this.claimGrantEditCollection = claimGrantEditCollection;
	}
}

