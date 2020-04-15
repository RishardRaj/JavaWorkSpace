package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;

public class RealTimeDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		StudentController controller=null;
		ApplicationContext ctx=null;
		String result=null;
		PropertyPlaceholderConfigurer pphc=null;
		
		//create IOC container
		 factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		 //get pphc bean obj
		 pphc=factory.getBean("pphc",PropertyPlaceholderConfigurer.class);
		 pphc.postProcessBeanFactory((ConfigurableListableBeanFactory) factory);
		// ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Controller
		controller=factory.getBean("controller",StudentController.class);
		//call the method
		try{
			result=controller.process("114","Raja","40","50","60");
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	}//main
}//class
