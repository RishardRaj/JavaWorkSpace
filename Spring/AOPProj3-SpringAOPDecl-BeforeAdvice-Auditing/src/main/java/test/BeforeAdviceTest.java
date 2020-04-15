package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.OrderApprover;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		OrderApprover proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
        proxy=ctx.getBean("pfb",OrderApprover.class);
        //call method
        System.out.println(proxy.approveOrder(-1001));
        //close IOC container
        ((AbstractApplicationContext) ctx).close();
	}//main
}//class
