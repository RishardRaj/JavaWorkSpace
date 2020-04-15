package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.target.ShoppingStore;

public class AfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ShoppingStore proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",ShoppingStore.class);
		//call b.method
		System.out.println("Bill Amount::"+proxy.purchase("shirts",5000, -5));
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
