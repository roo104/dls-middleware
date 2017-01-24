package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ManualPaymentDeleteEntryCommand implements Serializable {
	@JsonProperty("manualPaymentEntryIdCqCollection")
	private List<ManualPaymentEntryIdCq> manualPaymentEntryIdCqCollection = new ArrayList<ManualPaymentEntryIdCq>();
	
	public ManualPaymentDeleteEntryCommand addManualPaymentEntryIdCqCollectionItem(ManualPaymentEntryIdCq manualPaymentEntryIdCqCollectionItem) {
		this.manualPaymentEntryIdCqCollection.add(manualPaymentEntryIdCqCollectionItem);
		return this;
	}
	
	public List<ManualPaymentEntryIdCq> getManualPaymentEntryIdCqCollection() {
		return manualPaymentEntryIdCqCollection;
	}
	
	public void setManualPaymentEntryIdCqCollection(List<ManualPaymentEntryIdCq> manualPaymentEntryIdCqCollection) {
		this.manualPaymentEntryIdCqCollection = manualPaymentEntryIdCqCollection;
	}
}

