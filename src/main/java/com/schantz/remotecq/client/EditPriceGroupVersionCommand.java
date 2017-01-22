package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditPriceGroupVersionCommand implements Serializable {
  @JsonProperty("draftId")
  private PriceGroupVersionIdCq draftId = null;

  @JsonProperty("priceGroupDeltaCqCollection")
  private List<PriceGroupDeltaCq> priceGroupDeltaCqCollection = new ArrayList<PriceGroupDeltaCq>();


  public PriceGroupVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(PriceGroupVersionIdCq draftId) {
    this.draftId = draftId;
  }
  public EditPriceGroupVersionCommand addPriceGroupDeltaCqCollectionItem(PriceGroupDeltaCq priceGroupDeltaCqCollectionItem) {
    this.priceGroupDeltaCqCollection.add(priceGroupDeltaCqCollectionItem);
    return this;
  }

  public List<PriceGroupDeltaCq> getPriceGroupDeltaCqCollection() {
    return priceGroupDeltaCqCollection;
  }

  public void setPriceGroupDeltaCqCollection(List<PriceGroupDeltaCq> priceGroupDeltaCqCollection) {
    this.priceGroupDeltaCqCollection = priceGroupDeltaCqCollection;
  }
}

