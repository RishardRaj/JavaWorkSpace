package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		try {
			BeanFactory factory = null;
			Resource resource = null;
			Object obj = null;
			WishGenerator bean1= null,bean2=null;
			// FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
			resource = new ClassPathResource("applicationContext.xml");
			// create IOC container
			factory = new XmlBeanFactory(resource);
			// get Bean
			  bean1=factory.getBean("a1",WishGenerator.class);
			  bean2=factory.getBean("wg",WishGenerator.class);
			  System.out.println(bean1.hashCode()+"......"+bean2.hashCode());
			  System.out.println(bean1==bean2);
			 
			 
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main
}// class
