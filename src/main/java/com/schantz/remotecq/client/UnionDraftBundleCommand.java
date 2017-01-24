package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class UnionDraftBundleCommand implements Serializable {
	@JsonProperty("draftsCollection")
	private List<AgreementVersionIdCq> draftsCollection = new ArrayList<AgreementVersionIdCq>();
	
	public UnionDraftBundleCommand addDraftsCollectionItem(AgreementVersionIdCq draftsCollectionItem) {
		this.draftsCollection.add(draftsCollectionItem);
		return this;
	}
	
	public List<AgreementVersionIdCq> getDraftsCollection() {
		return draftsCollection;
	}
	
	public void setDraftsCollection(List<AgreementVersionIdCq> draftsCollection) {
		this.draftsCollection = draftsCollection;
	}
}

