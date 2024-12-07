//FinalizeTest.java
package com.nt.basic;

public class FinalizeTest
{
public static void main(String arg[])
{
FinalizeTest finalizeTest = new FinalizeTest();
//finalizeTest.finalize();
finalizeTest = null;
System.gc();
System.gc();
System.out.println("End of main method");
}
public void finalize()
{
System.out.println("finalize method");
System.out.println(10/0);
}
}