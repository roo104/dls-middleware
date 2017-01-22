package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class ChangeParentAgreementCommand implements Serializable {
  @JsonProperty("addUsCollection")
  private List<AgreementIdCq> addUsCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("removeUsCollection")
  private List<AgreementIdCq> removeUsCollection = new ArrayList<AgreementIdCq>();

  @JsonProperty("draftId")
  private AgreementVersionIdCq draftId = null;

  public ChangeParentAgreementCommand addAddUsCollectionItem(AgreementIdCq addUsCollectionItem) {
    this.addUsCollection.add(addUsCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getAddUsCollection() {
    return addUsCollection;
  }

  public void setAddUsCollection(List<AgreementIdCq> addUsCollection) {
    this.addUsCollection = addUsCollection;
  }
  public ChangeParentAgreementCommand addRemoveUsCollectionItem(AgreementIdCq removeUsCollectionItem) {
    this.removeUsCollection.add(removeUsCollectionItem);
    return this;
  }

  public List<AgreementIdCq> getRemoveUsCollection() {
    return removeUsCollection;
  }

  public void setRemoveUsCollection(List<AgreementIdCq> removeUsCollection) {
    this.removeUsCollection = removeUsCollection;
  }

  public AgreementVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(AgreementVersionIdCq draftId) {
    this.draftId = draftId;
  }
}

