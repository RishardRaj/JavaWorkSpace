package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Voter;

public class VotingTest {
   public static void main(String[] args) {
	   ApplicationContext ctx=null;
	   Voter voter=null;
	      //create IOC container
	   ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	   //get Bean
	   voter=ctx.getBean("voter",Voter.class);
	   System.out.println(voter.checkVotingElgibility());
	  ((AbstractApplicationContext) ctx).close();
   }//main
}//class
