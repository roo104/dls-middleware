package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ExcelExportProjectionQueryExcelExportProjectionQueryResult implements Serializable {
	@JsonProperty("startDate")
	private LocalDate startDate = null;
	
	@JsonProperty("policyIdCq")
	private PolicyIdCq policyIdCq = null;
	
	@JsonProperty("eventInclusionIdCq")
	private EventInclusionIdCq eventInclusionIdCq = null;
	
	@JsonProperty("projectionTimeSpecCq")
	private ProjectionTimeSpecCq projectionTimeSpecCq = null;
	
	
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
}

