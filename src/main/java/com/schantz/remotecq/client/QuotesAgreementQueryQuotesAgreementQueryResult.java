package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class QuotesAgreementQueryQuotesAgreementQueryResult implements Serializable {
  @JsonProperty("companyId")
  private CompanyIdCq companyId = null;


  public CompanyIdCq getCompanyId() {
    return companyId;
  }

  public void setCompanyId(CompanyIdCq companyId) {
    this.companyId = companyId;
  }
}

