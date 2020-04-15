package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.target.ShoppingStore;

public class AspjectAOPAfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ShoppingStore proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
       proxy=ctx.getBean("shopping",ShoppingStore.class);
       //call method
       System.out.println("Shopping Bill Amount::"+proxy.purchase(new String[]{"shirt"},1000.0f,1.0f));
       
       //close Container
       ((AbstractApplicationContext) ctx).close();
	}

}
