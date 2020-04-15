package test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale locale=null,locale1=null;;
		String msg1=null,msg2=null,msg3=null,msg4=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//create Locale obj
		locale=new Locale(args[0],args[1]);
		//get Messages
		msg1=ctx.getMessage("str1",new Object[]{"must"},"label1",locale);
		msg2=ctx.getMessage("str2",null,"label2",locale);
		msg3=ctx.getMessage("str3",null,"label3",locale);
		msg4=ctx.getMessage("str4",null,"label4",locale);
		//create Frame
		frame=new JFrame();
		frame.setLayout(new FlowLayout());
		btn1=new JButton(msg1);
		btn2=new JButton(msg2);
		btn3=new JButton(msg3);
		btn4=new JButton(msg4);
		//add Buttons to frame window
		frame.add(btn1); frame.add(btn2); frame.add(btn3);
		frame.add(btn4);
		frame.setVisible(true);
		frame.pack();
		
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
