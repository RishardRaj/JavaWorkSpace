//BufferedReaderDemo.java
package com.nt.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		String fileLocation = "E:\\Received\\Others\\Raviteja\\SCJP Durgasoft.pdf";
		try {
			FileReader fileReader = new FileReader(fileLocation);
			BufferedReader bufferedReader = new BufferedReader(fileReader,5466);
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.print(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
