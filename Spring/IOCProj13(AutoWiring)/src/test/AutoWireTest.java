package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.TravelAgent;

public class AutoWireTest {

	public static void main(String[] args) {
		BeanFactory factory = null;
		TravelAgent agent = null;
		// create IOC contuiner
		factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		// get Bean
		agent = factory.getBean("agent", TravelAgent.class);
		agent.executeTourPlan();
	}// main
}// class
