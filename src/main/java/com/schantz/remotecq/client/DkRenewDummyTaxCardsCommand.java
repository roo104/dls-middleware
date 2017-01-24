package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DkRenewDummyTaxCardsCommand implements Serializable {
	@JsonProperty("isAlsoRenewNextYear")
	private Boolean isAlsoRenewNextYear = false;
	
	
	public Boolean getIsAlsoRenewNextYear() {
		return isAlsoRenewNextYear;
	}
	
	public void setIsAlsoRenewNextYear(Boolean isAlsoRenewNextYear) {
		this.isAlsoRenewNextYear = isAlsoRenewNextYear;
	}
}

