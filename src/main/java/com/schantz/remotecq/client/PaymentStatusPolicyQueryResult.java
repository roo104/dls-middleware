package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PaymentStatusPolicyQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("paymentStatusInfoCqCollection")
  private List<PaymentStatusInfoCq> paymentStatusInfoCqCollection = new ArrayList<PaymentStatusInfoCq>();

  public PaymentStatusPolicyQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }
  public PaymentStatusPolicyQueryResult addPaymentStatusInfoCqCollectionItem(PaymentStatusInfoCq paymentStatusInfoCqCollectionItem) {
    this.paymentStatusInfoCqCollection.add(paymentStatusInfoCqCollectionItem);
    return this;
  }

  public List<PaymentStatusInfoCq> getPaymentStatusInfoCqCollection() {
    return paymentStatusInfoCqCollection;
  }

  public void setPaymentStatusInfoCqCollection(List<PaymentStatusInfoCq> paymentStatusInfoCqCollection) {
    this.paymentStatusInfoCqCollection = paymentStatusInfoCqCollection;
  }
}

