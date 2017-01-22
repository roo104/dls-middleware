package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class CreateQuotePolicyCommand implements Serializable {
  @JsonProperty("policyId")
  private PolicyIdCq policyId = null;

  @JsonProperty("eventDate")
  private LocalDate eventDate = null;

  @JsonProperty("handleReceivables")
  private Boolean handleReceivables = false;

  @JsonProperty("skipAdvance")
  private Boolean skipAdvance = false;


  public PolicyIdCq getPolicyId() {
    return policyId;
  }

  public void setPolicyId(PolicyIdCq policyId) {
    this.policyId = policyId;
  }

  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public Boolean getHandleReceivables() {
    return handleReceivables;
  }

  public void setHandleReceivables(Boolean handleReceivables) {
    this.handleReceivables = handleReceivables;
  }

  public Boolean getSkipAdvance() {
    return skipAdvance;
  }

  public void setSkipAdvance(Boolean skipAdvance) {
    this.skipAdvance = skipAdvance;
  }
}

