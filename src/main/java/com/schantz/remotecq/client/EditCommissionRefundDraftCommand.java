package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EditCommissionRefundDraftCommand implements Serializable {
	@JsonProperty("draftId")
	private CommissionRefundRuleVersionIdCq draftId = null;
	
	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("commissionRefundEntryDeltaCqCollection")
	private List<CommissionRefundEntryDeltaCq> commissionRefundEntryDeltaCqCollection = new ArrayList<CommissionRefundEntryDeltaCq>();
	
	
	public CommissionRefundRuleVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(CommissionRefundRuleVersionIdCq draftId) {
		this.draftId = draftId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EditCommissionRefundDraftCommand addCommissionRefundEntryDeltaCqCollectionItem(CommissionRefundEntryDeltaCq commissionRefundEntryDeltaCqCollectionItem) {
		this.commissionRefundEntryDeltaCqCollection.add(commissionRefundEntryDeltaCqCollectionItem);
		return this;
	}
	
	public List<CommissionRefundEntryDeltaCq> getCommissionRefundEntryDeltaCqCollection() {
		return commissionRefundEntryDeltaCqCollection;
	}
	
	public void setCommissionRefundEntryDeltaCqCollection(List<CommissionRefundEntryDeltaCq> commissionRefundEntryDeltaCqCollection) {
		this.commissionRefundEntryDeltaCqCollection = commissionRefundEntryDeltaCqCollection;
	}
}

