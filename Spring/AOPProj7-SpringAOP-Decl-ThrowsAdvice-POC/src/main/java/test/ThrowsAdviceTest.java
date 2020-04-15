package test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


import com.nt.target.PriceCalculator;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PriceCalculator proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",PriceCalculator.class);
	
		//call b.method
		try {
			System.out.println("Shirt Final Price:"+proxy.calculatePrice(0.0f,0.0f,100,30,210));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
