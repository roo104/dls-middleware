package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TopSsPalTaxQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("palTax")
  private Double palTax = null;

  @JsonProperty("palYear")
  private String palYear = null;

  public TopSsPalTaxQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public Double getPalTax() {
    return palTax;
  }

  public void setPalTax(Double palTax) {
    this.palTax = palTax;
  }

  public String getPalYear() {
    return palYear;
  }

  public void setPalYear(String palYear) {
    this.palYear = palYear;
  }
}

