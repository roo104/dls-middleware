package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ContributionTolerancePolicyQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("contributionToleranceCqCollection")
	private List<ContributionToleranceCq> contributionToleranceCqCollection = new ArrayList<ContributionToleranceCq>();
	
	@JsonProperty("historicContributionToleranceCqCollection")
	private List<ContributionToleranceCq> historicContributionToleranceCqCollection = new ArrayList<ContributionToleranceCq>();
	
	@JsonProperty("productToleranceCq")
	private ProductToleranceCq productToleranceCq = null;
	
	public ContributionTolerancePolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public ContributionTolerancePolicyQueryResult addContributionToleranceCqCollectionItem(ContributionToleranceCq contributionToleranceCqCollectionItem) {
		this.contributionToleranceCqCollection.add(contributionToleranceCqCollectionItem);
		return this;
	}
	
	public List<ContributionToleranceCq> getContributionToleranceCqCollection() {
		return contributionToleranceCqCollection;
	}
	
	public void setContributionToleranceCqCollection(List<ContributionToleranceCq> contributionToleranceCqCollection) {
		this.contributionToleranceCqCollection = contributionToleranceCqCollection;
	}
	
	public ContributionTolerancePolicyQueryResult addHistoricContributionToleranceCqCollectionItem(ContributionToleranceCq historicContributionToleranceCqCollectionItem) {
		this.historicContributionToleranceCqCollection.add(historicContributionToleranceCqCollectionItem);
		return this;
	}
	
	public List<ContributionToleranceCq> getHistoricContributionToleranceCqCollection() {
		return historicContributionToleranceCqCollection;
	}
	
	public void setHistoricContributionToleranceCqCollection(List<ContributionToleranceCq> historicContributionToleranceCqCollection) {
		this.historicContributionToleranceCqCollection = historicContributionToleranceCqCollection;
	}
	
	public ProductToleranceCq getProductToleranceCq() {
		return productToleranceCq;
	}
	
	public void setProductToleranceCq(ProductToleranceCq productToleranceCq) {
		this.productToleranceCq = productToleranceCq;
	}
}

