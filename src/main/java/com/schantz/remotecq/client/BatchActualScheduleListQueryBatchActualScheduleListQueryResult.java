package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class BatchActualScheduleListQueryBatchActualScheduleListQueryResult implements Serializable {
	@JsonProperty("startDate")
	private OffsetDateTime startDate = null;
	
	@JsonProperty("endDate")
	private OffsetDateTime endDate = null;
	
	
	public OffsetDateTime getStartDate() {
		return startDate;
	}
	
	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}
	
	public OffsetDateTime getEndDate() {
		return endDate;
	}
	
	public void setEndDate(OffsetDateTime endDate) {
		this.endDate = endDate;
	}
}

