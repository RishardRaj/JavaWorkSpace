package test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtCalculatorInterface;

public class AopAroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculatorInterface proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",IntrAmtCalculatorInterface.class);
	/*	System.out.println("proxy object class"+proxy.getClass());
		System.out.println("proxy class super class"+proxy.getClass().getSuperclass());
		System.out.println("proxy class implemented interfaces"+Arrays.toString(proxy.getClass().getInterfaces()));*/
		//call b.method
		System.out.println("Client App--> Intr Amount"+proxy.calcIntrAmt(20000, 2,20));
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Client App--> Intr Amount"+proxy.calcIntrAmt(20000, 2,20));
   //close IOC contianer
		 ((AbstractApplicationContext) ctx).close();
	
	}

}
