//MapMaxDemo.java
package com.nt.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapMaxDemo {

	public static <T> void main(String[] args) {
		int arr[]={1,23,1,123,12,12,546,3,3,5,6,3,3,4};
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 5);
		/*// Approach 1
		Integer maxValue = Collections.max(map.values());
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxValue) {
				System.out.println(" // Approach1 Max Entry in Map " + entry.getKey() + " " + entry.getValue());
			}
		} // for
		
*/		// Approach2
		Entry<String, Integer> maxEntry = null;
		for(Entry<String, Integer> entry : map.entrySet()){
		if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 1) {
			maxEntry = entry;
			System.out.println("// Approach2 Max Entry in Map " + entry.getKey() + " " + entry.getValue());
		}
		}
		//Approach3
		String MaxKeyElement=Collections.max(map.entrySet(), new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> e1,Entry<String, Integer> e2) {
				// TODO Auto-generated method stub
				return e1.getValue()>e2.getValue() ? 1 :-1;
			}
		}).getKey();
		System.out.println("// Approach3 Max Entry in Map " +MaxKeyElement+" "+ map.get(MaxKeyElement));
		//Approach4-- JAVA8
		String max = map.entrySet().stream().max((e1,e2)->e1.getValue()>e2.getValue()?1:-1).get().getKey();
		System.out.println("// Approach4 Max Entry in Map " +MaxKeyElement+" "+ map.get(MaxKeyElement));
		//Approach 5--Java 8
		Arrays.stream(arr).boxed().collect(Collectors.toMap(Function.identity(), Collectors.counting()));
		List numList=Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer,Long>  map=numList.parallelStream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}

}
			
