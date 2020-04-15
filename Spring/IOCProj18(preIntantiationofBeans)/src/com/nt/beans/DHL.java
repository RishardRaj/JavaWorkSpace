package com.nt.beans;

public final class DHL implements Courier {

	 public DHL() {
		System.out.println("DHL:0-param cosntructor");
	}
	@Override
	public String deliver(int orderId) {
		 return "(DHL)Order no::"+orderId+" items are delivered";
	}

}
