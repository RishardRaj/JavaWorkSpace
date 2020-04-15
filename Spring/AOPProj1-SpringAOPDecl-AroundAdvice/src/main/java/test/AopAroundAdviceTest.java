package test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.IntrAmtCalculator;

public class AopAroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculator proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		//call b.method
		System.out.println("Client App--> Intr Amount"+proxy.calcIntrAmt(20000, 2,20));
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Client App--> Intr Amount"+proxy.calcIntrAmt(20000, 2,20));
   //close IOC contianer
		 ((AbstractApplicationContext) ctx).close();
	
	}

}
