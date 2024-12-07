//CustomImmutableClass.java
package com.nt.accessmodifiers;

final class CustomImmutableClass {
	private int i = 10;

	public CustomImmutableClass(int i) {
		this.i = i;
	}

	public CustomImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new CustomImmutableClass(i);
		}
	}
}// class
