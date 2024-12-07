//CombinatorApp.java
package com.nt.basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*To Test this app pass command line arguments separated by space*/
public class CombinatorApp {
	public static void main(String[] args) {
		// LinkedHashMap for preserving insertion order and to eliminate
		// duplicates
		Map<String, String> wordMap = new LinkedHashMap<>();
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++) {
			String word = args[i];
			wordMap.put(word + "" + i, args[i]);
			System.out.println(wordMap);
		}
		Set<String> wordKeys = wordMap.keySet();
		//for (int i = 0; i < wordKeys.size(); i++) {
			Iterator<String> keysCursor = wordKeys.iterator();
			while (keysCursor.hasNext()) {
				String first[] = new String[] { wordMap.get(keysCursor.next()) };
				// Element Interchanging logic here
				for(int i=0;i< first.length;i++){
					for(int j=first.length-1;j>=0;j--){
						first[i]=first[j];
					}
				}
				System.out.println(Arrays.toString(first));
			}
		//}
	}
}
