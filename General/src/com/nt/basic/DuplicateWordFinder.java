//DuplicateWordFinder.java
package com.nt.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer stringTokenizer = null;
		Map<String, Integer> wordMap = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String line, temp = null;
		Set<String> set = null;
		wordMap = new HashMap<>();
		try {
			fileReader = new FileReader(new File("src/com/nt/basic/WordList.txt"));
			bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				stringTokenizer = new StringTokenizer(line, " ");
				while (stringTokenizer.hasMoreTokens()) {
					temp = stringTokenizer.nextToken().toLowerCase();
					if (wordMap.containsKey(temp)) {
						wordMap.put(temp, wordMap.get(temp) + 1);
					} // if
					else {
						wordMap.put(temp, 1);
					} // else
				} // while
			} // while
			set= new HashSet<String>();
			set = wordMap.keySet();
			Object[] object = set.toArray();
			for (String key : set) {
				if(wordMap.get(key)>1){
				int result = wordMap.get(key);
				System.out.println(key + "  " + result);
				}
			}
		} catch (FileNotFoundException fileNotFoundException) {
			// TODO Auto-generated catch block
			fileNotFoundException.printStackTrace();
		} catch (IOException ioException) {
			// TODO Auto-generated catch block
			ioException.printStackTrace();
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}