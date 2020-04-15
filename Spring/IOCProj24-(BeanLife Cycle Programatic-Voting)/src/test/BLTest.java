package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.CheckVoting;

public class BLTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CheckVoting check=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get bean
		 check=ctx.getBean("voter",CheckVoting.class);
		 System.out.println(check.checkVotingEligibility());
		 //close context
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
