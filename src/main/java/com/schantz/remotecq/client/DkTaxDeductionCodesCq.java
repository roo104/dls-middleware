package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class DkTaxDeductionCodesCq implements Serializable {
  @JsonProperty("dkTaxDeductionSelectionCqCollection")
  private List<DkTaxDeductionSelectionCq> dkTaxDeductionSelectionCqCollection = new ArrayList<DkTaxDeductionSelectionCq>();

  public DkTaxDeductionCodesCq addDkTaxDeductionSelectionCqCollectionItem(DkTaxDeductionSelectionCq dkTaxDeductionSelectionCqCollectionItem) {
    this.dkTaxDeductionSelectionCqCollection.add(dkTaxDeductionSelectionCqCollectionItem);
    return this;
  }

  public List<DkTaxDeductionSelectionCq> getDkTaxDeductionSelectionCqCollection() {
    return dkTaxDeductionSelectionCqCollection;
  }

  public void setDkTaxDeductionSelectionCqCollection(List<DkTaxDeductionSelectionCq> dkTaxDeductionSelectionCqCollection) {
    this.dkTaxDeductionSelectionCqCollection = dkTaxDeductionSelectionCqCollection;
  }
}

