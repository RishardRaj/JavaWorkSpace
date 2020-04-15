package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.DBOperations;

public class ClientApp {

	public static void main(String[] args) {
	  ApplicationContext ctx=null;
	  DBOperations dbo=null;
	  //Create IOC container
	  ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	  //get Bean
	 dbo=ctx.getBean("dbo",DBOperations.class);
	 System.out.println("injected values:::"+dbo);
	 
	 ((AbstractApplicationContext) ctx).close();
	}
}
