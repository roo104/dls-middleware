package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class MoveItemToManualReceivedCommand implements Serializable {
  @JsonProperty("oiAccountItemId")
  private OiAccountItemIdCq oiAccountItemId = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("valueDate")
  private LocalDate valueDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("oiAccountVoucherTypeCq")
  private String oiAccountVoucherTypeCq = null;


  public OiAccountItemIdCq getOiAccountItemId() {
    return oiAccountItemId;
  }

  public void setOiAccountItemId(OiAccountItemIdCq oiAccountItemId) {
    this.oiAccountItemId = oiAccountItemId;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
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

  public String getOiAccountVoucherTypeCq() {
    return oiAccountVoucherTypeCq;
  }

  public void setOiAccountVoucherTypeCq(String oiAccountVoucherTypeCq) {
    this.oiAccountVoucherTypeCq = oiAccountVoucherTypeCq;
  }
}

