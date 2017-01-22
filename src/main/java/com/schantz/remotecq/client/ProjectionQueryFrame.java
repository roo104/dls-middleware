package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ProjectionQueryFrame implements Serializable {
  @JsonProperty("projectionTimeSpecSelectionFrameCq")
  private ProjectionTimeSpecSelectionFrameCq projectionTimeSpecSelectionFrameCq = null;

  @JsonProperty("inflationFrame")
  private EnumSelectionFrameCqProjectionInflationSelectionCq inflationFrame = null;

  @JsonProperty("perspectiveFrame")
  private EnumSelectionFrameCqProjectionPerspectiveCq perspectiveFrame = null;

  @JsonProperty("scenarioFrame")
  private EnumSelectionFrameCqProjectionScenarioCq scenarioFrame = null;

  @JsonProperty("periodLengthFrame")
  private EnumSelectionFrameCqPeriodLengthCq periodLengthFrame = null;


  public ProjectionTimeSpecSelectionFrameCq getProjectionTimeSpecSelectionFrameCq() {
    return projectionTimeSpecSelectionFrameCq;
  }

  public void setProjectionTimeSpecSelectionFrameCq(ProjectionTimeSpecSelectionFrameCq projectionTimeSpecSelectionFrameCq) {
    this.projectionTimeSpecSelectionFrameCq = projectionTimeSpecSelectionFrameCq;
  }

  public EnumSelectionFrameCqProjectionInflationSelectionCq getInflationFrame() {
    return inflationFrame;
  }

  public void setInflationFrame(EnumSelectionFrameCqProjectionInflationSelectionCq inflationFrame) {
    this.inflationFrame = inflationFrame;
  }

  public EnumSelectionFrameCqProjectionPerspectiveCq getPerspectiveFrame() {
    return perspectiveFrame;
  }

  public void setPerspectiveFrame(EnumSelectionFrameCqProjectionPerspectiveCq perspectiveFrame) {
    this.perspectiveFrame = perspectiveFrame;
  }

  public EnumSelectionFrameCqProjectionScenarioCq getScenarioFrame() {
    return scenarioFrame;
  }

  public void setScenarioFrame(EnumSelectionFrameCqProjectionScenarioCq scenarioFrame) {
    this.scenarioFrame = scenarioFrame;
  }

  public EnumSelectionFrameCqPeriodLengthCq getPeriodLengthFrame() {
    return periodLengthFrame;
  }

  public void setPeriodLengthFrame(EnumSelectionFrameCqPeriodLengthCq periodLengthFrame) {
    this.periodLengthFrame = periodLengthFrame;
  }
}

