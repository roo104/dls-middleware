package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
public class TemplateDocumentDataQueryResult implements Serializable {
  @JsonProperty("preparedLocks")
  private List<CqLock> preparedLocks = new ArrayList<CqLock>();

  @JsonProperty("templateMergedWithMaster")
  private DocumentDataCq templateMergedWithMaster = null;

  @JsonProperty("template")
  private DocumentDataCq template = null;

  public TemplateDocumentDataQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
    this.preparedLocks.add(preparedLocksItem);
    return this;
  }

  public List<CqLock> getPreparedLocks() {
    return preparedLocks;
  }

  public void setPreparedLocks(List<CqLock> preparedLocks) {
    this.preparedLocks = preparedLocks;
  }

  public DocumentDataCq getTemplateMergedWithMaster() {
    return templateMergedWithMaster;
  }

  public void setTemplateMergedWithMaster(DocumentDataCq templateMergedWithMaster) {
    this.templateMergedWithMaster = templateMergedWithMaster;
  }

  public DocumentDataCq getTemplate() {
    return template;
  }

  public void setTemplate(DocumentDataCq template) {
    this.template = template;
  }
}

