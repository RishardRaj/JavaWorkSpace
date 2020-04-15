package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AutowiredTest {
   public static void main(String[] args) {
	   ApplicationContext ctx=null;
	   Viechle viechle=null,viechle1;
	   //create IOC container
	   ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	   //get Bean
	   viechle=ctx.getBean("viechle",Viechle.class);
	   System.out.println(viechle);
	   viechle1=ctx.getBean("viechle",Viechle.class);
	   System.out.println(viechle.hashCode()+"   "+viechle1.hashCode());
	  ((AbstractApplicationContext) ctx).close();
   }//main
}//class
