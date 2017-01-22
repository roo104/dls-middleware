package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CommissionReceiverRelationEntryCq implements Serializable {
  @JsonProperty("roleStartDate")
  private LocalDate roleStartDate = null;

  @JsonProperty("roleEndDate")
  private LocalDate roleEndDate = null;

  @JsonProperty("agreementIdCq")
  private AgreementIdCq agreementIdCq = null;

  @JsonProperty("commissionRoleTypeCq")
  private String commissionRoleTypeCq = null;


  public LocalDate getRoleStartDate() {
    return roleStartDate;
  }

  public void setRoleStartDate(LocalDate roleStartDate) {
    this.roleStartDate = roleStartDate;
  }

  public LocalDate getRoleEndDate() {
    return roleEndDate;
  }

  public void setRoleEndDate(LocalDate roleEndDate) {
    this.roleEndDate = roleEndDate;
  }

  public AgreementIdCq getAgreementIdCq() {
    return agreementIdCq;
  }

  public void setAgreementIdCq(AgreementIdCq agreementIdCq) {
    this.agreementIdCq = agreementIdCq;
  }

  public String getCommissionRoleTypeCq() {
    return commissionRoleTypeCq;
  }

  public void setCommissionRoleTypeCq(String commissionRoleTypeCq) {
    this.commissionRoleTypeCq = commissionRoleTypeCq;
  }
}

