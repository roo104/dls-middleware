package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class LifeCoverTypeCq implements Serializable {
  @JsonProperty("lifeCoverTypeIdCq")
  private LifeCoverTypeIdCq lifeCoverTypeIdCq = null;

  @JsonProperty("benefitTypeCq")
  private String benefitTypeCq = null;

  @JsonProperty("benefitTriggerEventCqCollection")
  private List<String> benefitTriggerEventCqCollection = new ArrayList<String>();


  public LifeCoverTypeIdCq getLifeCoverTypeIdCq() {
    return lifeCoverTypeIdCq;
  }

  public void setLifeCoverTypeIdCq(LifeCoverTypeIdCq lifeCoverTypeIdCq) {
    this.lifeCoverTypeIdCq = lifeCoverTypeIdCq;
  }

  public String getBenefitTypeCq() {
    return benefitTypeCq;
  }

  public void setBenefitTypeCq(String benefitTypeCq) {
    this.benefitTypeCq = benefitTypeCq;
  }
  public LifeCoverTypeCq addBenefitTriggerEventCqCollectionItem(String benefitTriggerEventCqCollectionItem) {
    this.benefitTriggerEventCqCollection.add(benefitTriggerEventCqCollectionItem);
    return this;
  }

  public List<String> getBenefitTriggerEventCqCollection() {
    return benefitTriggerEventCqCollection;
  }

  public void setBenefitTriggerEventCqCollection(List<String> benefitTriggerEventCqCollection) {
    this.benefitTriggerEventCqCollection = benefitTriggerEventCqCollection;
  }
}

