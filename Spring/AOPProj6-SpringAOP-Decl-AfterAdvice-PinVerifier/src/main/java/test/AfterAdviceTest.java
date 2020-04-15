package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.target.ATMPinGenerator;

public class AfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ATMPinGenerator proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",ATMPinGenerator.class);
		//call b.method
		System.out.println("Generated Pin::"+proxy.generatePin());
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
