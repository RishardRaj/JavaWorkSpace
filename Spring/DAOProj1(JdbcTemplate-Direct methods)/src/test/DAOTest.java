package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.DBOperationsService;

public class DAOTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DBOperationsService  service=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("service",DBOperationsService.class);
		/*try{
			//register Emp
			System.out.println("Emp Registered?"+service.registerEmp(1111, "raja", "clerk", 5000));
		}
		catch(Exception e){
			System.out.println("Emp Registration failed");
			e.printStackTrace();
		}*/
		System.out.println("7499 Emp Salary"+service.getSalary(7499));
		System.out.println("7499 Emp Salary hike by 10%"+service.hikeEmpSalary(7499, 10));
		System.out.println("7499 Emp Details"+service.getEmpDetails(7499));
		System.out.println("CLERK Desg Emp Details"+service.getEmpDetailsByDesg("CLERK"));
		System.out.println("Fire Emp 1001"+service.fireEmp(1001));
      //stop container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
