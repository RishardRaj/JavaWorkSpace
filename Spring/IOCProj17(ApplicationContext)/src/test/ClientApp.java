package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishGenerator bean=null;
		String result=null;
		//create IOC Container
		//ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get Bean
		bean=ctx.getBean("wish",WishGenerator.class);
       	result=bean.generateWishMsg("raja");
       	System.out.println("Wish Message:::"+result);
       	
       	//stop container
       	((ClassPathXmlApplicationContext)ctx).close();
		
			
	}// main
}// class
