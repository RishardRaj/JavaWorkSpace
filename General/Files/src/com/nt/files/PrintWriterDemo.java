//PrintWriterDemo.java
package com.nt.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("printwrite.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.write(100);
			printWriter.println(100);
			printWriter.println(true);
			printWriter.println('c');
			printWriter.write("Hai I am Using PrintWriter");
			printWriter.write(
					"The most enhanced writer is for character data is PrintWriter and for reading BufferedReader is best choice");
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
