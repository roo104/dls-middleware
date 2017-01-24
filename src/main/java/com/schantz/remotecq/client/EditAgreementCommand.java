package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class EditAgreementCommand implements Serializable {
	@JsonProperty("agreementDeltaCqCollection")
	private List<AgreementDeltaCq> agreementDeltaCqCollection = new ArrayList<AgreementDeltaCq>();
	
	@JsonProperty("draftId")
	private AgreementVersionIdCq draftId = null;
	
	public EditAgreementCommand addAgreementDeltaCqCollectionItem(AgreementDeltaCq agreementDeltaCqCollectionItem) {
		this.agreementDeltaCqCollection.add(agreementDeltaCqCollectionItem);
		return this;
	}
	
	public List<AgreementDeltaCq> getAgreementDeltaCqCollection() {
		return agreementDeltaCqCollection;
	}
	
	public void setAgreementDeltaCqCollection(List<AgreementDeltaCq> agreementDeltaCqCollection) {
		this.agreementDeltaCqCollection = agreementDeltaCqCollection;
	}
	
	public AgreementVersionIdCq getDraftId() {
		return draftId;
	}
	
	public void setDraftId(AgreementVersionIdCq draftId) {
		this.draftId = draftId;
	}
}

