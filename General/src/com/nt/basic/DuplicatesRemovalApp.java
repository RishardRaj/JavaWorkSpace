//DuplicateRemovalApp.java
package com.nt.basic;

public class DuplicatesRemovalApp {
public static void duplicatesDeletion(String[] arrayElements){
	boolean isDuplicate=false;
	for(int i=0;i<arrayElements.length;i++){
		if(arrayElements[i]==arrayElements[i+1]){
			isDuplicate=true;
			break;
		}
	}
}
}
