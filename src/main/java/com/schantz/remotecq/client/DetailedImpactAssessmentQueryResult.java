package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DetailedImpactAssessmentQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("impactAssessmentOrderCq")
  private ImpactAssessmentOrderCq impactAssessmentOrderCq = null;

  public DetailedImpactAssessmentQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public ImpactAssessmentOrderCq getImpactAssessmentOrderCq() {
    return impactAssessmentOrderCq;
  }

  public void setImpactAssessmentOrderCq(ImpactAssessmentOrderCq impactAssessmentOrderCq) {
    this.impactAssessmentOrderCq = impactAssessmentOrderCq;
  }
}

