package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.FlipKart;

public class LooseCouplingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		FlipKart flipKart=null;
		//Create IOC container pointing Spring Bean cfg file.....
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		flipKart=factory.getBean("flipKart",FlipKart.class);
		//call b.method
		System.out.println(flipKart.shopping(new String[]{"shirt","trouser","shoe pair"}));
	}//main
}//class
