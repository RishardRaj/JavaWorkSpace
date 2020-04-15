package test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AOPPointcutsTest {

	public static void main(String[] args) {
	ApplicationContext ctx=null;
	com.nt.target.Math proxy=null;
		//create IOC container
	ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	//get Proxy object
	proxy=ctx.getBean("pfb",com.nt.target.Math.class);
     //call b.methods
     System.out.println("add="+proxy.add(1000,2000));
     System.out.println("==========================");
     System.out.println("add="+proxy.add(1000,2000));
     System.out.println("==========================");
     System.out.println("add="+proxy.add(10,20));
     System.out.println("==========================");
     System.out.println("sub="+proxy.sub(10,20));
     System.out.println("==========================");
     System.out.println("mul="+proxy.mul(2000,2000));
     System.out.println("==========================");
     System.out.println("mul="+proxy.mul(2000,2000));
     System.out.println("==========================");
     
     System.out.println("div="+proxy.div(20,10));
     System.out.println("==========================");
     System.out.println(Arrays.toString(proxy.getClass().getDeclaredMethods()));
	}//main
}//class
