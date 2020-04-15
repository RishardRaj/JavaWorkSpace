package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Bike;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Bike pulsor1,pulsor2,pulsor3,basePulsor;
		//create IOC Cotainer
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		pulsor1=factory.getBean("pulsor1",Bike.class);
		System.out.println(pulsor1);
		//get Bean
			pulsor2=factory.getBean("pulsor2",Bike.class);
			System.out.println(pulsor2);
			//get Bean
			pulsor3=factory.getBean("pulsor3",Bike.class);
			System.out.println(pulsor3);
			

	}
}
