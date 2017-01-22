package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DkAccumulatedReservePolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("tax72Collection")
  private List<DkAccumulatedReserveCq> tax72Collection = new ArrayList<DkAccumulatedReserveCq>();

  @JsonProperty("tax79Collection")
  private List<DkAccumulatedReserveCq> tax79Collection = new ArrayList<DkAccumulatedReserveCq>();

  @JsonProperty("palFree")
  private DkAccumulatedReserveCq palFree = null;

  @JsonProperty("isCalculatePal")
  private Boolean isCalculatePal = false;

  public DkAccumulatedReservePolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public DkAccumulatedReservePolicyQueryResult addTax72CollectionItem(DkAccumulatedReserveCq tax72CollectionItem) {
    this.tax72Collection.add(tax72CollectionItem);
    return this;
  }

  public List<DkAccumulatedReserveCq> getTax72Collection() {
    return tax72Collection;
  }

  public void setTax72Collection(List<DkAccumulatedReserveCq> tax72Collection) {
    this.tax72Collection = tax72Collection;
  }
  public DkAccumulatedReservePolicyQueryResult addTax79CollectionItem(DkAccumulatedReserveCq tax79CollectionItem) {
    this.tax79Collection.add(tax79CollectionItem);
    return this;
  }

  public List<DkAccumulatedReserveCq> getTax79Collection() {
    return tax79Collection;
  }

  public void setTax79Collection(List<DkAccumulatedReserveCq> tax79Collection) {
    this.tax79Collection = tax79Collection;
  }

  public DkAccumulatedReserveCq getPalFree() {
    return palFree;
  }

  public void setPalFree(DkAccumulatedReserveCq palFree) {
    this.palFree = palFree;
  }

  public Boolean getIsCalculatePal() {
    return isCalculatePal;
  }

  public void setIsCalculatePal(Boolean isCalculatePal) {
    this.isCalculatePal = isCalculatePal;
  }
}

