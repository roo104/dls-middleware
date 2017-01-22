package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class BillingSummaryCq implements Serializable {
  @JsonProperty("nextBillingDate")
  private LocalDate nextBillingDate = null;

  @JsonProperty("billingInfoHistoryCq")
  private BillingInfoHistoryCq billingInfoHistoryCq = null;

  @JsonProperty("historicBillingInfoHistoryCqCollection")
  private List<BillingInfoHistoryCq> historicBillingInfoHistoryCqCollection = new ArrayList<BillingInfoHistoryCq>();


  public LocalDate getNextBillingDate() {
    return nextBillingDate;
  }

  public void setNextBillingDate(LocalDate nextBillingDate) {
    this.nextBillingDate = nextBillingDate;
  }

  public BillingInfoHistoryCq getBillingInfoHistoryCq() {
    return billingInfoHistoryCq;
  }

  public void setBillingInfoHistoryCq(BillingInfoHistoryCq billingInfoHistoryCq) {
    this.billingInfoHistoryCq = billingInfoHistoryCq;
  }
  public BillingSummaryCq addHistoricBillingInfoHistoryCqCollectionItem(BillingInfoHistoryCq historicBillingInfoHistoryCqCollectionItem) {
    this.historicBillingInfoHistoryCqCollection.add(historicBillingInfoHistoryCqCollectionItem);
    return this;
  }

  public List<BillingInfoHistoryCq> getHistoricBillingInfoHistoryCqCollection() {
    return historicBillingInfoHistoryCqCollection;
  }

  public void setHistoricBillingInfoHistoryCqCollection(List<BillingInfoHistoryCq> historicBillingInfoHistoryCqCollection) {
    this.historicBillingInfoHistoryCqCollection = historicBillingInfoHistoryCqCollection;
  }
}

