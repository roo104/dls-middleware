package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class PriceGroupPriceMetaDataCq implements Serializable {
  @JsonProperty("calculationDataEntryCqCollection")
  private List<CalculationDataEntryCq> calculationDataEntryCqCollection = new ArrayList<CalculationDataEntryCq>();

  public PriceGroupPriceMetaDataCq addCalculationDataEntryCqCollectionItem(CalculationDataEntryCq calculationDataEntryCqCollectionItem) {
    this.calculationDataEntryCqCollection.add(calculationDataEntryCqCollectionItem);
    return this;
  }

  public List<CalculationDataEntryCq> getCalculationDataEntryCqCollection() {
    return calculationDataEntryCqCollection;
  }

  public void setCalculationDataEntryCqCollection(List<CalculationDataEntryCq> calculationDataEntryCqCollection) {
    this.calculationDataEntryCqCollection = calculationDataEntryCqCollection;
  }
}

