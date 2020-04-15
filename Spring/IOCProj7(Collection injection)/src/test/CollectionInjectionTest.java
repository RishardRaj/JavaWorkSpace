package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Airtel;
import com.nt.beans.AsianPaints;
import com.nt.beans.Faculties;
import com.nt.beans.FruitStore;
import com.nt.beans.PersonProfile;
import com.nt.beans.Student;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		AsianPaints paints=null;
		Student  student=null;
		Airtel  airtel=null;
		Faculties faculties=null;
		FruitStore store=null;
		PersonProfile profile=null;
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		paints=factory.getBean("asian",AsianPaints.class);
		System.out.println(paints);
		//get bean
		student=factory.getBean("student",Student.class);
		System.out.println(student);
		
		//get bean
		airtel=factory.getBean("airtel",Airtel.class);
		System.out.println(airtel);
		
		//get bean
		faculties=factory.getBean("faculties",Faculties.class);
		System.out.println(faculties);
		
		//get bean
			store=factory.getBean("store",FruitStore.class);
			System.out.println(store);
			
			//get bean
			profile=factory.getBean("profile",PersonProfile.class);
			System.out.println(profile);
		
			
				
		
				
		

	}

}
