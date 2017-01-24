package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class DownloadBatchFileDirQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("batchFileDirExportData")
	private BatchFileDirExportData batchFileDirExportData = null;
	
	public DownloadBatchFileDirQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public BatchFileDirExportData getBatchFileDirExportData() {
		return batchFileDirExportData;
	}
	
	public void setBatchFileDirExportData(BatchFileDirExportData batchFileDirExportData) {
		this.batchFileDirExportData = batchFileDirExportData;
	}
}

