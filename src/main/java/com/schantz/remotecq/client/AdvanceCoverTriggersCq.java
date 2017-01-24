package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class AdvanceCoverTriggersCq implements Serializable {
	@JsonProperty("advanceCoverTriggerIdCqCollection")
	private List<AdvanceCoverTriggerIdCq> advanceCoverTriggerIdCqCollection = new ArrayList<AdvanceCoverTriggerIdCq>();
	
	public AdvanceCoverTriggersCq addAdvanceCoverTriggerIdCqCollectionItem(AdvanceCoverTriggerIdCq advanceCoverTriggerIdCqCollectionItem) {
		this.advanceCoverTriggerIdCqCollection.add(advanceCoverTriggerIdCqCollectionItem);
		return this;
	}
	
	public List<AdvanceCoverTriggerIdCq> getAdvanceCoverTriggerIdCqCollection() {
		return advanceCoverTriggerIdCqCollection;
	}
	
	public void setAdvanceCoverTriggerIdCqCollection(List<AdvanceCoverTriggerIdCq> advanceCoverTriggerIdCqCollection) {
		this.advanceCoverTriggerIdCqCollection = advanceCoverTriggerIdCqCollection;
	}
}

