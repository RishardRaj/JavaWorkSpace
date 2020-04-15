package test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.IntrAmountCalculator;


public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmountCalculator calculator=null;
	  //create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
	     calculator=ctx.getBean("iac",IntrAmountCalculator.class);
	     System.out.println("Intr Amount:::"+calculator.calcIntrAmt(100000,20));
	     
	     //System.out.println("Intr Amount1:::"+calculator.calcIntrAmt());
		
	     System.out.println(calculator.getClass()+"....."+calculator.getClass().getSuperclass());
			  //close container
		 ((AbstractApplicationContext) ctx).close();
	}

}
