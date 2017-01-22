package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class VersionIdAgreementQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("agreementVersionIdCq")
  private AgreementVersionIdCq agreementVersionIdCq = null;

  public VersionIdAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public AgreementVersionIdCq getAgreementVersionIdCq() {
    return agreementVersionIdCq;
  }

  public void setAgreementVersionIdCq(AgreementVersionIdCq agreementVersionIdCq) {
    this.agreementVersionIdCq = agreementVersionIdCq;
  }
}

