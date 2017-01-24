package com.schantz.remotecq.client;

import java.io.*;
import java.time.*;

import com.fasterxml.jackson.annotation.*;

public class ActiveVersionIdListAgreementQueryActiveVersionIdListAgreementQueryResult implements Serializable {
	@JsonProperty("transDate")
	private OffsetDateTime transDate = null;
	
	
	public OffsetDateTime getTransDate() {
		return transDate;
	}
	
	public void setTransDate(OffsetDateTime transDate) {
		this.transDate = transDate;
	}
}

