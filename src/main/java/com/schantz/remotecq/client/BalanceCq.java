package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class BalanceCq implements Serializable {
  @JsonProperty("firstOrderBalance")
  private Double firstOrderBalance = null;

  @JsonProperty("secondOrderBalance")
  private Double secondOrderBalance = null;


  public Double getFirstOrderBalance() {
    return firstOrderBalance;
  }

  public void setFirstOrderBalance(Double firstOrderBalance) {
    this.firstOrderBalance = firstOrderBalance;
  }

  public Double getSecondOrderBalance() {
    return secondOrderBalance;
  }

  public void setSecondOrderBalance(Double secondOrderBalance) {
    this.secondOrderBalance = secondOrderBalance;
  }
}

