//RegularExpressionDemo.java
package com.nt.basic;

import java.util.regex.*;
class RegularExpressionDemo
{
public static void main(String[] args)
{
Pattern p=Pattern.compile("\\w
");
Matcher m=p.matcher("a1b7@z#");
while(m.find())
{
System.out.println(m.start()+"-------"+m.group());
}
}
}