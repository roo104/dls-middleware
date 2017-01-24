package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class AuditTrailAgreementQueryAuditTrailAgreementQueryResult implements Serializable {
	@JsonProperty("agreementId")
	private AgreementIdCq agreementId = null;
	
	@JsonProperty("transactionalViewAt")
	private OffsetDateTime transactionalViewAt = null;
	
	@JsonProperty("logicalViewAt")
	private LocalDate logicalViewAt = null;
	
	@JsonProperty("isAlsoCancelled")
	private Boolean isAlsoCancelled = false;
	
	
	public AgreementIdCq getAgreementId() {
		return agreementId;
	}
	
	public void setAgreementId(AgreementIdCq agreementId) {
		this.agreementId = agreementId;
	}
	
	public OffsetDateTime getTransactionalViewAt() {
		return transactionalViewAt;
	}
	
	public void setTransactionalViewAt(OffsetDateTime transactionalViewAt) {
		this.transactionalViewAt = transactionalViewAt;
	}
	
	public LocalDate getLogicalViewAt() {
		return logicalViewAt;
	}
	
	public void setLogicalViewAt(LocalDate logicalViewAt) {
		this.logicalViewAt = logicalViewAt;
	}
	
	public Boolean getIsAlsoCancelled() {
		return isAlsoCancelled;
	}
	
	public void setIsAlsoCancelled(Boolean isAlsoCancelled) {
		this.isAlsoCancelled = isAlsoCancelled;
	}
}

