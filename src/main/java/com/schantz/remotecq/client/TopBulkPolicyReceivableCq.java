package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class TopBulkPolicyReceivableCq implements Serializable {
  @JsonProperty("dueDate")
  private LocalDate dueDate = null;


  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }
}

