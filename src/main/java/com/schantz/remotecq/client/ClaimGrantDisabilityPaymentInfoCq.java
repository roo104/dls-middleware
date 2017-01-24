package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ClaimGrantDisabilityPaymentInfoCq implements Serializable {
	@JsonProperty("voucherType")
	private String voucherType = null;
	
	@JsonProperty("oiAccountVoucherCq")
	private OiAccountVoucherCq oiAccountVoucherCq = null;
	
	@JsonProperty("legalPartyIdCq")
	private LegalPartyIdCq legalPartyIdCq = null;
	
	
	public String getVoucherType() {
		return voucherType;
	}
	
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	
	public OiAccountVoucherCq getOiAccountVoucherCq() {
		return oiAccountVoucherCq;
	}
	
	public void setOiAccountVoucherCq(OiAccountVoucherCq oiAccountVoucherCq) {
		this.oiAccountVoucherCq = oiAccountVoucherCq;
	}
	
	public LegalPartyIdCq getLegalPartyIdCq() {
		return legalPartyIdCq;
	}
	
	public void setLegalPartyIdCq(LegalPartyIdCq legalPartyIdCq) {
		this.legalPartyIdCq = legalPartyIdCq;
	}
}

