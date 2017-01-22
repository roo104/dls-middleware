package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class AgreementDifferenceQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("agreementVersionDifferenceCq")
  private AgreementVersionDifferenceCq agreementVersionDifferenceCq = null;

  public AgreementDifferenceQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public AgreementVersionDifferenceCq getAgreementVersionDifferenceCq() {
    return agreementVersionDifferenceCq;
  }

  public void setAgreementVersionDifferenceCq(AgreementVersionDifferenceCq agreementVersionDifferenceCq) {
    this.agreementVersionDifferenceCq = agreementVersionDifferenceCq;
  }
}

