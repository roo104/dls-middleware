package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopAgreementSearchConceptsQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("agreementFrame")
  private TopAgreementSelectionFrameCq agreementFrame = null;

  public TopAgreementSearchConceptsQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public TopAgreementSelectionFrameCq getAgreementFrame() {
    return agreementFrame;
  }

  public void setAgreementFrame(TopAgreementSelectionFrameCq agreementFrame) {
    this.agreementFrame = agreementFrame;
  }
}

