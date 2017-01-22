package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class EditDueDateTaskInstanceCommand implements Serializable {
  @JsonProperty("processInstanceStateIdCq")
  private ProcessInstanceStateIdCq processInstanceStateIdCq = null;

  @JsonProperty("dueDate")
  private LocalDate dueDate = null;


  public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
    return processInstanceStateIdCq;
  }

  public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
    this.processInstanceStateIdCq = processInstanceStateIdCq;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }
}

