package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Aadhar;

public class PropertyEditorTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Aadhar aadhar=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		aadhar=ctx.getBean("uid",Aadhar.class);
		System.out.println(aadhar);
		
     //close Context
		((AbstractApplicationContext) ctx).close();

	}

}
