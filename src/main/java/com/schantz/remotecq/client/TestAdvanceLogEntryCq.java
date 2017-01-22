package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TestAdvanceLogEntryCq implements Serializable {
  @JsonProperty("systemTime")
  private OffsetDateTime systemTime = null;

  @JsonProperty("nowLogicTIme")
  private OffsetDateTime nowLogicTIme = null;

  @JsonProperty("advanceToDate")
  private LocalDate advanceToDate = null;

  @JsonProperty("causedBy")
  private String causedBy = null;

  @JsonProperty("logMessage")
  private String logMessage = null;

  @JsonProperty("logEntryTypeCq")
  private String logEntryTypeCq = null;

  @JsonProperty("testAdvanceAreaCq")
  private String testAdvanceAreaCq = null;

  @JsonProperty("policyIdCq")
  private PolicyIdCq policyIdCq = null;


  public OffsetDateTime getSystemTime() {
    return systemTime;
  }

  public void setSystemTime(OffsetDateTime systemTime) {
    this.systemTime = systemTime;
  }

  public OffsetDateTime getNowLogicTIme() {
    return nowLogicTIme;
  }

  public void setNowLogicTIme(OffsetDateTime nowLogicTIme) {
    this.nowLogicTIme = nowLogicTIme;
  }

  public LocalDate getAdvanceToDate() {
    return advanceToDate;
  }

  public void setAdvanceToDate(LocalDate advanceToDate) {
    this.advanceToDate = advanceToDate;
  }

  public String getCausedBy() {
    return causedBy;
  }

  public void setCausedBy(String causedBy) {
    this.causedBy = causedBy;
  }

  public String getLogMessage() {
    return logMessage;
  }

  public void setLogMessage(String logMessage) {
    this.logMessage = logMessage;
  }

  public String getLogEntryTypeCq() {
    return logEntryTypeCq;
  }

  public void setLogEntryTypeCq(String logEntryTypeCq) {
    this.logEntryTypeCq = logEntryTypeCq;
  }

  public String getTestAdvanceAreaCq() {
    return testAdvanceAreaCq;
  }

  public void setTestAdvanceAreaCq(String testAdvanceAreaCq) {
    this.testAdvanceAreaCq = testAdvanceAreaCq;
  }

  public PolicyIdCq getPolicyIdCq() {
    return policyIdCq;
  }

  public void setPolicyIdCq(PolicyIdCq policyIdCq) {
    this.policyIdCq = policyIdCq;
  }
}

