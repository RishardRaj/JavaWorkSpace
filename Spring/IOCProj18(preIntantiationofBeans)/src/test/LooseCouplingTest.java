package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.FlipKart;

public class LooseCouplingTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BeanFactory factory=null;
		FlipKart flipKart=null;
		//Create IOC container pointing Spring Bean cfg file.....
		ctx=new  FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		//factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//factory.getBean("flipKart");
		//get Bean
		flipKart=ctx.getBean("flipKart",FlipKart.class);
		//call b.method
		System.out.println(flipKart.shopping(new String[]{"shirt","trouser","shoe pair"}));
		
	
	}//main
}//class
