//Emp.java
package com.nt.basic;

public class Emp implements Comparable{

	String name;
	int eid;

	Emp(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + "----" + eid;
	}

	@Override
	public int compareTo(Object object) {
		// TODO Auto-generated method stub
		int eid1 = this.eid;
		int eid2 = ((Emp) object).eid;
		if (eid1 < eid2) {
			return -1;
		} else if (eid > eid2) {
			return 1;
		} else
			return 0;
	}
}
