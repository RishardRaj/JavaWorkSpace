//FinalizeDemo.java
package com.nt.basic;

public class FinalizeDemo
{
static FinalizeDemo s;
public static void main(String args[]) throws InterruptedException
{
FinalizeDemo finalizeDemo = new FinalizeDemo();
System.out.println(finalizeDemo.hashCode());
finalizeDemo = null;
System.gc();
Thread.sleep(5000);
System.out.println(s.hashCode());
s = null;
System.gc();
Thread.sleep(5000);
System.out.println("End of main method");
}
public void finalize()
{
System.out.println("finalize method called");
s = this;
}
}