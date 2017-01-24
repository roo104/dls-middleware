package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class VersionDetailsAgreementQueryResult implements Serializable {
	@JsonProperty("preparedLocks")
	private List<CqLock> preparedLocks = new ArrayList<CqLock>();
	
	@JsonProperty("agreementVersionDetailsCq")
	private AgreementVersionDetailsCq agreementVersionDetailsCq = null;
	
	public VersionDetailsAgreementQueryResult addPreparedLocksItem(CqLock preparedLocksItem) {
		this.preparedLocks.add(preparedLocksItem);
		return this;
	}
	
	public List<CqLock> getPreparedLocks() {
		return preparedLocks;
	}
	
	public void setPreparedLocks(List<CqLock> preparedLocks) {
		this.preparedLocks = preparedLocks;
	}
	
	public AgreementVersionDetailsCq getAgreementVersionDetailsCq() {
		return agreementVersionDetailsCq;
	}
	
	public void setAgreementVersionDetailsCq(AgreementVersionDetailsCq agreementVersionDetailsCq) {
		this.agreementVersionDetailsCq = agreementVersionDetailsCq;
	}
}

