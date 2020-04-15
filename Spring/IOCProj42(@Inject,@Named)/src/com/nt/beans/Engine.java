package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("engine")
public class Engine {
	@Value("1001")
	private int engineId;
	@Value("petrol")
	private String engineType;
	
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineType=" + engineType + "]";
	}
	
	

}
