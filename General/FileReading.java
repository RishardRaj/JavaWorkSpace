//FileReading.java
package com.nt.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileLocation = "filewrite.txt";
		File file = new File(fileLocation);
		FileReader fileReader = new FileReader(file);
		char ch[] = new char[(int) file.length()];
		try {
			fileReader.read(ch);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (char ch1 : ch) {
			System.out.println(ch1);
		}
		System.out.println("**************************");
		try {
			FileReader fileReader1 = new FileReader(fileLocation);
			int character = fileReader1.read();
			while (character != -1)
				System.out.print((char) character);
			character = fileReader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

