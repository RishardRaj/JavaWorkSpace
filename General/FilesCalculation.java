//FilesCalculation.java
package com.nt.files;

import java.io.File;

public class FilesCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("d://practices/jse");
		String[] allFiles=file.list();
		int count=0;
		for(int i=0;i<allFiles.length;i++)
		{
			count++;
			System.out.println(allFiles[i]);
		}
		System.out.println(count);	
	}

}
