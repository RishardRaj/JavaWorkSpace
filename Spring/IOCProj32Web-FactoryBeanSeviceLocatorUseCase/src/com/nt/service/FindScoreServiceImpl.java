package com.nt.service;

import com.nt.extenal.ScoreComp;

public class FindScoreServiceImpl implements FindScoreService {
   private ScoreComp  extenalComp;

	public void setExtenalComp(ScoreComp extenalComp) {
	this.extenalComp = extenalComp;
}

	@Override
	public String getScore(int matchId) {
	  String scoreCard=null;
	   scoreCard=extenalComp.findScore(matchId);
		return scoreCard;
	}
}
