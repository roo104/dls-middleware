package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditRiskBonusGroupVersionCommand implements Serializable {
  @JsonProperty("riskBonusGroupDeltaCqCollection")
  private List<RiskBonusGroupDeltaCq> riskBonusGroupDeltaCqCollection = new ArrayList<RiskBonusGroupDeltaCq>();

  @JsonProperty("draftId")
  private RiskBonusGroupVersionIdCq draftId = null;

  public EditRiskBonusGroupVersionCommand addRiskBonusGroupDeltaCqCollectionItem(RiskBonusGroupDeltaCq riskBonusGroupDeltaCqCollectionItem) {
    this.riskBonusGroupDeltaCqCollection.add(riskBonusGroupDeltaCqCollectionItem);
    return this;
  }

  public List<RiskBonusGroupDeltaCq> getRiskBonusGroupDeltaCqCollection() {
    return riskBonusGroupDeltaCqCollection;
  }

  public void setRiskBonusGroupDeltaCqCollection(List<RiskBonusGroupDeltaCq> riskBonusGroupDeltaCqCollection) {
    this.riskBonusGroupDeltaCqCollection = riskBonusGroupDeltaCqCollection;
  }

  public RiskBonusGroupVersionIdCq getDraftId() {
    return draftId;
  }

  public void setDraftId(RiskBonusGroupVersionIdCq draftId) {
    this.draftId = draftId;
  }
}

