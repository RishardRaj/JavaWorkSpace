//BookDAOFactory.java
package com.nt.dao;

public class BookDAOFactory {
	public static BookDAO getInstance() {
		return new BookDAOImpl();
	}// method
}// class
