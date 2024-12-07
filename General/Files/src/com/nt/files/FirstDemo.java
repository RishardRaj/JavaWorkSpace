//FirstDemo.java
package com.nt.files;

import java.io.File;
import java.io.IOException;

public class FirstDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileLocation = "d://practices/jse/files/abc.txt";
		File file = new File(fileLocation);
		File file1 = new File("RAJ");
		File file2 = new File(file1, "rajasekhar.pdf");
		file2.createNewFile();
		file2.createNewFile();
		System.out.println(file.exists());
		try {
			file.createNewFile();
			file1.mkdir();
			System.out.println(file.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file3 = new File("d://practices/jse/files", "demo.txt");
		file3.createNewFile();
	}

}
