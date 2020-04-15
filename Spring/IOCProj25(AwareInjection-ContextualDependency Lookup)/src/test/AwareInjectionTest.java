package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AwareInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Viechle viechle=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Bean
		viechle=ctx.getBean("viechle",Viechle.class);
		//use Viechle
		viechle.move();
		viechle.entertaiment();

	}

}
