package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EiConnectionTestDataCq implements Serializable {
	@JsonProperty("errorsCollection")
	private List<EiErrorMessageCq> errorsCollection = new ArrayList<EiErrorMessageCq>();
	
	@JsonProperty("isConnectionOk")
	private Boolean isConnectionOk = false;
	
	public EiConnectionTestDataCq addErrorsCollectionItem(EiErrorMessageCq errorsCollectionItem) {
		this.errorsCollection.add(errorsCollectionItem);
		return this;
	}
	
	public List<EiErrorMessageCq> getErrorsCollection() {
		return errorsCollection;
	}
	
	public void setErrorsCollection(List<EiErrorMessageCq> errorsCollection) {
		this.errorsCollection = errorsCollection;
	}
	
	public Boolean getIsConnectionOk() {
		return isConnectionOk;
	}
	
	public void setIsConnectionOk(Boolean isConnectionOk) {
		this.isConnectionOk = isConnectionOk;
	}
}

