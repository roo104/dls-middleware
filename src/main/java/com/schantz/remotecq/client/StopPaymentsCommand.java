package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class StopPaymentsCommand implements Serializable {
	@JsonProperty("legalPartyId")
	private LegalPartyIdCq legalPartyId = null;
	
	
	public LegalPartyIdCq getLegalPartyId() {
		return legalPartyId;
	}
	
	public void setLegalPartyId(LegalPartyIdCq legalPartyId) {
		this.legalPartyId = legalPartyId;
	}
}

