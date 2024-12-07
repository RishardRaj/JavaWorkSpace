//MyFrame.java
package com.nt.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		myFrame.setSize(234, 424);
		myFrame.setVisible(true);
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
}
