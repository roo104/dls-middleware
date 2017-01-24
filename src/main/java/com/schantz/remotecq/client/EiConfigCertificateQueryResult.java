package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EiConfigCertificateQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("certificateData")
	private EiConfigCertificateDataCq certificateData = null;
	
	public EiConfigCertificateQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public EiConfigCertificateDataCq getCertificateData() {
		return certificateData;
	}
	
	public void setCertificateData(EiConfigCertificateDataCq certificateData) {
		this.certificateData = certificateData;
	}
}

