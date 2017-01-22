package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class CreateCommentTaskInstanceCommand implements Serializable {
  @JsonProperty("processInstanceStateIdCq")
  private ProcessInstanceStateIdCq processInstanceStateIdCq = null;

  @JsonProperty("comment")
  private String comment = null;


  public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
    return processInstanceStateIdCq;
  }

  public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
    this.processInstanceStateIdCq = processInstanceStateIdCq;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}

