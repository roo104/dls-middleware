package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;
public class ProjectionTimeSpecSelectionFrameCq implements Serializable {
  @JsonProperty("defaultTimeSpec")
  private ProjectionTimeSpecCq defaultTimeSpec = null;

  @JsonProperty("timeSpecMethodFrame")
  private EnumSelectionFrameCqProjectionTimeSpecMethodCq timeSpecMethodFrame = null;


  public ProjectionTimeSpecCq getDefaultTimeSpec() {
    return defaultTimeSpec;
  }

  public void setDefaultTimeSpec(ProjectionTimeSpecCq defaultTimeSpec) {
    this.defaultTimeSpec = defaultTimeSpec;
  }

  public EnumSelectionFrameCqProjectionTimeSpecMethodCq getTimeSpecMethodFrame() {
    return timeSpecMethodFrame;
  }

  public void setTimeSpecMethodFrame(EnumSelectionFrameCqProjectionTimeSpecMethodCq timeSpecMethodFrame) {
    this.timeSpecMethodFrame = timeSpecMethodFrame;
  }
}

