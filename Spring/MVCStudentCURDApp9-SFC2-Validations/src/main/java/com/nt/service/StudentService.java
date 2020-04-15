package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentService {
	public String register(StudentDTO dto);
	public List<StudentDTO> listStudents();
	public StudentDTO  retriveStudentByNo(int no);
	public  String modifyStudentByNo(StudentDTO dto);

}
