package test;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.service.StudentServiceImpl;

public class PsBatchTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 StudentService service=null;
		 Scanner sc=null;
		 StudentDTO dto=null;
		 List<StudentDTO> listDTO=null;
		 int count=0;
		 int no=0;
		 String name=null,addrs=null;
		 String result=null;
		 
		 
		 //create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 //get Bean
		 service=ctx.getBean("stService",StudentServiceImpl.class);
		 
		 //read student count
		 sc=new Scanner(System.in);
		 System.out.println("Enter  Student Count");
		 count=sc.nextInt();
		 
		 //gather student details from enduser
		 listDTO=new ArrayList<StudentDTO>();
		 for(int i=1;i<=count;++i){
		   System.out.println("Enter "+i+" student details");
		   System.out.println("enter no");
		   no=sc.nextInt();
		   System.out.println("enter name");
		   name=sc.next();
		   System.out.println("enter address");
		   addrs=sc.next();
		   //add each student details to DTO obj
		   dto=new StudentDTO();
		   dto.setSno(no);  dto.setSname(name); dto.setSadd(addrs);
          //add listDTO
		   listDTO.add(dto);
		 }//for
		 //use Service class
		  result=service.registerStudents(listDTO);
         System.out.println(result);
         
         //close ctx
         ((AbstractApplicationContext) ctx).close();
	}//main
}//class
