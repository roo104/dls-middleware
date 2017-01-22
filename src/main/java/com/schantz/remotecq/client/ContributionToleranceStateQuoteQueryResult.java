package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ContributionToleranceStateQuoteQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("contributionToleranceCqCollection")
  private List<ContributionToleranceCq> contributionToleranceCqCollection = new ArrayList<ContributionToleranceCq>();

  @JsonProperty("productToleranceCq")
  private ProductToleranceCq productToleranceCq = null;

  public ContributionToleranceStateQuoteQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ContributionToleranceStateQuoteQueryResult addContributionToleranceCqCollectionItem(ContributionToleranceCq contributionToleranceCqCollectionItem) {
    this.contributionToleranceCqCollection.add(contributionToleranceCqCollectionItem);
    return this;
  }

  public List<ContributionToleranceCq> getContributionToleranceCqCollection() {
    return contributionToleranceCqCollection;
  }

  public void setContributionToleranceCqCollection(List<ContributionToleranceCq> contributionToleranceCqCollection) {
    this.contributionToleranceCqCollection = contributionToleranceCqCollection;
  }

  public ProductToleranceCq getProductToleranceCq() {
    return productToleranceCq;
  }

  public void setProductToleranceCq(ProductToleranceCq productToleranceCq) {
    this.productToleranceCq = productToleranceCq;
  }
}

