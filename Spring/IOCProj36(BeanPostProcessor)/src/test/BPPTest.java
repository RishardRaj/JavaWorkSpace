package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.bpp.CommonBeanPostProcessor;
import com.nt.service.StudCustService;

public class BPPTest {
	public static void main(String[] args) {
		/*ApplicationContext ctx=null;
		StudCustService service=null;
		// create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("service",StudCustService.class);
		System.out.println(service.processStudent(191,"Raja","java"));
		System.out.println(service.processCustomer(121,"rani",8999));*/
		
		BeanFactory  factory=null;
		StudCustService service=null;
		// create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//register BeanPopstProcessor explicity
		((XmlBeanFactory)factory).addBeanPostProcessor(new CommonBeanPostProcessor());
		//get Bean
		service=factory.getBean("service",StudCustService.class);
		System.out.println(service.processStudent(191,"Raja","java"));
		System.out.println(service.processCustomer(121,"rani",8999));
		
	}

}
