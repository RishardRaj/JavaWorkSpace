package com.nt.beans;

public final class DHL implements Courier {

	@Override
	public String deliver(int orderId) {
		 return "(DHL)Order no::"+orderId+" items are delivered";
	}

}
