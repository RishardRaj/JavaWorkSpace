package test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class FactoryMethodsTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Class clazz=null;
		Calendar calendar=null;
		String s2,s3=null;
	  //create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	  //get Bean
		clazz=factory.getBean("c",Class.class);
		System.out.println(clazz.getClass()+"....Data:"+clazz);
		System.out.println("-------------------------------------");
		//getBean
		calendar=factory.getBean("cl",Calendar.class);
		System.out.println(calendar.getClass()+"....data:"+calendar);
		System.out.println("-----------------------------------");
		//get Bean
		s2=factory.getBean("s2",String.class);
		System.out.println(s2.getClass()+"......data:"+s2);
		System.out.println("-----------------------------------");
		//getBean
		s3=factory.getBean("s3",String.class);
		System.out.println(s3.getClass()+".....data"+s3);
	}//main
}//class
