//ArraySortDemo.java
package com.nt.basic;

import java.util.*;
public class ArraySortDemo
{
public static void main(String[] args)
{
int[] a={10,5,20,11,6};
System.out.println("primitive array before sorting");
for(int a1:a)
{
System.out.println(a1);
}
Arrays.sort(a);
System.out.println("primitive array after sorting");
for(int a1: a)
{
System.out.println(a1);
}
String[] s={"A","Z","B"};
System.out.println("Object array before sorting");
for(String s1: s)
{
System.out.println(s1);
}
Arrays.sort(s);
System.out.println("Object array after sorting");
for(String s1:s)
{
System.out.println(s1);
}
Arrays.sort(s,new MyComparator());
System.out.println("Object array after sorting by Comparator:");
for(String s1: s)
{
System.out.println(s1);
}
}
}
class MyComparator implements Comparator
{
public int compare(Object obj1,Object obj2)
{
String s1=obj1.toString();
String s2=obj2.toString();
return s2.compareTo(s1);
}
}