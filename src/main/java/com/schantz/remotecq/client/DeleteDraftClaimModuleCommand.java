package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class DeleteDraftClaimModuleCommand implements Serializable {
	@JsonProperty("deleteMe")
	private ClaimModuleVersionIdCq deleteMe = null;
	
	
	public ClaimModuleVersionIdCq getDeleteMe() {
		return deleteMe;
	}
	
	public void setDeleteMe(ClaimModuleVersionIdCq deleteMe) {
		this.deleteMe = deleteMe;
	}
}

