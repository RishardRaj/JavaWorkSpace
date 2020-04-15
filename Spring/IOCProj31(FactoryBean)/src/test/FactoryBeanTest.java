package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.ScheduleRemainder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		 ScheduleRemainder remainder=null;
		//create IOC container
	  ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	  //get Bean
	  remainder=ctx.getBean("remainder",ScheduleRemainder.class);
      remainder.remainder();
     
       //close IOC container
      ((AbstractApplicationContext) ctx).close();
	}

}
