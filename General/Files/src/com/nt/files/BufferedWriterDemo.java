//BufferedWriterDemo.java
package com.nt.files;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		String fileLocation = "filewrite1.pdf";
		Writer writer = null;
		try {
			writer = new FileWriter(fileLocation);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(100);
			bufferedWriter.newLine();
			char ch[] = new char[] { 's', 'f', 'g' };
			bufferedWriter.write(ch);
			bufferedWriter.newLine();
			bufferedWriter.write("Rajasekhar is Practicing Java Files Concept");
			bufferedWriter.flush();
			bufferedWriter.close();
			System.out.println("Writing Data to file is Successful");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
