package com.nt.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExtractionDemo {
	public static void main(String[] args) {
		FileReader fileReader;
		try {
			fileReader = new FileReader("input.txt");
			BufferedReader bufferedReaderferedReader = new BufferedReader(fileReader, 32);
			try {
				while (bufferedReaderferedReader.readLine() != null) {
					System.out.println(bufferedReaderferedReader.readLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
