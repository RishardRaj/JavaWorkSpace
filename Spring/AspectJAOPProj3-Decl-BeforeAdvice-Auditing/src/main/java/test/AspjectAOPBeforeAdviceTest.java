package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspect.AuditingAspect;
import com.nt.target.LoanApprover;

public class AspjectAOPBeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		LoanApprover proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
       proxy=ctx.getBean("approver",LoanApprover.class);
       //call method
       System.out.println("Loan Status"+proxy.approveLoan(1001,"agriculture"));
       
       AuditingAspect proxy1=ctx.getBean("auditAspect",AuditingAspect.class);
       System.out.println(proxy1.getClass());
       
       //close stream
       ((AbstractApplicationContext) ctx).close();
	}

}
