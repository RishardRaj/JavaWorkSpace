//FileMergingApp.java
package com.nt.merge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter printWriter = new PrintWriter("file3.txt");
			BufferedReader bufferedReader1 = new BufferedReader(new FileReader("file1.txt"));
			BufferedReader bufferedReader2 = new BufferedReader(new FileReader("file2.txt"));
			String line1 = bufferedReader1.readLine();
			String line2 = bufferedReader2.readLine();
			/*
			 * while (line1 != null || line2 != null) { if (line1 != null) {
			 * printWriter.println(line1); line1 = bufferedReader1.readLine(); }
			 * if (line2 != null) { printWriter.println(line2); line2 =
			 * bufferedReader2.readLine(); } }
			 */
			while (line1 != null) {
				if (line1 != null) {
					printWriter.println(line1);
					line1 = bufferedReader1.readLine();
				} // if
			} // while
			while (line2 != null) {
				if (line2 != null) {
					printWriter.println(line2);
					line2 = bufferedReader2.readLine();
				} // if
			} // while
			printWriter.flush();
			bufferedReader1.close();
			bufferedReader1.close();
			printWriter.close();
		} catch (

		FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
