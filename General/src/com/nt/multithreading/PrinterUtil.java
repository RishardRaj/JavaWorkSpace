package com.nt.multithreading;

public class PrinterUtil extends CommonsUtil {
	private static PrinterUtil printerUtil = null;
	private boolean isInstantiated = true;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PrinterUtil() throws Exception {
		if (isInstantiated) {
			isInstantiated = false;
		} else {
			throw new Exception();
		}
		System.out.println("PrinterUtil 0-param Constructor");
		// TODO Auto-generated constructor stub
	}

	public static PrinterUtil getInstance() {
		if (printerUtil == null) {
			synchronized (PrinterUtil.class) {
				if (printerUtil == null) {
					try {
						printerUtil = new PrinterUtil();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} // synchronized
		}
		return printerUtil;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}

	public Object readResolve() throws Exception {
		System.out.println("PrintUtil:readResolve()");
		throw new Exception();
	}
}
