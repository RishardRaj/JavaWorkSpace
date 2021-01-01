//BookService.java
package com.nt.service;

import java.sql.SQLException;

import com.nt.domain.Book;
import com.nt.dto.ResponseDTO;

public interface BookService {
	ResponseDTO saveBookDetails(String jsonBook) throws SQLException;
}// interface
