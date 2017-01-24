package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AdvancePolicyTriggersCq implements Serializable {
	@JsonProperty("advancePolicyTriggerIdCqCollection")
	private List<AdvancePolicyTriggerIdCq> advancePolicyTriggerIdCqCollection = new ArrayList<AdvancePolicyTriggerIdCq>();
	
	public AdvancePolicyTriggersCq addAdvancePolicyTriggerIdCqCollectionItem(AdvancePolicyTriggerIdCq advancePolicyTriggerIdCqCollectionItem) {
		this.advancePolicyTriggerIdCqCollection.add(advancePolicyTriggerIdCqCollectionItem);
		return this;
	}
	
	public List<AdvancePolicyTriggerIdCq> getAdvancePolicyTriggerIdCqCollection() {
		return advancePolicyTriggerIdCqCollection;
	}
	
	public void setAdvancePolicyTriggerIdCqCollection(List<AdvancePolicyTriggerIdCq> advancePolicyTriggerIdCqCollection) {
		this.advancePolicyTriggerIdCqCollection = advancePolicyTriggerIdCqCollection;
	}
}

