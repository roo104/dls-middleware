package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class FundDateSplitCq implements Serializable {
  @JsonProperty("fundName")
  private String fundName = null;

  @JsonProperty("datePctCqCollection")
  private List<DatePctCq> datePctCqCollection = new ArrayList<DatePctCq>();

  @JsonProperty("fundId")
  private FundIdCq fundId = null;


  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }
  public FundDateSplitCq addDatePctCqCollectionItem(DatePctCq datePctCqCollectionItem) {
    this.datePctCqCollection.add(datePctCqCollectionItem);
    return this;
  }

  public List<DatePctCq> getDatePctCqCollection() {
    return datePctCqCollection;
  }

  public void setDatePctCqCollection(List<DatePctCq> datePctCqCollection) {
    this.datePctCqCollection = datePctCqCollection;
  }

  public FundIdCq getFundId() {
    return fundId;
  }

  public void setFundId(FundIdCq fundId) {
    this.fundId = fundId;
  }
}

