package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishGenerator;
import com.nt.cfgs.BeanConfigurator;

public class PureJavaCodeTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishGenerator wish;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(BeanConfigurator.class);
		//get Bean
		wish=ctx.getBean("wish",WishGenerator.class);
		//display result
		System.out.println("Result:::"+wish.generateWishMsg("raja"));
		//close streams
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
