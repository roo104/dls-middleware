package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class TestChangeSystemTimeCommand implements Serializable {
	@JsonProperty("newSystemTime")
	private OffsetDateTime newSystemTime = null;
	
	@JsonProperty("updateAdvanceDates")
	private Boolean updateAdvanceDates = false;
	
	@JsonProperty("ignorePastTime")
	private Boolean ignorePastTime = false;
	
	
	public OffsetDateTime getNewSystemTime() {
		return newSystemTime;
	}
	
	public void setNewSystemTime(OffsetDateTime newSystemTime) {
		this.newSystemTime = newSystemTime;
	}
	
	public Boolean getUpdateAdvanceDates() {
		return updateAdvanceDates;
	}
	
	public void setUpdateAdvanceDates(Boolean updateAdvanceDates) {
		this.updateAdvanceDates = updateAdvanceDates;
	}
	
	public Boolean getIgnorePastTime() {
		return ignorePastTime;
	}
	
	public void setIgnorePastTime(Boolean ignorePastTime) {
		this.ignorePastTime = ignorePastTime;
	}
}

