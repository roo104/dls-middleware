package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class MoveItemToPayabelsReceiverCommand implements Serializable {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("receiver")
  private String receiver = null;

  @JsonProperty("valueDate")
  private LocalDate valueDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("accountItemId")
  private Long accountItemId = null;

  @JsonProperty("oiAccountTypeCq")
  private String oiAccountTypeCq = null;

  @JsonProperty("oiAccountVoucherTypeCq")
  private String oiAccountVoucherTypeCq = null;


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public LocalDate getValueDate() {
    return valueDate;
  }

  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getAccountItemId() {
    return accountItemId;
  }

  public void setAccountItemId(Long accountItemId) {
    this.accountItemId = accountItemId;
  }

  public String getOiAccountTypeCq() {
    return oiAccountTypeCq;
  }

  public void setOiAccountTypeCq(String oiAccountTypeCq) {
    this.oiAccountTypeCq = oiAccountTypeCq;
  }

  public String getOiAccountVoucherTypeCq() {
    return oiAccountVoucherTypeCq;
  }

  public void setOiAccountVoucherTypeCq(String oiAccountVoucherTypeCq) {
    this.oiAccountVoucherTypeCq = oiAccountVoucherTypeCq;
  }
}

