package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class GeneralLifeNowQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("systemTime")
	private OffsetDateTime systemTime = null;
	
	@JsonProperty("advanceDate")
	private LocalDate advanceDate = null;
	
	public GeneralLifeNowQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public OffsetDateTime getSystemTime() {
		return systemTime;
	}
	
	public void setSystemTime(OffsetDateTime systemTime) {
		this.systemTime = systemTime;
	}
	
	public LocalDate getAdvanceDate() {
		return advanceDate;
	}
	
	public void setAdvanceDate(LocalDate advanceDate) {
		this.advanceDate = advanceDate;
	}
}

