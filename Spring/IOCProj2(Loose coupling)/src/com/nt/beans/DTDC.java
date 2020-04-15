package com.nt.beans;

public final class DTDC implements Courier {

	@Override
	public String deliver(int orderId) {
	   return "(DTDC)Order no::"+orderId+" items are delivered";
	}

}
