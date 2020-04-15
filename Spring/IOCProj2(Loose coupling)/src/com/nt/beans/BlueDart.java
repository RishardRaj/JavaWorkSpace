package com.nt.beans;

public final class BlueDart implements Courier {

	@Override
	public String deliver(int orderId) {
	   return "(BlueDart)Order no::"+orderId+" items are delivered";
	}

}
