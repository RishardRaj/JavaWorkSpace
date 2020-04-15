package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.EmployeeService;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		//create IOC Container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("empService",EmployeeService.class);
		//call methods
		System.out.println("7499 Emp Details are"+service.findEmployeeByNo(7499));
		System.out.println("Employee Details whose desg is CLERK"+service.findEmployeesByDesg("CLERK"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
