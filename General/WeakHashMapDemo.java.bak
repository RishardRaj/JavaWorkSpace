//WeakHashMapDemo.java
package com.nt.basic;

import java.util.*;
public class WeakHashMapDemo
{
public static void main(String[] args)throws Exception
{
WeakHashMap m=new WeakHashMap();
Temp t=new Temp();
m.put(t,"bhaskar");
System.out.println(m);//{Temp=bhaskar}
t=null;
System.gc();
Thread.sleep(5000);
System.out.println(m);//{}
}
}
class Temp
{
public String toString()
{
return "Temp";
}
public void finalize()
{
System.out.println("finalize() method called");
}
}