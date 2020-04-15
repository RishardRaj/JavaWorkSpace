package test;

import java.util.Arrays;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import com.nt.aspect.CacheAdvice;
import com.nt.aspect.LogAroundAdvice;
import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.pointcut.CacheAdviceDynamicPointcut;
import com.nt.pointcut.PMAdviceStaticPointcut;
import com.nt.target.Math;

public class ProgramaticAOPTest {

	public static void main(String[] args) {
		com.nt.target.Math math = null;
		PerformanceMonitoringAdvice pmAdvice = null;
		ProxyFactory factory = null;
		com.nt.target.Math proxy = null;
		DefaultPointcutAdvisor pmAdvisor = null, cacheAdvisor = null;
		CacheAdvice cacheAdvice = null;
		NameMatchMethodPointcutAdvisor pmAdvisor1 = null;
		// create Target class obj
		math = new com.nt.target.Math();
		// create Advice class obj
		pmAdvice = new PerformanceMonitoringAdvice();
		// CreateAdvisour pointing to pointcut and PMAdvice
		pmAdvisor = new DefaultPointcutAdvisor(new PMAdviceStaticPointcut(), pmAdvice);

		pmAdvisor1 = new NameMatchMethodPointcutAdvisor();
		pmAdvisor1.setAdvice(pmAdvice);
		pmAdvisor1.addMethodName("add");
		pmAdvisor1.addMethodName("mul");

		// CreateAdvisour pointing to pointcut and CacheAdvice
		cacheAdvice = new CacheAdvice();
		cacheAdvisor = new DefaultPointcutAdvisor(new CacheAdviceDynamicPointcut(), cacheAdvice);
		// Generate proxy class obj
		factory = new ProxyFactory();
		factory.setTarget(math);

		//factory.addAdvice(pmAdvice);
		factory.addAdvisor(pmAdvisor);
		//factory.addAdvisor(pmAdvisor1);
		factory.addAdvisor(cacheAdvisor);
		//factory.addAdvice(new LogAroundAdvice());

		proxy = (Math) factory.getProxy();
		// call b.methods
		System.out.println("add=" + proxy.add(1000, 2000));
		System.out.println("==========================");
		System.out.println("add=" + proxy.add(1000, 2000));
		System.out.println("==========================");
		System.out.println("add=" + proxy.add(10, 20));
		System.out.println("==========================");
		System.out.println("sub=" + proxy.sub(10, 20));
		System.out.println("==========================");
		System.out.println("mul=" + proxy.mul(2000, 2000));
		System.out.println("==========================");
		System.out.println("mul=" + proxy.mul(2000, 2000));
		System.out.println("==========================");

		System.out.println("div=" + proxy.div(20, 10));
		System.out.println("==========================");
		System.out.println(Arrays.toString(proxy.getClass().getDeclaredMethods()));
	}// main
}// class
