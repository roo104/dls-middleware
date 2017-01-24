package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class BatchScheduleListExportQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("exportData")
	private BatchScheduleExportDataCq exportData = null;
	
	public BatchScheduleListExportQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchScheduleExportDataCq getExportData() {
		return exportData;
	}
	
	public void setExportData(BatchScheduleExportDataCq exportData) {
		this.exportData = exportData;
	}
}

