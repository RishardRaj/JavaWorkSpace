package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.target.ArithmeticService;

public class AspectJAOPAnnotationsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ArithmeticService proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		proxy=ctx.getBean("as",ArithmeticService.class);
		
		//call method 
		System.out.println("Sum="+proxy.add(10,20));
		System.out.println("---------------------------------");
		System.out.println("Sub="+proxy.sub(10,20));
		System.out.println("---------------------------------");
		System.out.println("Mul="+proxy.mul(10,20));
		System.out.println("---------------------------------");
		System.out.println("Div="+proxy.div(10,0));
		System.out.println("---------------------------------");
      		
		
		 //close IOC container
		((AbstractApplicationContext) ctx).close();
	
	}//main
}//class

