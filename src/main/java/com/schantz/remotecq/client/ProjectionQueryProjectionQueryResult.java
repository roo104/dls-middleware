package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ProjectionQueryProjectionQueryResult implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("eventInclusionIdCq")
	private EventInclusionIdCq eventInclusionIdCq = null;
	
	@JsonProperty("projectionTimeSpecCq")
	private ProjectionTimeSpecCq projectionTimeSpecCq = null;
	
	@JsonProperty("projectionScenarioCq")
	private String projectionScenarioCq = null;
	
	@JsonProperty("projectionPerspectiveCq")
	private String projectionPerspectiveCq = null;
	
	@JsonProperty("periodLengthCq")
	private String periodLengthCq = null;
	
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public PolicyIdCq getPolicyIdCq() {
		return policyIdCq;
	}
	
	public void setPolicyIdCq(PolicyIdCq policyIdCq) {
		this.policyIdCq = policyIdCq;
	}
	
	public EventInclusionIdCq getEventInclusionIdCq() {
		return eventInclusionIdCq;
	}
	
	public void setEventInclusionIdCq(EventInclusionIdCq eventInclusionIdCq) {
		this.eventInclusionIdCq = eventInclusionIdCq;
	}
	
	public ProjectionTimeSpecCq getProjectionTimeSpecCq() {
		return projectionTimeSpecCq;
	}
	
	public void setProjectionTimeSpecCq(ProjectionTimeSpecCq projectionTimeSpecCq) {
		this.projectionTimeSpecCq = projectionTimeSpecCq;
	}
	
	public String getProjectionScenarioCq() {
		return projectionScenarioCq;
	}
	
	public void setProjectionScenarioCq(String projectionScenarioCq) {
		this.projectionScenarioCq = projectionScenarioCq;
	}
	
	public String getProjectionPerspectiveCq() {
		return projectionPerspectiveCq;
	}
	
	public void setProjectionPerspectiveCq(String projectionPerspectiveCq) {
		this.projectionPerspectiveCq = projectionPerspectiveCq;
	}
	
	public String getPeriodLengthCq() {
		return periodLengthCq;
	}
	
	public void setPeriodLengthCq(String periodLengthCq) {
		this.periodLengthCq = periodLengthCq;
	}
}

