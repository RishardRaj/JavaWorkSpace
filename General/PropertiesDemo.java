//PropertiesDemo.java
package com.nt.basic;

import java.util.*;
import java.io.*;
public class PropertiesDemo
{
public static void main(String[] args)throws Exception
{
Properties p=new Properties();
FileInputStream fis=new FileInputStream("abc.properties");
p.load(fis);
System.out.println(p);//{user=scott, password=tiger, venki=8888}
String s=p.getProperty("venki");
System.out.println(s);//8888
p.setProperty("raja",""+2000);
s=p.getProperty("raja");
System.out.println(s);//8888
Enumeration e=p.propertyNames();
while(e.hasMoreElements())
{
String s1=(String)e.nextElement();
System.out.println(s1);//nag
//user
//password
//venki
}
FileOutputStream fos=new FileOutputStream("abc.properties");
p.store(fos,"updated by bhaskar for scjp demo class");
}
}