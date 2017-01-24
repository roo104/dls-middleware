package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class AdvanceStateCq implements Serializable {
	@JsonProperty("advanceToDate")
	private LocalDate advanceToDate = null;
	
	@JsonProperty("lifeEventTypeCq")
	private LifeEventTypeCq lifeEventTypeCq = null;
	
	
	public LocalDate getAdvanceToDate() {
		return advanceToDate;
	}
	
	public void setAdvanceToDate(LocalDate advanceToDate) {
		this.advanceToDate = advanceToDate;
	}
	
	public LifeEventTypeCq getLifeEventTypeCq() {
		return lifeEventTypeCq;
	}
	
	public void setLifeEventTypeCq(LifeEventTypeCq lifeEventTypeCq) {
		this.lifeEventTypeCq = lifeEventTypeCq;
	}
}

