package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class MagicConstantCq implements Serializable {
	@JsonProperty("magicNumber")
	private Long magicNumber = null;
	
	@JsonProperty("entityNameCq")
	private EntityNameCq entityNameCq = null;
	
	@JsonProperty("magicConstantTypeCq")
	private String magicConstantTypeCq = null;
	
	@JsonProperty("longFrameCq")
	private LongFrameCq longFrameCq = null;
	
	
	public Long getMagicNumber() {
		return magicNumber;
	}
	
	public void setMagicNumber(Long magicNumber) {
		this.magicNumber = magicNumber;
	}
	
	public EntityNameCq getEntityNameCq() {
		return entityNameCq;
	}
	
	public void setEntityNameCq(EntityNameCq entityNameCq) {
		this.entityNameCq = entityNameCq;
	}
	
	public String getMagicConstantTypeCq() {
		return magicConstantTypeCq;
	}
	
	public void setMagicConstantTypeCq(String magicConstantTypeCq) {
		this.magicConstantTypeCq = magicConstantTypeCq;
	}
	
	public LongFrameCq getLongFrameCq() {
		return longFrameCq;
	}
	
	public void setLongFrameCq(LongFrameCq longFrameCq) {
		this.longFrameCq = longFrameCq;
	}
}

