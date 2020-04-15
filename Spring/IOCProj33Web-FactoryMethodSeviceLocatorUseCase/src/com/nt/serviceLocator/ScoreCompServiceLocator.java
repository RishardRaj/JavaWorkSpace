package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import com.nt.extenal.ScoreComp;
import com.nt.extenal.ScoreCompImpl;

public class ScoreCompServiceLocator{
	private static Map<String,ScoreComp> cache=new HashMap<String,ScoreComp>();
  
	/*public static  ScoreComp getService(){
		//actually we need jndi lookup code here to gather extenal comp ref
		if(!cache.containsKey("icc")){
			cache.put("icc",new ScoreCompImpl());
		}
		return cache.get("icc");
	}*/
	
	public   ScoreComp getService(){
		//actually we need jndi lookup code here to gather extenal comp ref
		if(!cache.containsKey("icc")){
			cache.put("icc",new ScoreCompImpl());
		}
		return cache.get("icc");
	}
	
}
