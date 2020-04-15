package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;

public class RealTimeDITest {

	public static void main(String[] args) {
		BeanFactory parentFactory = null, childFactory = null;
		StudentController controller = null;
		String result = null;
		// create Parent IOC container
		parentFactory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/business-beans.xml"));
		// create Parent IOC container as NestedContainer
		childFactory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/presentation-beans.xml"),
				parentFactory);
		// get Controller Bean
		try {
			controller = childFactory.getBean("controller", StudentController.class);
			result = controller.process("1015", "ravi", "90", "90", "60");
			System.out.println("Final Result::" + result);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}

	}// main
}// class

