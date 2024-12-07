//CollectionSearchDemo.java
package com.nt.basic;

import java.util.*;
public class CollectionsSearchDemo
{
public static void main(String[] args)
{
ArrayList l=new ArrayList();
l.add(15);
l.add(0);
l.add(20);
l.add(10);
l.add(5);
System.out.println(l);//[15, 0, 20, 10, 5]
Collections.sort(l,new MyComparator());
System.out.println(l);//[20, 15, 10, 5, 0]
System.out.println(Collections.binarySearch(l,10,new MyComparator()));//2
System.out.println(Collections.binarySearch(l,13,new MyComparator()));//-3
System.out.println(Collections.binarySearch(l,17));//-6
}
}
class MyComparator implements Comparator
{
public int compare(Object obj1,Object obj2)
{
Integer i1=(Integer)obj1;
Integer i2=(Integer)obj2;
return i2.compareTo(i1);
}
}