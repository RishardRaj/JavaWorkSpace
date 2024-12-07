//FileWriting.java
package com.nt.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("filewriter.txt",true);
			fileWriter.write(100);
			char ch[]={'R','A','J'};
			fileWriter.write(ch);
			fileWriter.write("\n");
			fileWriter.write("Rajasekhar Practicing Java");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
