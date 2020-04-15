package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.target.ArithmeticService;

public class AspjectAOPThrowsAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ArithmeticService proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
       proxy=ctx.getBean("arithmetic",ArithmeticService.class);
       //call method
       System.out.println("Division result:::"+proxy.div(10,20));
       System.out.println("------------------------------------------------");
       try{
       System.out.println("Division reuslt:::"+proxy.div(10,0));
       }
       catch(Exception e){
    	   System.out.println("Client App");
    	   e.printStackTrace();
       }
       //close Container
       ((AbstractApplicationContext) ctx).close();
	}

}
