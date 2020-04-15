package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.B;

public class CyclicDepdencyTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		B  bean=null;
		//Create IOContainer
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		bean=factory.getBean("b",B.class);
	}

}
