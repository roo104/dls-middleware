package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;
public class EditTemplatePrintCommand implements Serializable {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("outOfService")
  private Boolean outOfService = false;

  @JsonProperty("cancelled")
  private Boolean cancelled = false;

  @JsonProperty("editMe")
  private PrintTemplateIdCq editMe = null;

  @JsonProperty("printTemplateTypeCq")
  private String printTemplateTypeCq = null;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean getOutOfService() {
    return outOfService;
  }

  public void setOutOfService(Boolean outOfService) {
    this.outOfService = outOfService;
  }

  public Boolean getCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public PrintTemplateIdCq getEditMe() {
    return editMe;
  }

  public void setEditMe(PrintTemplateIdCq editMe) {
    this.editMe = editMe;
  }

  public String getPrintTemplateTypeCq() {
    return printTemplateTypeCq;
  }

  public void setPrintTemplateTypeCq(String printTemplateTypeCq) {
    this.printTemplateTypeCq = printTemplateTypeCq;
  }
}

