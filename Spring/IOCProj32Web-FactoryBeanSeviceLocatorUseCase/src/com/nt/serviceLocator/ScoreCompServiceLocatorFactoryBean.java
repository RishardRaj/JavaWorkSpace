package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.extenal.ScoreComp;
import com.nt.extenal.ScoreCompImpl;

public class ScoreCompServiceLocatorFactoryBean implements FactoryBean<ScoreComp>{
  private Map<String,ScoreComp> cache=new HashMap<String,ScoreComp>();
  
	@Override
	public ScoreComp getObject() throws Exception {
		//Actually we need write jndi lookup code.. but we are diretly ExtenalServieclass obj
	   if(!cache.containsKey("icc")){
		   cache.put("icc", new ScoreCompImpl());
	   }
	   return cache.get("icc");
	}

	@Override
	public Class<?> getObjectType() {
				return ScoreComp.class;
	}

	@Override
	public boolean isSingleton() {
			return true;
	}

	
}
