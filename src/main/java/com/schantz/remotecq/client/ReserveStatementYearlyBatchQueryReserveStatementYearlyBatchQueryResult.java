package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ReserveStatementYearlyBatchQueryReserveStatementYearlyBatchQueryResult implements Serializable {
	@JsonProperty("policyStartDate")
	private LocalDate policyStartDate = null;
	
	
	public LocalDate getPolicyStartDate() {
		return policyStartDate;
	}
	
	public void setPolicyStartDate(LocalDate policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
}

