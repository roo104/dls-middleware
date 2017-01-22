package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class SetRoleValueAgreementCommand implements Serializable {
  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("roleValuePossibilitiesEntry")
  private RoleValuePossibilitiesEntry roleValuePossibilitiesEntry = null;

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;

  @JsonProperty("agreementRoleTypeCq")
  private String agreementRoleTypeCq = null;


  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public RoleValuePossibilitiesEntry getRoleValuePossibilitiesEntry() {
    return roleValuePossibilitiesEntry;
  }

  public void setRoleValuePossibilitiesEntry(RoleValuePossibilitiesEntry roleValuePossibilitiesEntry) {
    this.roleValuePossibilitiesEntry = roleValuePossibilitiesEntry;
  }

  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }

  public String getAgreementRoleTypeCq() {
    return agreementRoleTypeCq;
  }

  public void setAgreementRoleTypeCq(String agreementRoleTypeCq) {
    this.agreementRoleTypeCq = agreementRoleTypeCq;
  }
}

