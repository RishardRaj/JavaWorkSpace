package com.nt.beans;

public final class BlueDart implements Courier {

	 public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}
	@Override
	public String deliver(int orderId) {
	   return "(BlueDart)Order no::"+orderId+" items are delivered";
	}

}
