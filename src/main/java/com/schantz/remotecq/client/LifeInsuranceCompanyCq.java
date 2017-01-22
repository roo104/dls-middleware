package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class LifeInsuranceCompanyCq implements Serializable {
  @JsonProperty("unitLinkedOwnerIdCq")
  private UnitLinkedOwnerIdCq unitLinkedOwnerIdCq = null;


  public UnitLinkedOwnerIdCq getUnitLinkedOwnerIdCq() {
    return unitLinkedOwnerIdCq;
  }

  public void setUnitLinkedOwnerIdCq(UnitLinkedOwnerIdCq unitLinkedOwnerIdCq) {
    this.unitLinkedOwnerIdCq = unitLinkedOwnerIdCq;
  }
}

