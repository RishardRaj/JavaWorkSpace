package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.domain.Book;
import com.nt.dto.ResponseDTO;
import com.nt.service.BookServiceClient;

public class BookController extends HttpServlet {
	private BookServiceClient bookServiceClient;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		bookServiceClient = new BookServiceClient();
	}// init()

	@Override
	public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Book book = null;
		BookServiceClient bookServiceClient = null;
		RequestDispatcher requestDispatcher = null;
		ResponseDTO responseDTO = null;
		book = new Book();
		book.setBookId(Integer.parseInt(httpServletRequest.getParameter("bookId")));
		book.setBookName(httpServletRequest.getParameter("bookName"));
		book.setBookAuthor(httpServletRequest.getParameter("bookAuthor"));
		book.setBookPrice(Float.parseFloat(httpServletRequest.getParameter("bookPrice")));
		// use BookServiceClient
		responseDTO = bookServiceClient.saveBookDetails(book);
		// place responseDTO in request scope
		httpServletRequest.setAttribute("responseDTO", responseDTO);
		// forward request to jsp
		requestDispatcher = httpServletRequest.getRequestDispatcher("/index.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);
	}// method
	@Override
	public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doGet(httpServletRequest, httpServletResponse);
	}//method
}// class
