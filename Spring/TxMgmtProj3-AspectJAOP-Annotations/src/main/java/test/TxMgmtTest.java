package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.BankService;

public class TxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		boolean flag=false;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
		proxy=ctx.getBean("bankService",BankService.class);
		try{
			flag=proxy.transferMoney(1005,1001, 1000);
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
