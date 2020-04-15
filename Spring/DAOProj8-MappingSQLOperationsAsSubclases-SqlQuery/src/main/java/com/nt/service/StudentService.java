package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentService {

	public List<StudentDTO>  seachStudentByAddrs(String addrs);
}
