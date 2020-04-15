package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Viechle;

public class ClientApp {

	public static void main(String[] args) {
		  BeanFactory factory=null;
		   Viechle viechle=null;
		   //create IOC container
		   factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		   viechle=factory.getBean("viechle",Viechle.class);
		   viechle.move();
		   viechle.entertainment();
		   viechle.soundHorn();
	}//main
}//class
