package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPersonTaxSummaryQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("personTaxSummaryEntryCq")
  private PersonTaxSummaryEntryCq personTaxSummaryEntryCq = null;

  public TopSsPersonTaxSummaryQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public PersonTaxSummaryEntryCq getPersonTaxSummaryEntryCq() {
    return personTaxSummaryEntryCq;
  }

  public void setPersonTaxSummaryEntryCq(PersonTaxSummaryEntryCq personTaxSummaryEntryCq) {
    this.personTaxSummaryEntryCq = personTaxSummaryEntryCq;
  }
}

