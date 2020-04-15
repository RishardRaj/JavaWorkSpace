package test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyServletContainer container=null;
	  //create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		container=ctx.getBean("container",MyServletContainer.class);
		 container.handle("world 7 wonders");
		 container.handle("india 7 wonders");
		 System.out.println(container.getClass()+"...."+container.getClass().getSuperclass()+"..."+Arrays.toString(container.getClass().getDeclaredMethods()) );
			  //close container
		 ((AbstractApplicationContext) ctx).close();
	}

}
