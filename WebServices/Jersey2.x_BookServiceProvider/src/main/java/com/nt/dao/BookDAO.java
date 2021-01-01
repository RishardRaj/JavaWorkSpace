//BookDAO.java
package com.nt.dao;

import java.sql.SQLException;

import com.nt.domain.Book;

public interface BookDAO {
	public int insertBookDetails(Book book) throws SQLException;
}// interface
