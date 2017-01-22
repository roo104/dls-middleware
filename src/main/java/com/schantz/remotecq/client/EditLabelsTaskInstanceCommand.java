package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class EditLabelsTaskInstanceCommand implements Serializable {
  @JsonProperty("processInstanceStateIdCq")
  private ProcessInstanceStateIdCq processInstanceStateIdCq = null;

  @JsonProperty("taskLabelCqCollection")
  private List<TaskLabelCq> taskLabelCqCollection = new ArrayList<TaskLabelCq>();


  public ProcessInstanceStateIdCq getProcessInstanceStateIdCq() {
    return processInstanceStateIdCq;
  }

  public void setProcessInstanceStateIdCq(ProcessInstanceStateIdCq processInstanceStateIdCq) {
    this.processInstanceStateIdCq = processInstanceStateIdCq;
  }
  public EditLabelsTaskInstanceCommand addTaskLabelCqCollectionItem(TaskLabelCq taskLabelCqCollectionItem) {
    this.taskLabelCqCollection.add(taskLabelCqCollectionItem);
    return this;
  }

  public List<TaskLabelCq> getTaskLabelCqCollection() {
    return taskLabelCqCollection;
  }

  public void setTaskLabelCqCollection(List<TaskLabelCq> taskLabelCqCollection) {
    this.taskLabelCqCollection = taskLabelCqCollection;
  }
}

