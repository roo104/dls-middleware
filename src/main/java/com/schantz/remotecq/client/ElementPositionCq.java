package com.schantz.remotecq.client;

import java.io.*;

import com.fasterxml.jackson.annotation.*;

public class ElementPositionCq implements Serializable {
	@JsonProperty("positionY")
	private Long positionY = null;
	
	@JsonProperty("positionX")
	private Long positionX = null;
	
	@JsonProperty("configWfc2IdCq")
	private ConfigWfc2IdCq configWfc2IdCq = null;
	
	
	public Long getPositionY() {
		return positionY;
	}
	
	public void setPositionY(Long positionY) {
		this.positionY = positionY;
	}
	
	public Long getPositionX() {
		return positionX;
	}
	
	public void setPositionX(Long positionX) {
		this.positionX = positionX;
	}
	
	public ConfigWfc2IdCq getConfigWfc2IdCq() {
		return configWfc2IdCq;
	}
	
	public void setConfigWfc2IdCq(ConfigWfc2IdCq configWfc2IdCq) {
		this.configWfc2IdCq = configWfc2IdCq;
	}
}

