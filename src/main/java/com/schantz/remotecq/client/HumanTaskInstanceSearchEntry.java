package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class HumanTaskInstanceSearchEntry implements Serializable {
  @JsonProperty("humanTaskInstanceStateCq")
  private HumanTaskInstanceStateCq humanTaskInstanceStateCq = null;

  @JsonProperty("businessEntitiesRelationshipCq")
  private BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq = null;


  public HumanTaskInstanceStateCq getHumanTaskInstanceStateCq() {
    return humanTaskInstanceStateCq;
  }

  public void setHumanTaskInstanceStateCq(HumanTaskInstanceStateCq humanTaskInstanceStateCq) {
    this.humanTaskInstanceStateCq = humanTaskInstanceStateCq;
  }

  public BusinessEntitiesRelationshipCq getBusinessEntitiesRelationshipCq() {
    return businessEntitiesRelationshipCq;
  }

  public void setBusinessEntitiesRelationshipCq(BusinessEntitiesRelationshipCq businessEntitiesRelationshipCq) {
    this.businessEntitiesRelationshipCq = businessEntitiesRelationshipCq;
  }
}

