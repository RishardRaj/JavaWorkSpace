package com.nt.beans;

public class Engine {
	private int engineId;
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
