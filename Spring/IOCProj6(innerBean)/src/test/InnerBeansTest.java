package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.CarMotor;

public class InnerBeansTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		CarMotor motor=null;
		//Create IOContainer
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		motor=factory.getBean("motor",CarMotor.class);
		System.out.println(motor);
             
	}

}
