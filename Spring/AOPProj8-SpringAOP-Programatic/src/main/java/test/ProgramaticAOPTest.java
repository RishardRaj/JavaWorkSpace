package test;

import java.util.Arrays;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.aspect.CacheAdvice;
import com.nt.aspect.LogAroundAdvice;
import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.target.Math;

public class ProgramaticAOPTest {

	public static void main(String[] args) {
	com.nt.target.Math math=null;
	PerformanceMonitoringAdvice pmAdvice=null;
	ProxyFactory  factory=null;
	com.nt.target.Math proxy=null;
	// create Target class obj
     math=new com.nt.target.Math();
     //create Advice class obj
     pmAdvice=new PerformanceMonitoringAdvice();
     //Generate proxy class obj
     factory=new ProxyFactory();
     factory.addAdvice(new CacheAdvice());
     factory.setTarget(math);
     factory.addAdvice(pmAdvice);
     factory.addAdvice(new LogAroundAdvice());
      proxy=(Math) factory.getProxy();
     //call b.methods
     System.out.println("add="+proxy.add(10,20));
     System.out.println("==========================");
     System.out.println("add="+proxy.add(10,20));
     System.out.println("==========================");
     System.out.println("sub="+proxy.sub(10,20));
     System.out.println("==========================");
     System.out.println("mul="+proxy.mul(20,20));
     System.out.println("==========================");
     System.out.println("div="+proxy.div(20,10));
     System.out.println("==========================");
     System.out.println(Arrays.toString(proxy.getClass().getDeclaredMethods()));
	}//main
}//class
