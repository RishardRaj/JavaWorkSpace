package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.StudentInfo;

public class DependecyCheckTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		StudentInfo stInfo=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		stInfo=factory.getBean("student",StudentInfo.class);
		System.out.println(stInfo.toString());
	}//main
}//class
