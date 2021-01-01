//BookServiceImpl.java
package com.nt.service;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.dao.BookDAO;
import com.nt.dao.BookDAOFactory;
import com.nt.domain.Book;
import com.nt.dto.ResponseDTO;
import com.nt.util.JerseyUtil;

@Path("books")
public class BookServiceImpl implements BookService {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/registerBook")
	@Override
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseDTO saveBookDetails(String jsonBook) throws SQLException {
		BookDAO bookDAO = null;
		int result = 0;
		String message = null;
		ResponseDTO responseDTO = null;
		Book book = null;
		// TODO Auto-generated method stub
		// create BookDAO object
		bookDAO = BookDAOFactory.getInstance();
		// convert JSON into Java Obj
		book = JerseyUtil.JSONToJavaObjectConversion(jsonBook, Book.class);
		// use bookDAO
		result = bookDAO.insertBookDetails(book);
		responseDTO = new ResponseDTO();
		if (result > 0) {
			responseDTO.setStatus((byte) 1);
			responseDTO.setData(book.getBookId());
			responseDTO.setMessage("BookDetails saved Successfully");
		} // if
		else {
			responseDTO.setMessage("Insertion BookDetails Failed,Please Try again later");
		}
		System.out.println("Service Response:" + responseDTO.getMessage());
		return responseDTO;
	}// method
}// class
