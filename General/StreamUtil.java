//StreamUtil.java
package com.nt.general;

import java.util.stream.*;
import java.util.*;

public class StreamUtil{
	public static void main(String[] args) {
		System.out.println("Hello World!");
	List<Integer> list=new ArrayList<>();
	for(int i=0;i<=10;i++){
		list.add(i);
	}
	Stream <Integer> stream=list.stream();
	/*List convertedList=stream.filter(i->i<5).collect(Collectors.toList());
	System.out.println(convertedList);*/

	//Converting stream into an array
	Integer [] intArray=stream.filter(i->i<7).toArray(Integer[] :: new);
	//display elements in that array
	for(Integer eachElement:intArray){
	System.out.println("Each Element"+eachElement);
	}
	Stream<Integer> stream1=Stream.of(10,11,13,632,6464);
	Stream<Integer> stream2=Stream.of(intArray);
	stream1.forEach(System.out::println);
	stream2.forEach(System.out::println);

	Stream<Double> stream3=Stream.generate(()->{return Math.random();});
	stream3.forEach(System.out::println);
	}
}
