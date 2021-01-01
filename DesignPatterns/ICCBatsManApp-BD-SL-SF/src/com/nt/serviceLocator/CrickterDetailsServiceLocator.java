package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import com.nt.icc.ext3facade.ICCCrickterDetailsFinderFacade;
import com.nt.icc.ext3facade.ICCCrickterDetailsFinderFacadeImpl;

public class CrickterDetailsServiceLocator {
	private static CrickterDetailsServiceLocator locator=null;
	private Map<String,ICCCrickterDetailsFinderFacade> cache=new HashMap<String,ICCCrickterDetailsFinderFacade>();
	
	private CrickterDetailsServiceLocator(){
		
	}
	
	public static CrickterDetailsServiceLocator getInstance(){
		if(locator==null){
		 synchronized(CrickterDetailsServiceLocator.class){
			 if(locator==null)
				  locator=new CrickterDetailsServiceLocator();
		   }
		}
		 return locator;
	}
	
	public  ICCCrickterDetailsFinderFacade  getService(String jndiName){
		 ICCCrickterDetailsFinderFacade comp=null;
		 if(!cache.containsKey(jndiName)){
			 comp=new ICCCrickterDetailsFinderFacadeImpl();
			 cache.put(jndiName,comp);
		 }
		 else{
			 comp=cache.get(jndiName);
		 }
		 return comp;
	}//method
}//class
