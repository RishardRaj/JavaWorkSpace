//BookDAOImpl.java
package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nt.domain.Book;

public class BookDAOImpl implements BookDAO {
	private static final String BOOK_INSERT_QUERY = "INSERT INTO BOOK_DETAILS VALUES(?,?,?,?)";

	@Override
	public int insertBookDetails(Book book) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int result = 0;
		// TODO Auto-generated method stub
		// create connection with db s/w
		connection = ConnectionFactory.getConnection();
		// create PreparedStatement obj to carry bookDetails
		preparedStatement = connection.prepareStatement(BOOK_INSERT_QUERY);
		// set values to PreparedStatement Obj
		preparedStatement.setInt(1, book.getBookId());
		preparedStatement.setString(2, book.getBookName());
		preparedStatement.setString(3, book.getBookAuthor());
		preparedStatement.setFloat(4, book.getBookPrice());
		// execute Query
		result = preparedStatement.executeUpdate();
		return result;
	}// method
}// class
