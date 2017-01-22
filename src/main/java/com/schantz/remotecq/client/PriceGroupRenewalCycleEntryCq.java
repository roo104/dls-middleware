package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class PriceGroupRenewalCycleEntryCq implements Serializable {
  @JsonProperty("dayOfMonth")
  private Long dayOfMonth = null;

  @JsonProperty("monthOfYear")
  private Long monthOfYear = null;


  public Long getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(Long dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public Long getMonthOfYear() {
    return monthOfYear;
  }

  public void setMonthOfYear(Long monthOfYear) {
    this.monthOfYear = monthOfYear;
  }
}

