package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.AccountService;

public class DTxTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AccountService service=null;
		boolean flag=false;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("accountService",AccountService.class);
		try{
		//call b.method
		flag=service.transferMoney(1002,1002, 500);
		if(flag)
		  System.out.println("Money transffered(Tx committed)");
		}
		catch(Exception e){
			System.out.println("Money not Transfered(Tx RolledBack)");
		}
		///close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
