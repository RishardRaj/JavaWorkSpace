package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.service.BankService;

public class TxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		boolean flag=false;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Proxy obj
		proxy=ctx.getBean("bankService",BankService.class);
		try{
			flag=proxy.transferMoney(1002,1003, 1000);
			if(flag)
				System.out.println("Money Transfered (Tx committed)");
			else
				System.out.println("Money not Transfered (Tx rolledback)");
		}//try
		catch(Exception e){
			System.out.println("Money not Transfered (Tx rolledback)");
			e.printStackTrace();
		}
		
		//close IOC
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
