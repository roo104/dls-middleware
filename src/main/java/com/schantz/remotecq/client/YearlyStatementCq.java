package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class YearlyStatementCq implements Serializable {
  @JsonProperty("transactionDate")
  private LocalDate transactionDate = null;

  @JsonProperty("year")
  private Long year = null;

  @JsonProperty("yearlyStatementDataCq")
  private YearlyStatementDataCq yearlyStatementDataCq = null;

  @JsonProperty("isHardClosed")
  private Boolean isHardClosed = false;


  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }

  public YearlyStatementDataCq getYearlyStatementDataCq() {
    return yearlyStatementDataCq;
  }

  public void setYearlyStatementDataCq(YearlyStatementDataCq yearlyStatementDataCq) {
    this.yearlyStatementDataCq = yearlyStatementDataCq;
  }

  public Boolean getIsHardClosed() {
    return isHardClosed;
  }

  public void setIsHardClosed(Boolean isHardClosed) {
    this.isHardClosed = isHardClosed;
  }
}

