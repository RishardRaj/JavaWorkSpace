package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspect.AuthenticationManager;
import com.nt.target.IntrAmtCalculator;

public class SecurityCheckAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationManager asm=null;
		IntrAmtCalculator proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get AuthenticationManager class
		asm=ctx.getBean("asm",AuthenticationManager.class);
		//perform signIN  opeation
		asm.signIn("raja","rani1");
		//Get Proxy obj
		proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		//call b.method
		 System.out.println("Intr Amount:"+proxy.calcIntrAmt(10000,2, 20));
		 //signOut
		 asm.signOut();
		 //close IOC container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
