//Person.java
package com.nt.hashcode;

public class Person
{
String name;
int age;
Person(String name,int age)
{
this.name=name;
this.age=age;
}
/*public boolean equals(Object o)
{
if(this==o)
return true;
if(o instanceof Person)
{
Person p2=(Person)o;
if(name.equals(p2.name)&&age==p2.age)
return true;
else
return false;
}
return false;
}*/
public int hashCode(){
return name.hashCode()+age;
}
public static void main(String[] args){
Person p1=new Person("vijayabhaskar",101);
Person p2=new Person("vijayabhaskar",101);
Person p3=p1;
Integer i=new Integer(102);
System.out.println(p1.equals(p2));
System.out.println("hash code comparision"+p1.hashCode()+"----------------"+p2.hashCode());
System.out.println("hash code comparision"+p1.hashCode()+"----------------"+p3.hashCode());
System.out.println(p1.equals(i));
}}