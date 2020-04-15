package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.target.IntrAmtCalculator;
import com.nt.target.IntrAmtCalculatorInterface;

public class AspectJAOPAroundTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculatorInterface proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		proxy=ctx.getBean("iac",IntrAmtCalculatorInterface.class);
		
		//call method 
		System.out.println("Simple Intr Amt===>"+proxy.calcSimpleIntrAmt(9000,2, 10));
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Simple Intr Amt===>"+proxy.calcSimpleIntrAmt(9000,2, 10));
		System.out.println("==============================================");
		System.out.println("Compound Intr Amt===>"+proxy.calcCompoundIntrAmt(20000,2, 10));
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Compound Intr Amt===>"+proxy.calcCompoundIntrAmt(20000,2, 10));
		
		System.out.println("Proxy obj class name:"+proxy.getClass());
	}//main
}//class

