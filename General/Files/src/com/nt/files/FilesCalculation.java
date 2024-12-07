//FilesCalculation.java
package com.nt.files;

import java.io.File;

public class FilesCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "E:\\Received\\Others\\Raviteja\\SCJP Durgasoft.pdf";
		String fileName1 = "H:\\Movies\\Kabali (2016) Telugu 1080p WEB-DL x264 AAC - RDLinks Exclusive";
		File file = new File("d://practices/jse");
		File file2 = new File(fileName);
		File file3 = new File(fileName1);
		System.out.println(file2.length());
		System.err.println("==================");
		System.out.println(file3.length());
		String[] allFiles = file.list();
		int count = 0;
		for (int i = 0; i < allFiles.length; i++) {
			count++;
			System.out.println(allFiles[i]);
		}
		System.out.println(count);
	}

}
