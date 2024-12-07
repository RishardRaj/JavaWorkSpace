package com.nt.multithreading;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrinterUtil printerUtil1, printerUtil2 = null;
		printerUtil1 = PrinterUtil.getInstance();
		printerUtil2 = PrinterUtil.getInstance();
		System.out.println("PrinterUtil1 hash" + printerUtil1 + "PrinterUtil2 hash " + printerUtil2);
	}

}
