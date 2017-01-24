package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class CommissionScopeCq implements Serializable {
	@JsonProperty("commissionScopeDefinitionPartCqCollection")
	private List<CommissionScopeDefinitionPartCq> commissionScopeDefinitionPartCqCollection = new ArrayList<CommissionScopeDefinitionPartCq>();
	
	public CommissionScopeCq addCommissionScopeDefinitionPartCqCollectionItem(CommissionScopeDefinitionPartCq commissionScopeDefinitionPartCqCollectionItem) {
		this.commissionScopeDefinitionPartCqCollection.add(commissionScopeDefinitionPartCqCollectionItem);
		return this;
	}
	
	public List<CommissionScopeDefinitionPartCq> getCommissionScopeDefinitionPartCqCollection() {
		return commissionScopeDefinitionPartCqCollection;
	}
	
	public void setCommissionScopeDefinitionPartCqCollection(List<CommissionScopeDefinitionPartCq> commissionScopeDefinitionPartCqCollection) {
		this.commissionScopeDefinitionPartCqCollection = commissionScopeDefinitionPartCqCollection;
	}
}

