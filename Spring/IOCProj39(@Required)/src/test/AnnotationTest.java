package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Robot;

public class AnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Robot robot=null;
		//create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// getBean
		 robot=ctx.getBean("robot",Robot.class);
		 System.out.println(robot);
	
	}//main
}//class
