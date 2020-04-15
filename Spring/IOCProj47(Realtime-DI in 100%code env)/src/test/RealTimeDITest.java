package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.BeanConfigurator;
import com.nt.controller.StudentController;

public class RealTimeDITest {

	public static void main(String[] args) {
		//BeanFactory factory=null;
		StudentController controller=null;
		ApplicationContext ctx=null;
		String result=null;
		
		//create IOC container
		// factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		 ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		// get Controller
		controller=ctx.getBean("stController",StudentController.class);
		//call the method
		try{
			result=controller.process("167","Raja","40","50","60");
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	}//main
}//class
