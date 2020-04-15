package com.nt.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCPerfomanceMonitoringListener implements ApplicationListener<ApplicationEvent> {
  private long start=0,end=0;
	public void onApplicationEvent(ApplicationEvent  ae) {
		if(ae.toString().indexOf("ContextRefreshed")!=-1)
			start=System.currentTimeMillis();
		else if(ae.toString().indexOf("ContextClosedEvent")!=-1){
			end=System.currentTimeMillis();
	     	System.out.println("IOC container is running mode for"+(end-start)+"  ms");
		}
	}//method
}//class
