//FileExtraction.java
package com.nt.merge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { PrintWriter printWriter = new PrintWriter("output.txt");
		 * BufferedReader bufferedReader1 = new BufferedReader(new
		 * FileReader("input.txt")); BufferedReader bufferedReader2 = new
		 * BufferedReader(new FileReader("delete.txt")); String source =
		 * bufferedReader1.readLine(); String destination =
		 * bufferedReader2.readLine(); boolean avalible = false; while (source
		 * != null) {
		 * 
		 * if (source.equals(destination)) { avalible = true; break; } // if
		 * System.out.println("soource check" + source);
		 * System.out.println(destination); destination =
		 * bufferedReader2.readLine(); if (avalible == false) {
		 * printWriter.println(source); source = bufferedReader1.readLine();
		 * 
		 * }
		 * 
		 * } // while printWriter.flush(); bufferedReader1.close();
		 * bufferedReader2.close(); printWriter.close(); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		/////////////////////////////////////////////////////////////
		try {
			PrintWriter printWriter = new PrintWriter("output.txt");
			BufferedReader bufferedReader1 = new BufferedReader(new FileReader("input.txt"));
			String source = bufferedReader1.readLine();
			boolean availble = false;
			while (source != null) {
				BufferedReader bufferedReader2 = new BufferedReader(new FileReader("delete.txt"));
				String target = bufferedReader2.readLine();
				while (target != null) {
					if (source.equals(target)) {
						availble = true;
						break;
					} // if
					target = bufferedReader2.readLine();
					System.out.println(target);
				} // while
				if (availble == false) {
					printWriter.println(source);
					System.out.println(source);
					printWriter.flush();
				} 
				source = bufferedReader1.readLine();
			} // while

			System.out.println("Content Written");
			printWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
