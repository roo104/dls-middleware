package com.schantz.remotecq.client;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

public class ChangeAccountNoCommand implements Serializable {
	@JsonProperty("legalPartyId")
	private LegalPartyIdCq legalPartyId = null;
	
	@JsonProperty("dkAccountInformationCqCollection")
	private List<DkAccountInformationCq> dkAccountInformationCqCollection = new ArrayList<DkAccountInformationCq>();
	
	
	public LegalPartyIdCq getLegalPartyId() {
		return legalPartyId;
	}
	
	public void setLegalPartyId(LegalPartyIdCq legalPartyId) {
		this.legalPartyId = legalPartyId;
	}
	
	public ChangeAccountNoCommand addDkAccountInformationCqCollectionItem(DkAccountInformationCq dkAccountInformationCqCollectionItem) {
		this.dkAccountInformationCqCollection.add(dkAccountInformationCqCollectionItem);
		return this;
	}
	
	public List<DkAccountInformationCq> getDkAccountInformationCqCollection() {
		return dkAccountInformationCqCollection;
	}
	
	public void setDkAccountInformationCqCollection(List<DkAccountInformationCq> dkAccountInformationCqCollection) {
		this.dkAccountInformationCqCollection = dkAccountInformationCqCollection;
	}
}

