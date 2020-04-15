package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Dept;

public class PAndCNameSpaceTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
	    Dept dept=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
        //get bean
		dept=factory.getBean("dept",Dept.class);
		System.out.println(dept);
	}//main
}//class

