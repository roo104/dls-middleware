package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EditCommissionRegulationVersionCommand implements Serializable {
	@JsonProperty("draftId")
	private CommissionRegulationVersionIdCq draftId = null;
	
	@JsonProperty("commissionRegulationVersionDeltaCqCollection")
	private List<CommissionRegulationVersionDeltaCq> commissionRegulationVersionDeltaCqCollection = new ArrayList<CommissionRegulationVersionDeltaCq>();
	
	
	public CommissionRegulationVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(CommissionRegulationVersionIdCq draftId) {
		this.draftId = draftId;
	}
	
	public EditCommissionRegulationVersionCommand addCommissionRegulationVersionDeltaCqCollectionItem(CommissionRegulationVersionDeltaCq commissionRegulationVersionDeltaCqCollectionItem) {
		this.commissionRegulationVersionDeltaCqCollection.add(commissionRegulationVersionDeltaCqCollectionItem);
		return this;
	}
	
	public List<CommissionRegulationVersionDeltaCq> getCommissionRegulationVersionDeltaCqCollection() {
		return commissionRegulationVersionDeltaCqCollection;
	}
	
	public void setCommissionRegulationVersionDeltaCqCollection(List<CommissionRegulationVersionDeltaCq> commissionRegulationVersionDeltaCqCollection) {
		this.commissionRegulationVersionDeltaCqCollection = commissionRegulationVersionDeltaCqCollection;
	}
}

