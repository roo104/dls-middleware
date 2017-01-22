package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ImpactAssessmentAgreementQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("impactAssessmentOrderSummaryCqCollection")
  private List<ImpactAssessmentOrderSummaryCq> impactAssessmentOrderSummaryCqCollection = new ArrayList<ImpactAssessmentOrderSummaryCq>();

  public ImpactAssessmentAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public ImpactAssessmentAgreementQueryResult addImpactAssessmentOrderSummaryCqCollectionItem(ImpactAssessmentOrderSummaryCq impactAssessmentOrderSummaryCqCollectionItem) {
    this.impactAssessmentOrderSummaryCqCollection.add(impactAssessmentOrderSummaryCqCollectionItem);
    return this;
  }

  public List<ImpactAssessmentOrderSummaryCq> getImpactAssessmentOrderSummaryCqCollection() {
    return impactAssessmentOrderSummaryCqCollection;
  }

  public void setImpactAssessmentOrderSummaryCqCollection(List<ImpactAssessmentOrderSummaryCq> impactAssessmentOrderSummaryCqCollection) {
    this.impactAssessmentOrderSummaryCqCollection = impactAssessmentOrderSummaryCqCollection;
  }
}

