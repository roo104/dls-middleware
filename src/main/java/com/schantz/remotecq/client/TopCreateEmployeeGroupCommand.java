package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class TopCreateEmployeeGroupCommand implements Serializable {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentAgreement")
  private AgreementVersionIdCq parentAgreement = null;

  @JsonProperty("laborUnionAgreement")
  private AgreementIdCq laborUnionAgreement = null;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AgreementVersionIdCq getParentAgreement() {
    return parentAgreement;
  }

  public void setParentAgreement(AgreementVersionIdCq parentAgreement) {
    this.parentAgreement = parentAgreement;
  }

  public AgreementIdCq getLaborUnionAgreement() {
    return laborUnionAgreement;
  }

  public void setLaborUnionAgreement(AgreementIdCq laborUnionAgreement) {
    this.laborUnionAgreement = laborUnionAgreement;
  }
}

