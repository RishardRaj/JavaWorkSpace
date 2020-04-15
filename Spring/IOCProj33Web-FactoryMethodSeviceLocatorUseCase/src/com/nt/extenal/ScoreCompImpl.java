package com.nt.extenal;

public class ScoreCompImpl implements ScoreComp {
	
	@Override
	public String findScore(int matchId) {
	   if(matchId==345)
		   return "TestMatch:345/6";
	   else if(matchId==567)
		   return "OneDay: 234/9";
	   else
		   return "Wrong MatchId";
	   }//method
	}//class
