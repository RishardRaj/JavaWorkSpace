package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.StudentService;

public class ClientApp {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 StudentService service=null;
		 
		//Create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("stService",StudentService.class);
		//display results
		System.out.println("101 sutdent details"+service.getStudentByNo(101));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
