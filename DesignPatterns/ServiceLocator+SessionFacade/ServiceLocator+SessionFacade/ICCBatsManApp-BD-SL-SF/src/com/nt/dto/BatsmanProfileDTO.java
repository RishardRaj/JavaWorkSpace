package com.nt.dto;

import java.io.Serializable;

public class BatsmanProfileDTO implements Serializable {
	private int batsmanId;
	private String fullName;
	private String country;
    private int totalRuns;
    private int matchesCount;
    private int centuriesCount;
    private int halfCenturiesCount;
    private float strikeRate;
    private String highestScore;
	public int getBatsmanId() {
		return batsmanId;
	}
	public void setBatsmanId(int batsmanId) {
		this.batsmanId = batsmanId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public int getMatchesCount() {
		return matchesCount;
	}
	public void setMatchesCount(int matchesCount) {
		this.matchesCount = matchesCount;
	}
	public int getCenturiesCount() {
		return centuriesCount;
	}
	public void setCenturiesCount(int centuriesCount) {
		this.centuriesCount = centuriesCount;
	}
	public int getHalfCenturiesCount() {
		return halfCenturiesCount;
	}
	public void setHalfCenturiesCount(int halfCenturiesCount) {
		this.halfCenturiesCount = halfCenturiesCount;
	}
	public float getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}
	public String getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(String highestScore) {
		this.highestScore = highestScore;
	}
    
    
	

}
