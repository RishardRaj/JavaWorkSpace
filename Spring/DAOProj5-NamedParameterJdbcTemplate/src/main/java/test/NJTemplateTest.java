package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class NJTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		EmployeeDTO dto=null;
	   //create IOC Container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Service Bean
		service=ctx.getBean("empService",EmployeeService.class);
		//use service class
		    //prepare DTO
		dto=new EmployeeDTO();
		dto.setEno(1001); dto.setEname("rajesh"); dto.setJob("clerk"); dto.setSalary(9000);
		  System.out.println(service.registerEmpDetails(dto));
		  System.out.println("Emp name::"+service.getEmpName(7499));
		  System.out.println("Emp Details::"+service.getEmpDetailsByNo(7499));
		  //close context
		  ((AbstractApplicationContext) ctx).close();
	}//main
}//class
