package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Marks;

public class ConstructorParameterResolvingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		/*//get Bean
		StudentDetails details=factory.getBean("stDetails",StudentDetails.class);
		System.out.println(details);
		*/
		//get Bean
		Marks mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		
	}//main
}//class
