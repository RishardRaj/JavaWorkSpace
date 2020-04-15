package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.EnggCourse;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=null;
		EnggCourse cse=null,ece=null;
		//create IOC Cotainer
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		cse=factory.getBean("cse1",EnggCourse.class);
		System.out.println(cse);
		//get Bean
		ece=factory.getBean("ece1",EnggCourse.class);
		System.out.println(ece);

		
	}
}
