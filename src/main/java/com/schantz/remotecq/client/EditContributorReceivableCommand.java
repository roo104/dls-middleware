package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class EditContributorReceivableCommand implements Serializable {
	@JsonProperty("editContributorReceivableCq")
	private EditContributorReceivableCq editContributorReceivableCq = null;
	
	
	public EditContributorReceivableCq getEditContributorReceivableCq() {
		return editContributorReceivableCq;
	}
	
	public void setEditContributorReceivableCq(EditContributorReceivableCq editContributorReceivableCq) {
		this.editContributorReceivableCq = editContributorReceivableCq;
	}
}

