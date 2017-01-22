package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopPersonPremiumAndReserveQueryTopPersonPremiumAndReserveQueryResult implements Serializable {
  @JsonProperty("viewAtDate")
  private LocalDate viewAtDate = null;

  @JsonProperty("personId")
  private PersonIdCq personId = null;

  @JsonProperty("createSummarizedTotalRow")
  private Boolean createSummarizedTotalRow = false;


  public LocalDate getViewAtDate() {
    return viewAtDate;
  }

  public void setViewAtDate(LocalDate viewAtDate) {
    this.viewAtDate = viewAtDate;
  }

  public PersonIdCq getPersonId() {
    return personId;
  }

  public void setPersonId(PersonIdCq personId) {
    this.personId = personId;
  }

  public Boolean getCreateSummarizedTotalRow() {
    return createSummarizedTotalRow;
  }

  public void setCreateSummarizedTotalRow(Boolean createSummarizedTotalRow) {
    this.createSummarizedTotalRow = createSummarizedTotalRow;
  }
}

