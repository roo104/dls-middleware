package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class ClauseCq implements Serializable {
  @JsonProperty("clause")
  private String clause = null;

  @JsonProperty("messageKey")
  private String messageKey = null;

  @JsonProperty("freeTextClause")
  private String freeTextClause = null;

  @JsonProperty("noOfPeriods")
  private Long noOfPeriods = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("validPeriod")
  private String validPeriod = null;

  @JsonProperty("clauseTypeCq")
  private String clauseTypeCq = null;

  @JsonProperty("clauseId")
  private ClauseIdCq clauseId = null;


  public String getClause() {
    return clause;
  }

  public void setClause(String clause) {
    this.clause = clause;
  }

  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public String getFreeTextClause() {
    return freeTextClause;
  }

  public void setFreeTextClause(String freeTextClause) {
    this.freeTextClause = freeTextClause;
  }

  public Long getNoOfPeriods() {
    return noOfPeriods;
  }

  public void setNoOfPeriods(Long noOfPeriods) {
    this.noOfPeriods = noOfPeriods;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getValidPeriod() {
    return validPeriod;
  }

  public void setValidPeriod(String validPeriod) {
    this.validPeriod = validPeriod;
  }

  public String getClauseTypeCq() {
    return clauseTypeCq;
  }

  public void setClauseTypeCq(String clauseTypeCq) {
    this.clauseTypeCq = clauseTypeCq;
  }

  public ClauseIdCq getClauseId() {
    return clauseId;
  }

  public void setClauseId(ClauseIdCq clauseId) {
    this.clauseId = clauseId;
  }
}

