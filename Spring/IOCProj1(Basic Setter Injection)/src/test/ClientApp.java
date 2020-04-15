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
			WishGenerator bean = null;
			// Locate Spring Bean cfg file
			// resource=new
			// FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
			resource = new ClassPathResource("applicationContext.xml");
			// create IOC container
			factory = new XmlBeanFactory(resource);
			//getBean 
			bean=factory.getBean("wish",WishGenerator.class);
			System.out.println(bean.generateWishMsg("raja"));

		/*	bean = factory.getBean("com.nt.beans.WishGenerator#0", WishGenerator.class);
			// Call B.method...
			System.out.println("Wish Message::::" + bean.generateWishMsg("raja"));*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main
}// class
