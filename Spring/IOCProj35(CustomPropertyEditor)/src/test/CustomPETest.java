package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.IntrAmtCalculator;

public class CustomPETest {

	public static void main(String[] args) {
		/*BeanFactory factory=null;
		IntrAmtCalculator calculator=null;
	
		//create IOC container
	   factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	       ((ConfigurableListableBeanFactory )factory).addPropertyEditorRegistrar(new CustomPropertyEditorRegistarar());*/
		
		ApplicationContext ctx=null;
		IntrAmtCalculator calculator=null;
		//create IOCContainer
	       ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	       
		//get Bean
		calculator=ctx.getBean("iac",IntrAmtCalculator.class);
		System.out.println("Intr Amount :::"+calculator.calcIntrAmt());
		
	}//main
	
/*  private static class CustomPropertyEditorRegistarar implements PropertyEditorRegistrar{
	  
	  @Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
	  registry.registerCustomEditor(IntrAmtDetails.class,new IntrAmtDetailsEditor());
	}
  }//inner clas
*/  
}//class
