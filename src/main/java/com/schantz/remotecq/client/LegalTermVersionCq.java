package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class LegalTermVersionCq implements Serializable {
	@JsonProperty("legalTermVersionIdCq")
	private LegalTermVersionIdCq legalTermVersionIdCq = null;
	
	@JsonProperty("legalTermCq")
	private LegalTermCq legalTermCq = null;
	
	@JsonProperty("termScopeCq")
	private TermScopeCq termScopeCq = null;
	
	@JsonProperty("replacedBy")
	private LegalTermVersionCq replacedBy = null;
	
	@JsonProperty("url")
	private String url = null;
	
	
	public LegalTermVersionIdCq getLegalTermVersionIdCq() {
		return legalTermVersionIdCq;
	}
	
	public void setLegalTermVersionIdCq(LegalTermVersionIdCq legalTermVersionIdCq) {
		this.legalTermVersionIdCq = legalTermVersionIdCq;
	}
	
	public LegalTermCq getLegalTermCq() {
		return legalTermCq;
	}
	
	public void setLegalTermCq(LegalTermCq legalTermCq) {
		this.legalTermCq = legalTermCq;
	}
	
	public TermScopeCq getTermScopeCq() {
		return termScopeCq;
	}
	
	public void setTermScopeCq(TermScopeCq termScopeCq) {
		this.termScopeCq = termScopeCq;
	}
	
	public LegalTermVersionCq getReplacedBy() {
		return replacedBy;
	}
	
	public void setReplacedBy(LegalTermVersionCq replacedBy) {
		this.replacedBy = replacedBy;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
}

